package com.products;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.db.connections.DbConnection;

public class ViewCard {
	Connection conn = null;
	Scanner s = new Scanner(System.in);

	public void viewCardDetails() {
		DbConnection dbConn = new DbConnection();
		conn = dbConn.getConnection();
		String query = "select * from products";
		ArrayList<Products> al = new ArrayList<Products>();
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Products prod = new Products();

				prod.setId(rs.getInt(1));
				prod.setName(rs.getString(3));
				prod.setDesc(rs.getString(2));
				prod.setPrice(rs.getDouble(4));
				prod.setQuantity(rs.getInt(5));

				al.add(prod);
			}
			System.out.println(al);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
}
