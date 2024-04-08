package com.users;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.db.connections.DbConnection;

public class SelectUser {
	Connection conn = null;

	public void selectUserDetails(int userId) {
		DbConnection dbConn = new DbConnection();
		conn = dbConn.getConnection();
		String query = "select * from users where userId=?";
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, userId);
			ResultSet rs = ps.executeQuery();
			ArrayList<Users> al = new ArrayList<Users>();
			while (rs.next()) {
//				System.out.println("User Details Are : ");
//				System.out.println("First Name : " + rs.getString(2));
//				System.out.println("Last Name : " + rs.getString(3));
//				System.out.println("User Name : " + rs.getString(8));
//				System.out.println("Password : " + rs.getString(4));
//				System.out.println("City : " + rs.getString(5));
//				System.out.println("Email Id : " + rs.getString(6));
//				System.out.println("Mobile Number : " + rs.getString(7));

				Users user = new Users();
				user.setFirstName(rs.getString(2));
				user.setLastName(rs.getString(3));
				user.setUserName(rs.getString(8));
				user.setPass(rs.getString(4));
				user.setCity(rs.getString(5));
				user.setEmail(rs.getString(6));
				user.setMoNum(rs.getLong(7));

				al.add(user);
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
