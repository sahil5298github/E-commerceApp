package com.products;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.db.connections.DbConnection;

public class ViewAllProducts {
	Connection conn = null;

	public void viewAllProducts() {
		DbConnection dbConn = new DbConnection();
		conn = dbConn.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("select p_id, p_desc, p_name, price, quantity from products");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Products prod = new Products();
				prod.setId(rs.getInt(1));
				prod.setName(rs.getString(3));
				prod.setDesc(rs.getString(2));
				prod.setPrice(rs.getDouble(4));
				prod.setQuantity(rs.getInt(5));

				System.out.println(prod);
				System.out.println("\n");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
