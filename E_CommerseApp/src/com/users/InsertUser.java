package com.users;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.db.connections.DbConnection;

public class InsertUser {
	Connection conn = null;

	public void insertUserDetails(String firstName, String lastName, String userName, String pass, String city,
			String email, long moNum) {
		DbConnection dbConn = new DbConnection();
		conn = dbConn.getConnection();
		String query = "insert into users(firstName, lastName, userName, pass, city, email, moNum) values(?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, firstName);
			ps.setString(2, lastName);
			ps.setString(3, userName);
			ps.setString(4, pass);
			ps.setString(5, city);
			ps.setString(6, email);
			ps.setLong(7, moNum);

			int i = ps.executeUpdate();
			if (i >= 1) {
				System.out.println("User Added Successfully...!!!");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void userRegistration() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Users Details");
		System.out.println("Fist Name");
		String firstName = s.nextLine();
		System.out.println("Last Name");
		String lastName = s.nextLine();
		System.out.println("User Name");
		String userName = s.nextLine();
		System.out.println("Password");
		String pass = s.nextLine();
		System.out.println("City");
		String city = s.nextLine();
		System.out.println("Email");
		String email = s.nextLine();
		System.out.println("Mobile Number");
		long moNum = s.nextLong();

		Users user = new Users();
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setUserName(userName);
		user.setPass(pass);
		user.setCity(city);
		user.setEmail(email);
		user.setMoNum(moNum);

		InsertUser insertUser = new InsertUser();
		insertUser.insertUserDetails(user.getFirstName(), user.getLastName(), user.getUserName(), user.getPass(),
				user.getCity(), user.getEmail(), user.getMoNum());
	}
}
