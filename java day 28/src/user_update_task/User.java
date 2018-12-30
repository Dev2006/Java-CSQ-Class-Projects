package user_update_task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class User {
	
	public static void main(String[] args) {
		
		System.out.println("Press 1 to register a new account\n"
				+ "Press 2 to login to your account");
		
		main:while(true) {
			
			int option = Integer.parseInt(JOptionPane.showInputDialog("Enter your option"));
			
			switch (option) {
			case 1:
				User.register();
				break;
			case 2:
				User.login();
				break;
			default:
				break main;
			}
		}
	}
	
	static void register() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaday28", "root", "root");
			PreparedStatement ps = conn.prepareStatement("INSERT INTO user(username, password, email, mobile, city) VALUES(?, ?, ?, ?, ?)");
			
			String username = JOptionPane.showInputDialog("Enter a username");
			String password = JOptionPane.showInputDialog("Enter a password");
			String email = JOptionPane.showInputDialog("Enter a email");
			String mobile = JOptionPane.showInputDialog("Enter a mobile");
			String city = JOptionPane.showInputDialog("Enter a city");
			
			ps.setString(1, username);
			ps.setString(2, password);
			ps.setString(3, email);
			ps.setString(4, mobile);
			ps.setString(5, city);
			
			int affectedRows = ps.executeUpdate();
			
			if(affectedRows > 0) {
				
				System.out.println("New user created");
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	static void login() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaday28", "root", "root");
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM user WHERE username = ? AND password = ?");
			
			String username = JOptionPane.showInputDialog("Enter your username");
			String password = JOptionPane.showInputDialog("Enter your password");
			
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			
			int i;
			for(i = 0; rs.next(); i++);
			if(i > 0) {
				System.out.println("You have successfully logged in");
				User.update(username);
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	static void update(String username) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaday28", "root", "root");
			PreparedStatement ps = conn.prepareStatement("UPDATE user SET password = ?, email = ?, mobile = ?, city = ? WHERE username = ?");
			
			String password = JOptionPane.showInputDialog("Enter your new password");
			String email = JOptionPane.showInputDialog("Enter your new email");
			String mobile = JOptionPane.showInputDialog("Enter your new mobile");
			String city = JOptionPane.showInputDialog("Enter your new city");
			
			ps.setString(1, password);
			ps.setString(2, email);
			ps.setString(3, mobile);
			ps.setString(4, city);
			ps.setString(5, username);
			
			int affectedRows = ps.executeUpdate();
			
			if(affectedRows > 0) {
				
				System.out.println("account updated");
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
