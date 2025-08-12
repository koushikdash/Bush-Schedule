package BusSchedule;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class WelcomePage extends RegistrationPage{
              public WelcomePage(String name, String depertment, String batch, String section){
            	  JFrame frame = new JFrame();
         	     frame.setSize(600, 800);
         	     frame.setTitle("Welcom Page");
         	     frame.setLayout(null);
         	     frame.setLocationRelativeTo(null);
         	     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         	     
         	    ImageIcon logo = new ImageIcon("img/MU_Logo.png");
       	     
       	        JLabel image = new JLabel("", JLabel.CENTER);
       	        image.setBounds(0, 50, frame.getWidth(), 130);
       	        image.setIcon(logo);
       	        frame.add(image);
       	        
       	        JLabel welcome = new JLabel("Welcome, " + name, JLabel.CENTER);
       	        welcome.setBounds(0, 220, frame.getWidth(), 30);
       	        welcome.setVerticalAlignment(JLabel.CENTER);
       	        welcome.setFont(new Font("Lato",Font.BOLD,24));
          	    welcome.setForeground(new Color(108,104,153));
    	        frame.add(welcome);
    	        
    	        JLabel feedback = new JLabel("<html><div style = 'text-align: center;'>Let's find your Bus Stopages, <br> simply by selecting The Day & The Root.</br> </html>", JLabel.CENTER);
    	        feedback.setBounds(0, 297, frame.getWidth(), 40);
    	        feedback.setFont(new Font("Lato",Font.BOLD,18));
    	        feedback.setForeground(new Color(108,104,153));
    		    frame.add(feedback);
    		    
    		    JButton next = new JButton("Next");
    		    next.setBounds(205, 620, 190, 50);
    		    next.setFont(new Font("Lato",Font.BOLD,24));
    		    next.setForeground(Color.white);
    		    next.setBackground(new Color(56,164,2));
    		    frame.add(next);
    		    
    		    next.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
						frame.dispose();
						new routinePage(depertment,batch, section);
					}
				});
         	     
         	    frame.setVisible(true);
            	  
              }

			

			public WelcomePage() {
				// TODO Auto-generated constructor stub
			}
}
