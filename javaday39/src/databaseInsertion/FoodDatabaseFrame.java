package databaseInsertion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.sql.Connection;

public class FoodDatabaseFrame extends JFrame implements ActionListener {
	
	JTextField tf1, tf2, tf3;
	JButton b1;
	
	public FoodDatabaseFrame() {
		super("Food Database");
		setResizable(false);
		setBounds(100, 100, 800, 600);		
		
		
		tf1 = new JTextField();
		tf1.setBounds(150, 200, 100,40);
		tf2 = new JTextField();
		tf2.setBounds(350, 200, 110,40);
		tf3 = new JTextField();
		tf3.setBounds(550, 200, 110, 40);
		
		b1 = new JButton("Submit");
		b1.setBounds(350, 400, 120, 40);
		
		b1.addActionListener(this);
		
		add(tf1); add(tf2); add(tf3); add(b1);
		
		setLayout(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new FoodDatabaseFrame();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			insertToDatabase();
		}
	}
	
	private void insertToDatabase() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaday26", "root", "root");
			PreparedStatement ps = conn.prepareStatement("INSERT INTO food(name, cuisine, size) VALUES(?, ?, ?)");
			
			ps.setString(1, tf1.getText());
			ps.setString(2, tf2.getText());
			ps.setString(3, tf3.getText());
			
			int i = ps.executeUpdate();
			if (i>0) {
				JOptionPane.showMessageDialog(this,"Data Saved!!!");
			}
			else {
				JOptionPane.showMessageDialog(this,"data not saved");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
