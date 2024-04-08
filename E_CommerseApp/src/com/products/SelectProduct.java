package com.products;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.db.connections.DbConnection;
import com.mysql.cj.protocol.Resultset;

public class SelectProduct {
	Connection conn = null;

	public void selectProdDetails(int id) {
		DbConnection dbConn = new DbConnection();
		conn = dbConn.getConnection();
		String query = "select * from products where p_id=?";
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			ArrayList<Products> al = new ArrayList<Products>();
			while (rs.next()) {

				Products prod = new Products();

				prod.setName(rs.getString(3));
				prod.setDesc(rs.getString(2));
				prod.setPrice(rs.getDouble(4));
				prod.setQuantity(rs.getInt(5));

				al.add(prod);

			}

			for (Object obj : al) {
				System.out.println(al);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
