package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Frame2 extends JFrame implements ActionListener{
	JLabel label;
	JButton b1,b2;
	
	public Frame2() {
		super.setTitle("Frame2");
		super.setBounds(100,100,600,500);
		super.setResizable(false);
		super.setVisible(true);
		super.setLayout(null);
	    
		label = new JLabel("");
		label.setBounds(100, 250, 200, 100);
		
		b1=new JButton("Click me");
	    b1.setBounds(100, 100,100,50);
	    
	    b2=new JButton("Click me 2");
	    b2.setBounds(220,100,100,50);
	    
	    super.add(b1);
	    super.add(b2);
	    super.add(label);
	    
	    b1.addActionListener(this);
	    b2.addActionListener(this);
	}
	public static void main(String[] args) {
		Frame2 f = new Frame2();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==b1)
			label.setText("Button 1 was pressed");
		else if (e.getSource()==b2)
			label.setText("Button 2 was pressed");
	}
}
