import java.sql.*;

public class InsertDataWithPrep {
	public static void main(String[] args) {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
			PreparedStatement ps = conn.prepareStatement("INSERT INTO student(id, name) VALUES(?, ?)");
			
			ps.setInt(1, 6);
			ps.setString(2, "Mohit); DROP TABLE student;");
			
			int affectedRows = ps.executeUpdate();
			
			if(affectedRows > 0) {
				
				System.out.println("Data inserted");
			}
		} catch(Exception e) {
			
			e.printStackTrace();
		}
	}
}
