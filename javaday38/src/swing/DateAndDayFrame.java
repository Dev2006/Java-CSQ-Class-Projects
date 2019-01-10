package swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class DateAndDayFrame extends JFrame {
	JButton b1, b2;
	JTextField tf;
	
	public DateAndDayFrame() {
		super.setTitle("Date And Day");
		super.setBounds(100, 100, 640, 480);
		super.setResizable(false);
		super.setVisible(true);
		super.setLayout(null);
		
		b1 = new JButton("Get date");
		b1.setBounds(200, 80, 100, 40);
		
		b2 = new JButton("Get day");
		b2.setBounds(340, 80, 100, 40);
		
		tf = new JTextField();
		tf.setBounds(200, 160, 240, 40);
		
		super.add(b1);
		super.add(b2);
		super.add(tf);
	}
	
	public static void main(String[] args) {
		DateAndDayFrame ddf = new DateAndDayFrame();
	}
}
