package BusSchedule;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class routinePage  {
	

	public routinePage(String dp, String bt, String sct) {
		
		
		
		JFrame frame = new JFrame();
		frame.setSize(600, 800);
		frame.setTitle("Welcom Page");
		frame.setLayout(null);
	
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ImageIcon logo = new ImageIcon("img/MU_Logo.png");
		Image image = logo.getImage();
		Image scaledImage = image.getScaledInstance(74, 36, Image.SCALE_SMOOTH);

		ImageIcon scaledIcon = new ImageIcon(scaledImage);

		JLabel img = new JLabel("");
		img.setBounds(90, 60, 74, 36);
		img.setIcon(scaledIcon);
		frame.add(img);

		JLabel h1 = new JLabel(dp + "," + bt + "-" + sct, JLabel.CENTER);
		h1.setBounds(0, 90, frame.getWidth(), 50);
		h1.setFont(new Font("Lato", Font.BOLD, 40));
		h1.setForeground(new Color(108, 104, 153));
		frame.add(h1);

		JLabel routine = new JLabel("Class Routine", JLabel.CENTER);
		routine.setBounds(147, 151, 306, 50);
		routine.setFont(new Font("Lato", Font.BOLD, 24));
		routine.setForeground(Color.white);
		routine.setOpaque(true);
		routine.setBackground(new Color(138, 146, 1));
		frame.add(routine);
		
		JLabel note = new JLabel("<html><div style = 'text-align: left;'>NOTE:[The routine is see here, is the routine for CSE,59-E <br> "
				+ "Just make sure you have your correct class routine and comback here to see your stopages.]</br> </html>", JLabel.CENTER);
		note.setBounds(0, 690, 600, 60);
		note.setFont(new Font("Lato",Font.BOLD,12));
		note.setForeground(new Color(108,104,153));
	    frame.add(note);

		ImageIcon rtn = new ImageIcon("img/Routine.png");

		JLabel routineImage = new JLabel("", JLabel.CENTER);
		routineImage.setBounds(90, 223, rtn.getIconWidth(), rtn.getIconHeight());
		routineImage.setIcon(rtn);
		frame.add(routineImage);

		String[] days = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Satarday", "Friday" };
		JComboBox<String> daysCombo = new JComboBox<>(days);
		daysCombo.setBounds(90, 470, 420, 50);
		daysCombo.setBackground(new Color(108, 104, 153));
		daysCombo.setFont(new Font("Lato", Font.BOLD, 18));
		daysCombo.setForeground(Color.white);
		daysCombo.setVisible(true);
		frame.add(daysCombo);
		

		
		daysCombo.addActionListener(e -> {
			String selectedDay = (String) daysCombo.getSelectedItem();
			switch (selectedDay) {
			case "Sunday":
				String[] roots = { "Temukhi-Campus", "KazirBazar-Campus", "RikabiBazar-Campus", "Humayun Chattar-Campus" };
				 JComboBox<String> rootsCombo = new JComboBox<>(roots);
				rootsCombo.setBounds(90, 540, 420, 50);
				rootsCombo.setBackground(new Color(108, 104, 153));
				rootsCombo.setFont(new Font("Lato", Font.BOLD, 18));
				rootsCombo.setForeground(Color.white);
				rootsCombo.setVisible(true);
				frame.add(rootsCombo);
				
				rootsCombo.addActionListener(f -> {
					String selectedRoot = (String) rootsCombo.getSelectedItem();
					switch (selectedRoot) {
					case "Temukhi-Campus":
						frame.setVisible(false);
						new StopageTe(frame);
						
						break;
						
					case "KazirBazar-Campus":
						frame.setVisible(false);
						new StopageKazi(frame);
						
						break;
						
					case "RikabiBazar-Campus":
						frame.setVisible(false);
						new StopageRI(frame);
						
						break;
						
					case "Humayun Chattar-Campus":
						frame.setVisible(false);
						new StopageH(frame);
						
					
				break;
					}});
				break;
				
			case "Monday":
				
				String[] mroots = { "Temukhi-Campus", "KazirBazar-Campus", "RikabiBazar-Campus", "Humayun Chattar-Campus" };
				 JComboBox<String> mrootsCombo = new JComboBox<>(mroots);
				mrootsCombo.setBounds(90, 540, 420, 50);
				mrootsCombo.setBackground(new Color(108, 104, 153));
				mrootsCombo.setFont(new Font("Lato", Font.BOLD, 18));
				mrootsCombo.setForeground(Color.white);
				mrootsCombo.setVisible(true);
				frame.add(mrootsCombo);
				
				mrootsCombo.addActionListener(f -> {
					String selectedRoot = (String) mrootsCombo.getSelectedItem();
					switch (selectedRoot) {
					case "Temukhi-Campus":
						frame.setVisible(false);
						new StopageTe(frame);
					
						break;
						
					case "KazirBazar-Campus":
						frame.setVisible(false);
						new StopageKazi(frame);
					
						break;
						
					case "RikabiBazar-Campus":
						frame.setVisible(false);
						new StopageRI(frame);
						
						break;
						
					case "Humayun Chattar-Campus":
						frame.setVisible(false);
						new StopageH(frame);
						
					
				break;
					}});
				
				
				
		case "Tuesday":
			
			String[] turoots = { "Temukhi-Campus", "KazirBazar-Campus", "RikabiBazar-Campus", "Humayun Chattar-Campus" };
			 JComboBox<String> turootsCombo = new JComboBox<>(turoots);
			turootsCombo.setBounds(90, 540, 420, 50);
			turootsCombo.setBackground(new Color(108, 104, 153));
			turootsCombo.setFont(new Font("Lato", Font.BOLD, 18));
			turootsCombo.setForeground(Color.white);
			turootsCombo.setVisible(true);
			frame.add(turootsCombo);
				
				turootsCombo.addActionListener(f -> {
					String selectedRoot = (String) turootsCombo.getSelectedItem();
					switch (selectedRoot) {
					case "Temukhi-Campus":
						frame.setVisible(false);
						new StopageTe(frame);
						
						break;
						
					case "KazirBazar-Campus":
						frame.setVisible(false);
						new StopageKazi(frame);
					
						break;
						
					case "RikabiBazar-Campus":
						frame.setVisible(false);
						new StopageRI(frame);
						
						break;
						
					case "Humayun Chattar-Campus":
						frame.setVisible(false);
						new StopageH(frame);
					
					
				break;
					}});
				
				
		case "Wednesday":
			
			String[] wroots = { "Temukhi-Campus", "KazirBazar-Campus", "RikabiBazar-Campus", "Humayun Chattar-Campus" };
			 JComboBox<String> wrootsCombo = new JComboBox<>(wroots);
			wrootsCombo.setBounds(90, 540, 420, 50);
			wrootsCombo.setBackground(new Color(108, 104, 153));
			wrootsCombo.setFont(new Font("Lato", Font.BOLD, 18));
			wrootsCombo.setForeground(Color.white);
			wrootsCombo.setVisible(true);
			frame.add(wrootsCombo);
			
			wrootsCombo.addActionListener(f -> {
				String selectedRoot = (String) wrootsCombo.getSelectedItem();
				switch (selectedRoot) {
				case "Temukhi-Campus":
					frame.setVisible(false);
					new StopageTe(frame);
					
					break;
					
				case "KazirBazar-Campus":
					frame.setVisible(false);
					new StopageKazi(frame);
					
					break;
					
				case "RikabiBazar-Campus":
					frame.setVisible(false);
					new StopageRI(frame);
					
					break;
					
				case "Humayun Chattar-Campus":
					frame.setVisible(false);
					new StopageH(frame);
				
				
			break;
				}});
			
			
		case "Thursday":
			
			String[] troots = { "Temukhi-Campus", "KazirBazar-Campus", "RikabiBazar-Campus", "Humayun Chattar-Campus" };
			 JComboBox<String> trootsCombo = new JComboBox<>(troots);
			trootsCombo.setBounds(90, 540, 420, 50);
			trootsCombo.setBackground(new Color(108, 104, 153));
			trootsCombo.setFont(new Font("Lato", Font.BOLD, 18));
			trootsCombo.setForeground(Color.white);
			trootsCombo.setVisible(true);
			frame.add(trootsCombo);
			
			trootsCombo.addActionListener(f -> {
				String selectedRoot = (String) trootsCombo.getSelectedItem();
				switch (selectedRoot) {
				case "Temukhi-Campus":
					frame.setVisible(false);
					new StopageTe(frame);
					
					break;
					
				case "KazirBazar-Campus":
					frame.setVisible(false);
					new StopageKazi(frame);
					
					break;
					
				case "RikabiBazar-Campus":
					frame.setVisible(false);
					new StopageRI(frame);
					
					break;
					
				case "Humayun Chattar-Campus":
					frame.setVisible(false);
					new StopageH(frame);
					
				
			break;
				}});
			
			
		case "Satarday":
			
			String[] sroots = { "Temukhi-Campus", "KazirBazar-Campus", "RikabiBazar-Campus", "Humayun Chattar-Campus" };
			 JComboBox<String> srootsCombo = new JComboBox<>(sroots);
			srootsCombo.setBounds(90, 540, 420, 50);
			srootsCombo.setBackground(new Color(108, 104, 153));
			srootsCombo.setFont(new Font("Lato", Font.BOLD, 18));
			srootsCombo.setForeground(Color.white);
			srootsCombo.setVisible(true);
			frame.add(srootsCombo);
			
			
			
			srootsCombo.addActionListener(f -> {
				
				String selectedRoot = (String) srootsCombo.getSelectedItem();
				if(srootsCombo.getSelectedIndex() != -1) {
				
				frame.setVisible(false);
				new Nobus(frame);
				
				}
				});
			
			
		case "Friday":
			
			String[] froots = { "Temukhi-Campus", "KazirBazar-Campus", "RikabiBazar-Campus", "Humayun Chattar-Campus" };
			 JComboBox<String> frootsCombo = new JComboBox<>(froots);
			frootsCombo.setBounds(90, 540, 420, 50);
			frootsCombo.setBackground(new Color(108, 104, 153));
			frootsCombo.setFont(new Font("Lato", Font.BOLD, 18));
			frootsCombo.setForeground(Color.white);
			frootsCombo.setVisible(true);
			frame.add(frootsCombo);
			
			frootsCombo.addActionListener(f -> {
				
				if(frootsCombo.getSelectedIndex() != -1) {
					
					frame.setVisible(false);
					new Nobus(frame);
					
					}
				
				});
				
				break;
				
			}});
		


		
		

		frame.setVisible(true);}

	private void setVisible() {
		// TODO Auto-generated method stub
		
	}

	public routinePage() {
		// TODO Auto-generated constructor stub
	}
	
}
