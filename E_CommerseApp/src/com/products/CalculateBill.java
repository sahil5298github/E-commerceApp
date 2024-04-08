package com.products;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.db.connections.DbConnection;

public class CalculateBill {
	Connection conn = null;

	public void calculateProdBill(int id) {
		Products prod = new Products();
		DbConnection dbConn = new DbConnection();
		conn = dbConn.getConnection();
		String query = "select * from products where p_id=?";
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setDouble(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				prod.setPrice(rs.getDouble("price"));
				prod.setQuantity(rs.getInt("quantity"));
				prod.setName(rs.getString("p_name"));
				prod.setDesc(rs.getString("p_desc"));
			}
			double price = prod.getPrice();
			int quantity = prod.getQuantity();
			double bill = price * quantity;
			System.out.println("Product Name : " + prod.getName());
			System.out.println("Product Description : " + prod.getDesc());
			System.out.println("Product Amount : " + prod.getPrice());
			System.out.println("Product Bill = " + bill);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
