package jdbc;

import java.sql.*;

public class SetConnection {
	
	private static final String cuisine = null;

	public static void main(String[] args) {
		
		addVals(1, "Pizza", "Italian", "XL");
		addVals(2, "Spaghetti", "Italian", "S");
		addVals(3, "Butter Chicken", "Indian", "L");
	}
	
	static void addVals(int id, String name, String cuisine, String size) {
		
		try {
			Connection con = null;
			
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaday26", "root", "root");
			
			Statement stmt = con.createStatement();
			int insertData = stmt.executeUpdate("insert into food(id, name, cuisine, size) values(" + '"' + id + '"' + "," + '"' + name + '"' + ',' + '"' + cuisine + '"' + ',' + '"' + size + '"' + ")");
			
			if (insertData > 0) {
				
				System.out.println("Data Inserted");
			} else {
				
				System.out.println("Not Inserted");
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}