package BusSchedule;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class Nobus  {
  private JFrame back;

public Nobus(JFrame routinePage) {
	  this.back = routinePage;
	  
	  JFrame frame = new JFrame();
		frame.setSize(600, 800);
		frame.setTitle("Stopage Page");
		frame.setLayout(null);

		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
		
		 JLabel feedback = new JLabel("<html><div style = 'text-align: center;'>Sorry, <br>There is no Bus Service abaillable for today.<br> Try another day.</br> </html>", JLabel.CENTER);
	        feedback.setBounds(0, 297, frame.getWidth(), 90);
	        feedback.setFont(new Font("Lato",Font.BOLD,24));
	        feedback.setForeground(new Color(217,110,110));
		    frame.add(feedback);
		
		
		
	        
	        JButton backbtn = new JButton("Back");
		     backbtn.setBounds(90, 620, 190, 50);
		     backbtn.setFont(new Font("Lato",Font.BOLD,24));
		     backbtn.setForeground(Color.white);
		     backbtn.setBackground(new Color(180,177,219));
		     frame.add(backbtn);
		     
		     backbtn.addActionListener(f -> {
					
					
					this.dispose();
					back.setVisible(true);
					
					
					});
		     
		     JButton exitkbtn = new JButton("Exit");
		     exitkbtn.setBounds(320, 620, 190, 50);
		     exitkbtn.setFont(new Font("Lato",Font.BOLD,24));
		     exitkbtn.setForeground(Color.white);
		     exitkbtn.setBackground(new Color(217,110,110));
		     frame.add(exitkbtn);
		     
		     exitkbtn.addActionListener(f -> {
					
					
					frame.dispose();
					//back.setVisible(true);
					
					
					});
		
		frame.setVisible(true);
  }

private void dispose() {
	// TODO Auto-generated method stub
	
}



}

