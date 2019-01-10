package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Frame3 extends JFrame implements ActionListener{
	JButton b1;
	JTextField tf;
	JLabel l1;
	
	public Frame3() {
		super.setTitle("Frame 3");
		super.setBounds(100,100,600,500);
		super.setResizable(false);
		super.setVisible(true);
		super.setLayout(null);
		
		l1=new JLabel("Name:");
		l1.setBounds(100,100,100,40);
	    
	    tf=new JTextField();
	    tf.setBounds(220,100,120,40);
	    
	    b1=new JButton("Click");
	   b1.setBounds(220,160,100,30);
	   
	   super.add(l1);
	   super.add(tf);
	   super.add(b1);
	   
	   b1.addActionListener(this);
	  
}
	public static void main(String[] args) {
		Frame3 f=new Frame3();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==b1) {
			tf.setText("This is data");
		}
	}
}
