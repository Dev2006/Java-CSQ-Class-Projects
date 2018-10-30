import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

public class DatabaseInfo {
	
	public static void main(String[] args) {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
			DatabaseMetaData dbmd = conn.getMetaData();
			
			System.out.println("Name : " + dbmd.getDatabaseProductName());
			System.out.println("Version : " + dbmd.getDatabaseProductVersion());
			System.out.println("Driver : " + dbmd.getDriverName());
			System.out.println("Username : " + dbmd.getUserName());
			System.out.println("URL : " + dbmd.getURL());
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
