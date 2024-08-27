package com.wipro.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) {

		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/wipro_db", "root", "admin");

			Statement stmt = conn.createStatement(); // for static queries

			
			String query = " insert into Employees values(102,'tom',30000) ";
			
			int count = stmt.executeUpdate(query);

			System.out.println(count + "  Records affected");

			conn.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
