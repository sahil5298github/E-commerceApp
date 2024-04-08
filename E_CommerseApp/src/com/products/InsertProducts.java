package com.products;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.db.connections.DbConnection;
import com.mysql.cj.protocol.Resultset;

public class InsertProducts {
	Connection conn = null;

	public void insertProdDetails(String name, String desc, double price, int quantity) {
		DbConnection dbConn = new DbConnection();
		conn = dbConn.getConnection();
		String query = "insert into products(p_name, p_desc, price, quantity) values(?,?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, name);
			ps.setString(2, desc);
			ps.setDouble(3, price);
			ps.setInt(4, quantity);
			int id = ps.executeUpdate();
			if (id >= 1) {
				System.out.println("Product Added Successfully...!!!");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
