package hashmap;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map.Entry;

public class TestPerson {
	
	public static void main(String[] args) {
		HashMap<Integer, Person> map = new HashMap<>();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?user=root&password=root");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM person");
			
			while (rs.next()) {
				map.put(rs.getInt("id"), new Person(rs.getInt("age"), rs.getString("name"), rs.getString("city")));
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		for (Entry<Integer, Person> ent : map.entrySet()) {
			System.out.println("Person " + ent.getKey() + ": " + ent.getValue().name + ", age = " + ent.getValue().age + ", city = " + ent.getValue().city);
		}
	}
}
