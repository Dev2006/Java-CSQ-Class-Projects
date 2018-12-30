import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class DataFetcher {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaday26?user=root&password=root");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM food WHERE cuisine LIKE 'I%';");
			
			while (rs.next()) 
				System.out.println("ID : " + rs.getInt("id") + ", Name : " + rs.getString("name") + ", Cuisine : " + rs.getString("cuisine") + ", Size : " + rs.getString("size"));
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
