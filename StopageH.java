package BusSchedule;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class StopageH extends JFrame {
   private JFrame back;

public  StopageH(JFrame routinePage) {
	   this.back = routinePage;
	   JFrame frame = new JFrame();
		frame.setSize(600, 800);
		frame.setTitle("Stopage Page");
		frame.setLayout(null);

		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   ImageIcon logo = new ImageIcon("img/H-C.jpg");
 	     
	        JLabel image = new JLabel("", JLabel.CENTER);
	        image.setBounds(240, 50, 136, 510);
	        image.setIcon(logo);
	        frame.add(image);
	        
	        
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
		     
		     JLabel note = new JLabel(
						"<html><div style = 'text-align: center;'> Bus Starts From Chondipul at: 8:10 AM and 11:05 AM<br> "
								+ "Bus Strats From Campus at : 3:00 PM and 6:10 PM</br> </html>",
						JLabel.CENTER);
				note.setBounds(0, 690, 600, 60);
				note.setFont(new Font("Lato", Font.BOLD, 18));
				note.setForeground(new Color(108, 104, 153));
				frame.add(note);
		
		frame.setVisible(true);
   }

public StopageH(routinePage routinePage) {
	// TODO Auto-generated constructor stub
}


}
