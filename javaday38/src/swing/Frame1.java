package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Frame1 extends JFrame implements ActionListener{
	JButton b1,b2;
	
	public Frame1() {
		super.setTitle("Frame1");
		super.setBounds(100,100,600,500);
		super.setResizable(false);
		super.setVisible(true);
		super.setLayout(null);
	    
		b1=new JButton("Click me");
	    b1.setBounds(100, 100,100,50);
	    
	    b2=new JButton("Click me 2");
	    b2.setBounds(215,100,100,50);
	    
	    super.add(b1);
	    super.add(b2);
	    
	    b1.addActionListener(this);
	    b2.addActionListener(this);
	}
	public static void main(String[] args) {
		Frame1 f=new Frame1();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==b1)
			JOptionPane.showMessageDialog(null,"Button 1 is clicked");
		else if (e.getSource()==b2)
			JOptionPane.showMessageDialog(null,"Button 2 is clicked");
	}
}
