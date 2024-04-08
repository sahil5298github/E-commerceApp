package com.users;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

import com.db.connections.DbConnection;

public class SelectAllUsers {

	Connection conn = null;

	public void selectUserDetails() {
		DbConnection dbConn = new DbConnection();
		conn = dbConn.getConnection();
		String query = "select * from users";
		try {
			PreparedStatement ps = conn.prepareStatement(query);

			ResultSet rs = ps.executeQuery();
			ArrayList<Users> al = new ArrayList<Users>();
			while (rs.next()) {

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
			Iterator<Users> itr = al.iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next());
				System.out.println();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}