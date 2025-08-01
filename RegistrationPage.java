package BusSchedule;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RegistrationPage {
  public RegistrationPage(){
	     JFrame frame = new JFrame();
	     frame.setSize(600, 800);
	     frame.setTitle("Home Page");
	     frame.setLayout(null);
	     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     
	     ImageIcon logo = new ImageIcon("img/MU_Logo.png");
	     
	     JLabel image = new JLabel("", JLabel.CENTER);
	     image.setBounds(0, 60, frame.getWidth(), 130);
	     image.setIcon(logo);
	     frame.add(image);
	     
	    	     
	     JLabel name = new JLabel("Name: ");
	     name.setBounds(90, 220, 100, 30);
	     name.setForeground(new Color(108,104,153));
	     frame.add(name);
	     
	     JTextField nameField = new JTextField();
	     nameField.setBounds(90, 250, 420, 50);
	     nameField.setForeground(Color.white);
	     nameField.setText(nameField.getText());
	     nameField.setBackground(new Color(108,104,153));
	     frame.add(nameField);
	     
	     JLabel department = new JLabel("Department: ");
	     department.setBounds(90, 310, 160, 30);
	     department.setForeground(new Color(108,104,153));
	     frame.add(department);
	     
	     JTextField dpField = new JTextField();
	     dpField.setBounds(90, 340, 420, 50);
	     dpField.setForeground(Color.white);
	     dpField.setBackground(new Color(108,104,153));
	     frame.add(dpField);
	     
	     JLabel batch = new JLabel("Batch: ");
	     batch.setBounds(90, 400, 160, 30);
	     batch.setForeground(new Color(108,104,153));
	     frame.add(batch);
	     
	     JTextField batchField = new JTextField();
	     batchField.setBounds(90, 430, 420, 50);
	     batchField.setForeground(Color.white);
	     batchField.setBackground(new Color(108,104,153));
	     frame.add(batchField);
	     
	     JLabel section = new JLabel("Section: ");
	     section.setBounds(90, 490, 160, 30);
	     section.setForeground(new Color(108,104,153));
	     frame.add(section);
	     
	     JTextField sectionField = new JTextField();
	     sectionField.setBounds(90, 520, 420, 50);
	     sectionField.setForeground(Color.white);
	     sectionField.setBackground(new Color(108,104,153));
	     frame.add(sectionField);
	     
	     JButton registerbtn = new JButton("Register");
	     registerbtn.setBounds(205, 620, 190, 50);
	     registerbtn.setForeground(Color.white);
	     registerbtn.setBackground(new Color(56,164,2));
	     frame.add(registerbtn);
	     
	     registerbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				String userName = nameField.getText();
				String department = dpField.getText();
				String batch = batchField.getText();
				String section = sectionField.getText();
				new WelcomePage(userName);
				frame.dispose();
			}
		});
	     
	     
	     
	     frame.setVisible(true);
	  
	  
   }
}
