package arraylist;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;

public class FetchPerson {
	
	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM person");
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				Person p = new Person();
				
				p.setAge(rs.getInt("age"));
				p.setName(rs.getString("name"));
				p.setCity(rs.getString("city"));
				
				list.add(p);
			}
			
			Iterator<Person> i = list.iterator();
			
			while (i.hasNext()) {
				Person p = i.next();
				System.out.println("name : " + p.getName() + ", age : " + p.getAge() + ", city : " + p.getCity());
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
