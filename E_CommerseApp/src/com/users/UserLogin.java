package com.users;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.db.connections.DbConnection;

public class UserLogin {
	Connection conn = null;

	public void userLogin(String userName1, String pass1) {
		DbConnection dbConn = new DbConnection();
		conn = dbConn.getConnection();
		String query = "select * from users where userName=? AND pass=?";
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, userName1);
			ps.setString(2, pass1);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				String uName = rs.getString("userName");
				String pass = rs.getString("pass");
				if ((uName.equals(userName1)) && (pass.equals(pass1))) {
					System.out.println("Login successful...!!!");
				} else {
					System.out.println("User Not Found..!!");
				}
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
