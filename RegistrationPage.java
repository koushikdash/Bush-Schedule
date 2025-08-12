package BusSchedule;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RegistrationPage {
	public RegistrationPage() {

		JFrame frame = new JFrame();

		frame.setSize(600, 800);
		frame.setTitle("Registration Page");
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		ImageIcon logo = new ImageIcon("img/MU_Logo.png");

		JLabel image = new JLabel("", JLabel.CENTER);
		image.setBounds(0, 50, frame.getWidth(), 130);
		image.setIcon(logo);
		frame.add(image);

		JLabel feedback = new JLabel("Register Here", JLabel.CENTER);
		feedback.setBounds(0, 180, frame.getWidth(), 50);
		feedback.setFont(new Font("Lato", Font.BOLD, 18));
		feedback.setForeground(new Color(108, 104, 153));
		frame.add(feedback);

		JLabel note = new JLabel(
				"<html><div style = 'text-align: left;'>NOTE:[It is a dummy project about finding bus stopages from specific root,  <br> "
						+ "SO be playful with it. Inorder To start you need to select options one after one.]</br> </html>",
				JLabel.CENTER);
		note.setBounds(0, 690, 600, 60);
		note.setFont(new Font("Lato", Font.BOLD, 12));
		note.setForeground(new Color(108, 104, 153));
		frame.add(note);

		JLabel name = new JLabel("Name: ");
		name.setBounds(90, 220, 100, 30);
		name.setForeground(new Color(108, 104, 153));
		frame.add(name);

		JTextField nameField = new JTextField();
		nameField.setBounds(90, 250, 420, 50);
		nameField.setForeground(Color.white);
		nameField.setFont(new Font("Lato", Font.BOLD, 18));
		nameField.setText(nameField.getText());
		nameField.setBackground(new Color(108, 104, 153));
		frame.add(nameField);

		JLabel department = new JLabel("Department: ");
		department.setBounds(90, 310, 160, 30);
		department.setForeground(new Color(108, 104, 153));
		frame.add(department);

		String[] departmentlist = { "CSE", "EEE", "ENG", "LLB", "SWE", "BBA", "ECO" };
		JComboBox<String> depCombo = new JComboBox<>(departmentlist);
		depCombo.setBounds(90, 340, 420, 50);
		depCombo.setBackground(new Color(108, 104, 153));
		depCombo.setFont(new Font("Lato", Font.BOLD, 18));
		depCombo.setForeground(Color.white);
		depCombo.setVisible(true);
		frame.add(depCombo);

		JLabel batch = new JLabel("Batch: ");
		batch.setBounds(90, 400, 160, 30);
		batch.setForeground(new Color(108, 104, 153));
		frame.add(batch);

		JLabel sec = new JLabel("Section: ");
		sec.setBounds(90, 490, 160, 30);
		sec.setForeground(new Color(108, 104, 153));
		frame.add(sec);

		depCombo.addActionListener(e -> {
			String selectedBatch = (String) depCombo.getSelectedItem();
			switch (selectedBatch) {
			case "CSE":
				String[] CSEbatchlist = { "59", "58", "56", "55" };
				JComboBox<String> CSEbatchCombo = new JComboBox<>(CSEbatchlist);
				CSEbatchCombo.setBounds(90, 430, 420, 50);
				CSEbatchCombo.setBackground(new Color(108, 104, 153));
				CSEbatchCombo.setFont(new Font("Lato", Font.BOLD, 18));
				CSEbatchCombo.setForeground(Color.white);
				CSEbatchCombo.setVisible(true);
				frame.add(CSEbatchCombo);

				CSEbatchCombo.addActionListener(f -> {

					String CSEselectedBatch = (String) CSEbatchCombo.getSelectedItem();
					switch (CSEselectedBatch) {

					case "59":
						String[] sectionlist59 = { "A", "B", "C", "D", "E", "F", "G", "H" };
						JComboBox<String> sectioncombo59 = new JComboBox<>(sectionlist59);
						sectioncombo59.setBounds(90, 520, 420, 50);
						sectioncombo59.setBackground(new Color(108, 104, 153));
						sectioncombo59.setFont(new Font("Lato", Font.BOLD, 18));
						sectioncombo59.setForeground(Color.white);
						sectioncombo59.setVisible(true);
						frame.add(sectioncombo59);

						sectioncombo59.addActionListener(g -> {

							String allsectionlist59 = (String) sectioncombo59.getSelectedItem();
							switch (allsectionlist59) {
							case "A":

								String userName = nameField.getText();
								String depart = (String) depCombo.getSelectedItem();
								String bat = (String) CSEbatchCombo.getSelectedItem();
								String section = (String) sectioncombo59.getSelectedItem();
								new WelcomePage(userName, depart, bat, section);
								frame.setVisible(false);
								break;

							case "B":

								String BuserName = nameField.getText();
								String Bdepart = (String) depCombo.getSelectedItem();
								String Bbat = (String) CSEbatchCombo.getSelectedItem();
								String Bsection = (String) sectioncombo59.getSelectedItem();
								new WelcomePage(BuserName, Bdepart, Bbat, Bsection);
								break;

							case "C":
								String CBuserName = nameField.getText();
								String CBdepart = (String) depCombo.getSelectedItem();
								String CBbat = (String) CSEbatchCombo.getSelectedItem();
								String CBsection = (String) sectioncombo59.getSelectedItem();
								new WelcomePage(CBuserName, CBdepart, CBbat, CBsection);
								break;

							case "D":
								String DBuserName = nameField.getText();
								String DBdepart = (String) depCombo.getSelectedItem();
								String DBbat = (String) CSEbatchCombo.getSelectedItem();
								String DBsection = (String) sectioncombo59.getSelectedItem();
								new WelcomePage(DBuserName, DBdepart, DBbat, DBsection);
								break;

							case "E":
								String EBuserName = nameField.getText();
								String EBdepart = (String) depCombo.getSelectedItem();
								String EBbat = (String) CSEbatchCombo.getSelectedItem();
								String EBsection = (String) sectioncombo59.getSelectedItem();
								new WelcomePage(EBuserName, EBdepart, EBbat, EBsection);
								break;
							case "F":
								String FBuserName = nameField.getText();
								String FBdepart = (String) depCombo.getSelectedItem();
								String FBbat = (String) CSEbatchCombo.getSelectedItem();
								String FBsection = (String) sectioncombo59.getSelectedItem();
								new WelcomePage(FBuserName, FBdepart, FBbat, FBsection);
								break;
							case "G":
								String GBuserName = nameField.getText();
								String GBdepart = (String) depCombo.getSelectedItem();
								String GBbat = (String) CSEbatchCombo.getSelectedItem();
								String GBsection = (String) sectioncombo59.getSelectedItem();
								new WelcomePage(GBuserName, GBdepart, GBbat, GBsection);
								break;

							case "H":
								String HBuserName = nameField.getText();
								String HBdepart = (String) depCombo.getSelectedItem();
								String HBbat = (String) CSEbatchCombo.getSelectedItem();
								String HBsection = (String) sectioncombo59.getSelectedItem();
								new WelcomePage(HBuserName, HBdepart, HBbat, HBsection);
								break;

							}
						});

						break;

					case "58":
						String[] sectionlist58 = { "A", "B", "C", "D", "E", "F", "G" };
						JComboBox<String> sectioncombo58 = new JComboBox<>(sectionlist58);
						sectioncombo58.setBounds(90, 520, 420, 50);
						sectioncombo58.setBackground(new Color(108, 104, 153));
						sectioncombo58.setFont(new Font("Lato", Font.BOLD, 18));
						sectioncombo58.setForeground(Color.white);
						sectioncombo58.setVisible(true);
						frame.add(sectioncombo58);

						sectioncombo58.addActionListener(g -> {

							String allsectionlist58 = (String) sectioncombo58.getSelectedItem();
							switch (allsectionlist58) {
							case "A":

								String userName = nameField.getText();
								String depart = (String) depCombo.getSelectedItem();
								String bat = (String) CSEbatchCombo.getSelectedItem();
								String section = (String) sectioncombo58.getSelectedItem();
								new WelcomePage(userName, depart, bat, section);
								frame.setVisible(false);
								break;

							case "B":

								String BuserName = nameField.getText();
								String Bdepart = (String) depCombo.getSelectedItem();
								String Bbat = (String) CSEbatchCombo.getSelectedItem();
								String Bsection = (String) sectioncombo58.getSelectedItem();
								new WelcomePage(BuserName, Bdepart, Bbat, Bsection);
								break;

							case "C":
								String CBuserName = nameField.getText();
								String CBdepart = (String) depCombo.getSelectedItem();
								String CBbat = (String) CSEbatchCombo.getSelectedItem();
								String CBsection = (String) sectioncombo58.getSelectedItem();
								new WelcomePage(CBuserName, CBdepart, CBbat, CBsection);
								break;

							case "D":
								String DBuserName = nameField.getText();
								String DBdepart = (String) depCombo.getSelectedItem();
								String DBbat = (String) CSEbatchCombo.getSelectedItem();
								String DBsection = (String) sectioncombo58.getSelectedItem();
								new WelcomePage(DBuserName, DBdepart, DBbat, DBsection);
								break;

							case "E":
								String EBuserName = nameField.getText();
								String EBdepart = (String) depCombo.getSelectedItem();
								String EBbat = (String) CSEbatchCombo.getSelectedItem();
								String EBsection = (String) sectioncombo58.getSelectedItem();
								new WelcomePage(EBuserName, EBdepart, EBbat, EBsection);
								break;
							case "F":
								String FBuserName = nameField.getText();
								String FBdepart = (String) depCombo.getSelectedItem();
								String FBbat = (String) CSEbatchCombo.getSelectedItem();
								String FBsection = (String) sectioncombo58.getSelectedItem();
								new WelcomePage(FBuserName, FBdepart, FBbat, FBsection);
								break;
							case "G":
								String GBuserName = nameField.getText();
								String GBdepart = (String) depCombo.getSelectedItem();
								String GBbat = (String) CSEbatchCombo.getSelectedItem();
								String GBsection = (String) sectioncombo58.getSelectedItem();
								new WelcomePage(GBuserName, GBdepart, GBbat, GBsection);
								break;

							}
						});
						break;

					case "57":
						String[] sectionlist57 = { "A", "B", "C", "D", "E", "F", "G" };
						JComboBox<String> sectioncombo57 = new JComboBox<>(sectionlist57);
						sectioncombo57.setBounds(90, 520, 420, 50);
						sectioncombo57.setBackground(new Color(108, 104, 153));
						sectioncombo57.setFont(new Font("Lato", Font.BOLD, 18));
						sectioncombo57.setForeground(Color.white);
						sectioncombo57.setVisible(true);
						frame.add(sectioncombo57);

						sectioncombo57.addActionListener(g -> {

							String allsectionlist58 = (String) sectioncombo57.getSelectedItem();
							switch (allsectionlist58) {
							case "A":

								String userName = nameField.getText();
								String depart = (String) depCombo.getSelectedItem();
								String bat = (String) CSEbatchCombo.getSelectedItem();
								String section = (String) sectioncombo57.getSelectedItem();
								new WelcomePage(userName, depart, bat, section);
								frame.setVisible(false);
								break;

							case "B":

								String BuserName = nameField.getText();
								String Bdepart = (String) depCombo.getSelectedItem();
								String Bbat = (String) CSEbatchCombo.getSelectedItem();
								String Bsection = (String) sectioncombo57.getSelectedItem();
								new WelcomePage(BuserName, Bdepart, Bbat, Bsection);
								break;

							case "C":
								String CBuserName = nameField.getText();
								String CBdepart = (String) depCombo.getSelectedItem();
								String CBbat = (String) CSEbatchCombo.getSelectedItem();
								String CBsection = (String) sectioncombo57.getSelectedItem();
								new WelcomePage(CBuserName, CBdepart, CBbat, CBsection);
								break;

							case "D":
								String DBuserName = nameField.getText();
								String DBdepart = (String) depCombo.getSelectedItem();
								String DBbat = (String) CSEbatchCombo.getSelectedItem();
								String DBsection = (String) sectioncombo57.getSelectedItem();
								new WelcomePage(DBuserName, DBdepart, DBbat, DBsection);
								break;

							case "E":
								String EBuserName = nameField.getText();
								String EBdepart = (String) depCombo.getSelectedItem();
								String EBbat = (String) CSEbatchCombo.getSelectedItem();
								String EBsection = (String) sectioncombo57.getSelectedItem();
								new WelcomePage(EBuserName, EBdepart, EBbat, EBsection);
								break;
							case "F":
								String FBuserName = nameField.getText();
								String FBdepart = (String) depCombo.getSelectedItem();
								String FBbat = (String) CSEbatchCombo.getSelectedItem();
								String FBsection = (String) sectioncombo57.getSelectedItem();
								new WelcomePage(FBuserName, FBdepart, FBbat, FBsection);
								break;
							case "G":
								String GBuserName = nameField.getText();
								String GBdepart = (String) depCombo.getSelectedItem();
								String GBbat = (String) CSEbatchCombo.getSelectedItem();
								String GBsection = (String) sectioncombo57.getSelectedItem();
								new WelcomePage(GBuserName, GBdepart, GBbat, GBsection);
								break;

							}
						});

						break;

					case "56":
						String[] sectionlist56 = { "A", "B", "C", "D", "E" };
						JComboBox<String> sectioncombo56 = new JComboBox<>(sectionlist56);
						sectioncombo56.setBounds(90, 520, 420, 50);
						sectioncombo56.setBackground(new Color(108, 104, 153));
						sectioncombo56.setFont(new Font("Lato", Font.BOLD, 18));
						sectioncombo56.setForeground(Color.white);
						sectioncombo56.setVisible(true);
						frame.add(sectioncombo56);

						sectioncombo56.addActionListener(g -> {

							String allsectionlist58 = (String) sectioncombo56.getSelectedItem();
							switch (allsectionlist58) {
							case "A":

								String userName = nameField.getText();
								String depart = (String) depCombo.getSelectedItem();
								String bat = (String) CSEbatchCombo.getSelectedItem();
								String section = (String) sectioncombo56.getSelectedItem();
								new WelcomePage(userName, depart, bat, section);
								frame.setVisible(false);
								break;

							case "B":

								String BuserName = nameField.getText();
								String Bdepart = (String) depCombo.getSelectedItem();
								String Bbat = (String) CSEbatchCombo.getSelectedItem();
								String Bsection = (String) sectioncombo56.getSelectedItem();
								new WelcomePage(BuserName, Bdepart, Bbat, Bsection);
								break;

							case "C":
								String CBuserName = nameField.getText();
								String CBdepart = (String) depCombo.getSelectedItem();
								String CBbat = (String) CSEbatchCombo.getSelectedItem();
								String CBsection = (String) sectioncombo56.getSelectedItem();
								new WelcomePage(CBuserName, CBdepart, CBbat, CBsection);
								break;

							case "D":
								String DBuserName = nameField.getText();
								String DBdepart = (String) depCombo.getSelectedItem();
								String DBbat = (String) CSEbatchCombo.getSelectedItem();
								String DBsection = (String) sectioncombo56.getSelectedItem();
								new WelcomePage(DBuserName, DBdepart, DBbat, DBsection);
								break;

							case "E":
								String EBuserName = nameField.getText();
								String EBdepart = (String) depCombo.getSelectedItem();
								String EBbat = (String) CSEbatchCombo.getSelectedItem();
								String EBsection = (String) sectioncombo56.getSelectedItem();
								new WelcomePage(EBuserName, EBdepart, EBbat, EBsection);
								break;

							}
						});

						break;

					}
				});

				break;

			case "EEE":
				String[] EEEbatchlist = { "49", "48", "46", "45" };
				JComboBox<String> EEEbatchCombo = new JComboBox<>(EEEbatchlist);
				EEEbatchCombo.setBounds(90, 430, 420, 50);
				EEEbatchCombo.setBackground(new Color(108, 104, 153));
				EEEbatchCombo.setFont(new Font("Lato", Font.BOLD, 18));
				EEEbatchCombo.setForeground(Color.white);
				EEEbatchCombo.setVisible(true);
				frame.add(EEEbatchCombo);

				EEEbatchCombo.addActionListener(f -> {

					String EEEselectedBatch = (String) EEEbatchCombo.getSelectedItem();
					switch (EEEselectedBatch) {

					case "49":
						String[] sectionlist49 = { "A", "B", "C", "D" };
						JComboBox<String> sectioncombo49 = new JComboBox<>(sectionlist49);
						sectioncombo49.setBounds(90, 520, 420, 50);
						sectioncombo49.setBackground(new Color(108, 104, 153));
						sectioncombo49.setFont(new Font("Lato", Font.BOLD, 18));
						sectioncombo49.setForeground(Color.white);
						sectioncombo49.setVisible(true);
						frame.add(sectioncombo49);

						sectioncombo49.addActionListener(g -> {

							String allsectionlist49 = (String) sectioncombo49.getSelectedItem();
							switch (allsectionlist49) {
							case "A":

								String userName = nameField.getText();
								String depart = (String) depCombo.getSelectedItem();
								String bat = (String) EEEbatchCombo.getSelectedItem();
								String section = (String) sectioncombo49.getSelectedItem();
								new WelcomePage(userName, depart, bat, section);
								frame.setVisible(false);
								break;

							case "B":

								String BuserName = nameField.getText();
								String Bdepart = (String) depCombo.getSelectedItem();
								String Bbat = (String) EEEbatchCombo.getSelectedItem();
								String Bsection = (String) sectioncombo49.getSelectedItem();
								new WelcomePage(BuserName, Bdepart, Bbat, Bsection);
								break;

							case "C":
								String CBuserName = nameField.getText();
								String CBdepart = (String) depCombo.getSelectedItem();
								String CBbat = (String) EEEbatchCombo.getSelectedItem();
								String CBsection = (String) sectioncombo49.getSelectedItem();
								new WelcomePage(CBuserName, CBdepart, CBbat, CBsection);
								break;

							case "D":
								String DBuserName = nameField.getText();
								String DBdepart = (String) depCombo.getSelectedItem();
								String DBbat = (String) EEEbatchCombo.getSelectedItem();
								String DBsection = (String) sectioncombo49.getSelectedItem();
								new WelcomePage(DBuserName, DBdepart, DBbat, DBsection);
								break;

							}
						});

						break;

					case "48":
						String[] sectionlist48 = { "A", "B", "C", "D", "E" };
						JComboBox<String> sectioncombo48 = new JComboBox<>(sectionlist48);
						sectioncombo48.setBounds(90, 520, 420, 50);
						sectioncombo48.setBackground(new Color(108, 104, 153));
						sectioncombo48.setFont(new Font("Lato", Font.BOLD, 18));
						sectioncombo48.setForeground(Color.white);
						sectioncombo48.setVisible(true);
						frame.add(sectioncombo48);

						sectioncombo48.addActionListener(g -> {

							String allsectionlist48 = (String) sectioncombo48.getSelectedItem();
							switch (allsectionlist48) {
							case "A":

								String userName = nameField.getText();
								String depart = (String) depCombo.getSelectedItem();
								String bat = (String) EEEbatchCombo.getSelectedItem();
								String section = (String) sectioncombo48.getSelectedItem();
								new WelcomePage(userName, depart, bat, section);
								frame.setVisible(false);
								break;

							case "B":

								String BuserName = nameField.getText();
								String Bdepart = (String) depCombo.getSelectedItem();
								String Bbat = (String) EEEbatchCombo.getSelectedItem();
								String Bsection = (String) sectioncombo48.getSelectedItem();
								new WelcomePage(BuserName, Bdepart, Bbat, Bsection);
								break;

							case "C":
								String CBuserName = nameField.getText();
								String CBdepart = (String) depCombo.getSelectedItem();
								String CBbat = (String) EEEbatchCombo.getSelectedItem();
								String CBsection = (String) sectioncombo48.getSelectedItem();
								new WelcomePage(CBuserName, CBdepart, CBbat, CBsection);
								break;

							case "D":
								String DBuserName = nameField.getText();
								String DBdepart = (String) depCombo.getSelectedItem();
								String DBbat = (String) EEEbatchCombo.getSelectedItem();
								String DBsection = (String) sectioncombo48.getSelectedItem();
								new WelcomePage(DBuserName, DBdepart, DBbat, DBsection);
								break;

							case "E":
								String EBuserName = nameField.getText();
								String EBdepart = (String) depCombo.getSelectedItem();
								String EBbat = (String) EEEbatchCombo.getSelectedItem();
								String EBsection = (String) sectioncombo48.getSelectedItem();
								new WelcomePage(EBuserName, EBdepart, EBbat, EBsection);
								break;

							}
						});
						break;

					case "46":
						String[] sectionlist46 = { "A", "B", "C", "D", "E", "F", "G" };
						JComboBox<String> sectioncombo46 = new JComboBox<>(sectionlist46);
						sectioncombo46.setBounds(90, 520, 420, 50);
						sectioncombo46.setBackground(new Color(108, 104, 153));
						sectioncombo46.setFont(new Font("Lato", Font.BOLD, 18));
						sectioncombo46.setForeground(Color.white);
						sectioncombo46.setVisible(true);
						frame.add(sectioncombo46);

						sectioncombo46.addActionListener(g -> {

							String allsectionlist58 = (String) sectioncombo46.getSelectedItem();
							switch (allsectionlist58) {
							case "A":

								String userName = nameField.getText();
								String depart = (String) depCombo.getSelectedItem();
								String bat = (String) EEEbatchCombo.getSelectedItem();
								String section = (String) sectioncombo46.getSelectedItem();
								new WelcomePage(userName, depart, bat, section);
								frame.setVisible(false);
								break;

							case "B":

								String BuserName = nameField.getText();
								String Bdepart = (String) depCombo.getSelectedItem();
								String Bbat = (String) EEEbatchCombo.getSelectedItem();
								String Bsection = (String) sectioncombo46.getSelectedItem();
								new WelcomePage(BuserName, Bdepart, Bbat, Bsection);
								break;

							case "C":
								String CBuserName = nameField.getText();
								String CBdepart = (String) depCombo.getSelectedItem();
								String CBbat = (String) EEEbatchCombo.getSelectedItem();
								String CBsection = (String) sectioncombo46.getSelectedItem();
								new WelcomePage(CBuserName, CBdepart, CBbat, CBsection);
								break;

							case "D":
								String DBuserName = nameField.getText();
								String DBdepart = (String) depCombo.getSelectedItem();
								String DBbat = (String) EEEbatchCombo.getSelectedItem();
								String DBsection = (String) sectioncombo46.getSelectedItem();
								new WelcomePage(DBuserName, DBdepart, DBbat, DBsection);
								break;

							case "E":
								String EBuserName = nameField.getText();
								String EBdepart = (String) depCombo.getSelectedItem();
								String EBbat = (String) EEEbatchCombo.getSelectedItem();
								String EBsection = (String) sectioncombo46.getSelectedItem();
								new WelcomePage(EBuserName, EBdepart, EBbat, EBsection);
								break;
							case "F":
								String FBuserName = nameField.getText();
								String FBdepart = (String) depCombo.getSelectedItem();
								String FBbat = (String) EEEbatchCombo.getSelectedItem();
								String FBsection = (String) sectioncombo46.getSelectedItem();
								new WelcomePage(FBuserName, FBdepart, FBbat, FBsection);
								break;
							case "G":
								String GBuserName = nameField.getText();
								String GBdepart = (String) depCombo.getSelectedItem();
								String GBbat = (String) EEEbatchCombo.getSelectedItem();
								String GBsection = (String) sectioncombo46.getSelectedItem();
								new WelcomePage(GBuserName, GBdepart, GBbat, GBsection);
								break;

							}
						});

						break;

					case "45":
						String[] sectionlist45 = { "A", "B", "C" };
						JComboBox<String> sectioncombo45 = new JComboBox<>(sectionlist45);
						sectioncombo45.setBounds(90, 520, 420, 50);
						sectioncombo45.setBackground(new Color(108, 104, 153));
						sectioncombo45.setFont(new Font("Lato", Font.BOLD, 18));
						sectioncombo45.setForeground(Color.white);
						sectioncombo45.setVisible(true);
						frame.add(sectioncombo45);

						sectioncombo45.addActionListener(g -> {

							String allsectionlist45 = (String) sectioncombo45.getSelectedItem();
							switch (allsectionlist45) {
							case "A":

								String userName = nameField.getText();
								String depart = (String) depCombo.getSelectedItem();
								String bat = (String) EEEbatchCombo.getSelectedItem();
								String section = (String) sectioncombo45.getSelectedItem();
								new WelcomePage(userName, depart, bat, section);
								frame.setVisible(false);
								break;

							case "B":

								String BuserName = nameField.getText();
								String Bdepart = (String) depCombo.getSelectedItem();
								String Bbat = (String) EEEbatchCombo.getSelectedItem();
								String Bsection = (String) sectioncombo45.getSelectedItem();
								new WelcomePage(BuserName, Bdepart, Bbat, Bsection);
								break;

							case "C":
								String CBuserName = nameField.getText();
								String CBdepart = (String) depCombo.getSelectedItem();
								String CBbat = (String) EEEbatchCombo.getSelectedItem();
								String CBsection = (String) sectioncombo45.getSelectedItem();
								new WelcomePage(CBuserName, CBdepart, CBbat, CBsection);
								break;

							}
						});

						break;

					}
				});

				break;

			case "ENG":
				String[] ENGbatchlist = { "39", "38", "37", "36" };
				JComboBox<String> ENGbatchCombo = new JComboBox<>(ENGbatchlist);
				ENGbatchCombo.setBounds(90, 430, 420, 50);
				ENGbatchCombo.setBackground(new Color(108, 104, 153));
				ENGbatchCombo.setFont(new Font("Lato", Font.BOLD, 18));
				ENGbatchCombo.setForeground(Color.white);
				ENGbatchCombo.setVisible(true);
				frame.add(ENGbatchCombo);

				ENGbatchCombo.addActionListener(f -> {

					String ENGselectedBatch = (String) ENGbatchCombo.getSelectedItem();
					switch (ENGselectedBatch) {

					case "39":
						String[] sectionlist39 = { "A", "B", "C", "D", "E" };
						JComboBox<String> sectioncombo39 = new JComboBox<>(sectionlist39);
						sectioncombo39.setBounds(90, 520, 420, 50);
						sectioncombo39.setBackground(new Color(108, 104, 153));
						sectioncombo39.setFont(new Font("Lato", Font.BOLD, 18));
						sectioncombo39.setForeground(Color.white);
						sectioncombo39.setVisible(true);
						frame.add(sectioncombo39);

						sectioncombo39.addActionListener(g -> {

							String allsectionlist39 = (String) sectioncombo39.getSelectedItem();
							switch (allsectionlist39) {
							case "A":

								String userName = nameField.getText();
								String depart = (String) depCombo.getSelectedItem();
								String bat = (String) ENGbatchCombo.getSelectedItem();
								String section = (String) sectioncombo39.getSelectedItem();
								new WelcomePage(userName, depart, bat, section);
								frame.setVisible(false);
								break;

							case "B":

								String BuserName = nameField.getText();
								String Bdepart = (String) depCombo.getSelectedItem();
								String Bbat = (String) ENGbatchCombo.getSelectedItem();
								String Bsection = (String) sectioncombo39.getSelectedItem();
								new WelcomePage(BuserName, Bdepart, Bbat, Bsection);
								break;

							case "C":
								String CBuserName = nameField.getText();
								String CBdepart = (String) depCombo.getSelectedItem();
								String CBbat = (String) ENGbatchCombo.getSelectedItem();
								String CBsection = (String) sectioncombo39.getSelectedItem();
								new WelcomePage(CBuserName, CBdepart, CBbat, CBsection);
								break;

							case "D":
								String DBuserName = nameField.getText();
								String DBdepart = (String) depCombo.getSelectedItem();
								String DBbat = (String) ENGbatchCombo.getSelectedItem();
								String DBsection = (String) sectioncombo39.getSelectedItem();
								new WelcomePage(DBuserName, DBdepart, DBbat, DBsection);
								break;

							case "E":
								String EBuserName = nameField.getText();
								String EBdepart = (String) depCombo.getSelectedItem();
								String EBbat = (String) ENGbatchCombo.getSelectedItem();
								String EBsection = (String) sectioncombo39.getSelectedItem();
								new WelcomePage(EBuserName, EBdepart, EBbat, EBsection);
								break;
							}
						});

						break;

					case "38":
						String[] sectionlist38 = { "A", "B", "C", "D", "E" };
						JComboBox<String> sectioncombo38 = new JComboBox<>(sectionlist38);
						sectioncombo38.setBounds(90, 520, 420, 50);
						sectioncombo38.setBackground(new Color(108, 104, 153));
						sectioncombo38.setFont(new Font("Lato", Font.BOLD, 18));
						sectioncombo38.setForeground(Color.white);
						sectioncombo38.setVisible(true);
						frame.add(sectioncombo38);

						sectioncombo38.addActionListener(g -> {

							String allsectionlist38 = (String) sectioncombo38.getSelectedItem();
							switch (allsectionlist38) {
							case "A":

								String userName = nameField.getText();
								String depart = (String) depCombo.getSelectedItem();
								String bat = (String) ENGbatchCombo.getSelectedItem();
								String section = (String) sectioncombo38.getSelectedItem();
								new WelcomePage(userName, depart, bat, section);
								frame.setVisible(false);
								break;

							case "B":

								String BuserName = nameField.getText();
								String Bdepart = (String) depCombo.getSelectedItem();
								String Bbat = (String) ENGbatchCombo.getSelectedItem();
								String Bsection = (String) sectioncombo38.getSelectedItem();
								new WelcomePage(BuserName, Bdepart, Bbat, Bsection);
								break;

							case "C":
								String CBuserName = nameField.getText();
								String CBdepart = (String) depCombo.getSelectedItem();
								String CBbat = (String) ENGbatchCombo.getSelectedItem();
								String CBsection = (String) sectioncombo38.getSelectedItem();
								new WelcomePage(CBuserName, CBdepart, CBbat, CBsection);
								break;

							case "D":
								String DBuserName = nameField.getText();
								String DBdepart = (String) depCombo.getSelectedItem();
								String DBbat = (String) ENGbatchCombo.getSelectedItem();
								String DBsection = (String) sectioncombo38.getSelectedItem();
								new WelcomePage(DBuserName, DBdepart, DBbat, DBsection);
								break;

							case "E":
								String EBuserName = nameField.getText();
								String EBdepart = (String) depCombo.getSelectedItem();
								String EBbat = (String) ENGbatchCombo.getSelectedItem();
								String EBsection = (String) sectioncombo38.getSelectedItem();
								new WelcomePage(EBuserName, EBdepart, EBbat, EBsection);
								break;

							}
						});
						break;

					case "37":
						String[] sectionlist37 = { "A", "B", "C" };
						JComboBox<String> sectioncombo37 = new JComboBox<>(sectionlist37);
						sectioncombo37.setBounds(90, 520, 420, 50);
						sectioncombo37.setBackground(new Color(108, 104, 153));
						sectioncombo37.setFont(new Font("Lato", Font.BOLD, 18));
						sectioncombo37.setForeground(Color.white);
						sectioncombo37.setVisible(true);
						frame.add(sectioncombo37);

						sectioncombo37.addActionListener(g -> {

							String allsectionlist37 = (String) sectioncombo37.getSelectedItem();
							switch (allsectionlist37) {
							case "A":

								String userName = nameField.getText();
								String depart = (String) depCombo.getSelectedItem();
								String bat = (String) ENGbatchCombo.getSelectedItem();
								String section = (String) sectioncombo37.getSelectedItem();
								new WelcomePage(userName, depart, bat, section);
								frame.setVisible(false);
								break;

							case "B":

								String BuserName = nameField.getText();
								String Bdepart = (String) depCombo.getSelectedItem();
								String Bbat = (String) ENGbatchCombo.getSelectedItem();
								String Bsection = (String) sectioncombo37.getSelectedItem();
								new WelcomePage(BuserName, Bdepart, Bbat, Bsection);
								break;

							case "C":
								String CBuserName = nameField.getText();
								String CBdepart = (String) depCombo.getSelectedItem();
								String CBbat = (String) ENGbatchCombo.getSelectedItem();
								String CBsection = (String) sectioncombo37.getSelectedItem();
								new WelcomePage(CBuserName, CBdepart, CBbat, CBsection);
								break;

							}
						});

						break;

					case "36":
						String[] sectionlist36 = { "A", "B", "C" };
						JComboBox<String> sectioncombo36 = new JComboBox<>(sectionlist36);
						sectioncombo36.setBounds(90, 520, 420, 50);
						sectioncombo36.setBackground(new Color(108, 104, 153));
						sectioncombo36.setFont(new Font("Lato", Font.BOLD, 18));
						sectioncombo36.setForeground(Color.white);
						sectioncombo36.setVisible(true);
						frame.add(sectioncombo36);

						sectioncombo36.addActionListener(g -> {

							String allsectionlist36 = (String) sectioncombo36.getSelectedItem();
							switch (allsectionlist36) {
							case "A":

								String userName = nameField.getText();
								String depart = (String) depCombo.getSelectedItem();
								String bat = (String) ENGbatchCombo.getSelectedItem();
								String section = (String) sectioncombo36.getSelectedItem();
								new WelcomePage(userName, depart, bat, section);
								frame.setVisible(false);
								break;

							case "B":

								String BuserName = nameField.getText();
								String Bdepart = (String) depCombo.getSelectedItem();
								String Bbat = (String) ENGbatchCombo.getSelectedItem();
								String Bsection = (String) sectioncombo36.getSelectedItem();
								new WelcomePage(BuserName, Bdepart, Bbat, Bsection);
								break;

							case "C":
								String CBuserName = nameField.getText();
								String CBdepart = (String) depCombo.getSelectedItem();
								String CBbat = (String) ENGbatchCombo.getSelectedItem();
								String CBsection = (String) sectioncombo36.getSelectedItem();
								new WelcomePage(CBuserName, CBdepart, CBbat, CBsection);
								break;

							}
						});

						break;

					}
				});

				break;

			case "LLB":
				String[] LLBbatchlist = { "33", "32", "31", "30" };
				JComboBox<String> LLBbatchCombo = new JComboBox<>(LLBbatchlist);
				LLBbatchCombo.setBounds(90, 430, 420, 50);
				LLBbatchCombo.setBackground(new Color(108, 104, 153));
				LLBbatchCombo.setFont(new Font("Lato", Font.BOLD, 18));
				LLBbatchCombo.setForeground(Color.white);
				LLBbatchCombo.setVisible(true);
				frame.add(LLBbatchCombo);

				LLBbatchCombo.addActionListener(f -> {

					String LLBselectedBatch = (String) LLBbatchCombo.getSelectedItem();
					switch (LLBselectedBatch) {

					case "33":
						String[] sectionlist33 = { "A", "B", "C", "D", "E" };
						JComboBox<String> sectioncombo33 = new JComboBox<>(sectionlist33);
						sectioncombo33.setBounds(90, 520, 420, 50);
						sectioncombo33.setBackground(new Color(108, 104, 153));
						sectioncombo33.setFont(new Font("Lato", Font.BOLD, 18));
						sectioncombo33.setForeground(Color.white);
						sectioncombo33.setVisible(true);
						frame.add(sectioncombo33);

						sectioncombo33.addActionListener(g -> {

							String allsectionlist33 = (String) sectioncombo33.getSelectedItem();
							switch (allsectionlist33) {
							case "A":

								String userName = nameField.getText();
								String depart = (String) depCombo.getSelectedItem();
								String bat = (String) LLBbatchCombo.getSelectedItem();
								String section = (String) sectioncombo33.getSelectedItem();
								new WelcomePage(userName, depart, bat, section);
								frame.setVisible(false);
								break;

							case "B":

								String BuserName = nameField.getText();
								String Bdepart = (String) depCombo.getSelectedItem();
								String Bbat = (String) LLBbatchCombo.getSelectedItem();
								String Bsection = (String) sectioncombo33.getSelectedItem();
								new WelcomePage(BuserName, Bdepart, Bbat, Bsection);
								break;

							case "C":
								String CBuserName = nameField.getText();
								String CBdepart = (String) depCombo.getSelectedItem();
								String CBbat = (String) LLBbatchCombo.getSelectedItem();
								String CBsection = (String) sectioncombo33.getSelectedItem();
								new WelcomePage(CBuserName, CBdepart, CBbat, CBsection);
								break;

							case "D":
								String DBuserName = nameField.getText();
								String DBdepart = (String) depCombo.getSelectedItem();
								String DBbat = (String) LLBbatchCombo.getSelectedItem();
								String DBsection = (String) sectioncombo33.getSelectedItem();
								new WelcomePage(DBuserName, DBdepart, DBbat, DBsection);
								break;

							case "E":
								String EBuserName = nameField.getText();
								String EBdepart = (String) depCombo.getSelectedItem();
								String EBbat = (String) LLBbatchCombo.getSelectedItem();
								String EBsection = (String) sectioncombo33.getSelectedItem();
								new WelcomePage(EBuserName, EBdepart, EBbat, EBsection);
								break;
							}
						});

						break;

					case "32":
						String[] sectionlist32 = { "A", "B", "C" };
						JComboBox<String> sectioncombo32 = new JComboBox<>(sectionlist32);
						sectioncombo32.setBounds(90, 520, 420, 50);
						sectioncombo32.setBackground(new Color(108, 104, 153));
						sectioncombo32.setFont(new Font("Lato", Font.BOLD, 18));
						sectioncombo32.setForeground(Color.white);
						sectioncombo32.setVisible(true);
						frame.add(sectioncombo32);

						sectioncombo32.addActionListener(g -> {

							String allsectionlist32 = (String) sectioncombo32.getSelectedItem();
							switch (allsectionlist32) {
							case "A":

								String userName = nameField.getText();
								String depart = (String) depCombo.getSelectedItem();
								String bat = (String) LLBbatchCombo.getSelectedItem();
								String section = (String) sectioncombo32.getSelectedItem();
								new WelcomePage(userName, depart, bat, section);
								frame.setVisible(false);
								break;

							case "B":

								String BuserName = nameField.getText();
								String Bdepart = (String) depCombo.getSelectedItem();
								String Bbat = (String) LLBbatchCombo.getSelectedItem();
								String Bsection = (String) sectioncombo32.getSelectedItem();
								new WelcomePage(BuserName, Bdepart, Bbat, Bsection);
								break;

							case "C":
								String CBuserName = nameField.getText();
								String CBdepart = (String) depCombo.getSelectedItem();
								String CBbat = (String) LLBbatchCombo.getSelectedItem();
								String CBsection = (String) sectioncombo32.getSelectedItem();
								new WelcomePage(CBuserName, CBdepart, CBbat, CBsection);
								break;

							}
						});
						break;

					case "31":
						String[] sectionlist31 = { "A", "B", "C" };
						JComboBox<String> sectioncombo31 = new JComboBox<>(sectionlist31);
						sectioncombo31.setBounds(90, 520, 420, 50);
						sectioncombo31.setBackground(new Color(108, 104, 153));
						sectioncombo31.setFont(new Font("Lato", Font.BOLD, 18));
						sectioncombo31.setForeground(Color.white);
						sectioncombo31.setVisible(true);
						frame.add(sectioncombo31);

						sectioncombo31.addActionListener(g -> {

							String allsectionlist31 = (String) sectioncombo31.getSelectedItem();
							switch (allsectionlist31) {
							case "A":

								String userName = nameField.getText();
								String depart = (String) depCombo.getSelectedItem();
								String bat = (String) LLBbatchCombo.getSelectedItem();
								String section = (String) sectioncombo31.getSelectedItem();
								new WelcomePage(userName, depart, bat, section);
								frame.setVisible(false);
								break;

							case "B":

								String BuserName = nameField.getText();
								String Bdepart = (String) depCombo.getSelectedItem();
								String Bbat = (String) LLBbatchCombo.getSelectedItem();
								String Bsection = (String) sectioncombo31.getSelectedItem();
								new WelcomePage(BuserName, Bdepart, Bbat, Bsection);
								break;

							case "C":
								String CBuserName = nameField.getText();
								String CBdepart = (String) depCombo.getSelectedItem();
								String CBbat = (String) LLBbatchCombo.getSelectedItem();
								String CBsection = (String) sectioncombo31.getSelectedItem();
								new WelcomePage(CBuserName, CBdepart, CBbat, CBsection);
								break;

							}
						});

						break;

					case "30":
						String[] sectionlist30 = { "A", "B" };
						JComboBox<String> sectioncombo30 = new JComboBox<>(sectionlist30);
						sectioncombo30.setBounds(90, 520, 420, 50);
						sectioncombo30.setBackground(new Color(108, 104, 153));
						sectioncombo30.setFont(new Font("Lato", Font.BOLD, 18));
						sectioncombo30.setForeground(Color.white);
						sectioncombo30.setVisible(true);
						frame.add(sectioncombo30);

						sectioncombo30.addActionListener(g -> {

							String allsectionlist30 = (String) sectioncombo30.getSelectedItem();
							switch (allsectionlist30) {
							case "A":

								String userName = nameField.getText();
								String depart = (String) depCombo.getSelectedItem();
								String bat = (String) LLBbatchCombo.getSelectedItem();
								String section = (String) sectioncombo30.getSelectedItem();
								new WelcomePage(userName, depart, bat, section);
								frame.setVisible(false);
								break;

							case "B":

								String BuserName = nameField.getText();
								String Bdepart = (String) depCombo.getSelectedItem();
								String Bbat = (String) LLBbatchCombo.getSelectedItem();
								String Bsection = (String) sectioncombo30.getSelectedItem();
								new WelcomePage(BuserName, Bdepart, Bbat, Bsection);
								break;

							}
						});

						break;

					}
				});

				break;

			case "SWE":
				String[] SWEbatchlist = { "33", "32", "31" };
				JComboBox<String> SWEbatchCombo = new JComboBox<>(SWEbatchlist);
				SWEbatchCombo.setBounds(90, 430, 420, 50);
				SWEbatchCombo.setBackground(new Color(108, 104, 153));
				SWEbatchCombo.setFont(new Font("Lato", Font.BOLD, 18));
				SWEbatchCombo.setForeground(Color.white);
				SWEbatchCombo.setVisible(true);
				frame.add(SWEbatchCombo);

				SWEbatchCombo.addActionListener(f -> {

					String SWEselectedBatch = (String) SWEbatchCombo.getSelectedItem();
					switch (SWEselectedBatch) {

					case "33":
						String[] sectionlist33 = { "A", "B", "C", "D", "E" };
						JComboBox<String> sectioncombo33 = new JComboBox<>(sectionlist33);
						sectioncombo33.setBounds(90, 520, 420, 50);
						sectioncombo33.setBackground(new Color(108, 104, 153));
						sectioncombo33.setFont(new Font("Lato", Font.BOLD, 18));
						sectioncombo33.setForeground(Color.white);
						sectioncombo33.setVisible(true);
						frame.add(sectioncombo33);

						sectioncombo33.addActionListener(g -> {

							String allsectionlist33 = (String) sectioncombo33.getSelectedItem();
							switch (allsectionlist33) {
							case "A":

								String userName = nameField.getText();
								String depart = (String) depCombo.getSelectedItem();
								String bat = (String) SWEbatchCombo.getSelectedItem();
								String section = (String) sectioncombo33.getSelectedItem();
								new WelcomePage(userName, depart, bat, section);
								frame.setVisible(false);
								break;

							case "B":

								String BuserName = nameField.getText();
								String Bdepart = (String) depCombo.getSelectedItem();
								String Bbat = (String) SWEbatchCombo.getSelectedItem();
								String Bsection = (String) sectioncombo33.getSelectedItem();
								new WelcomePage(BuserName, Bdepart, Bbat, Bsection);
								break;

							case "C":
								String CBuserName = nameField.getText();
								String CBdepart = (String) depCombo.getSelectedItem();
								String CBbat = (String) SWEbatchCombo.getSelectedItem();
								String CBsection = (String) sectioncombo33.getSelectedItem();
								new WelcomePage(CBuserName, CBdepart, CBbat, CBsection);
								break;

							case "D":
								String DBuserName = nameField.getText();
								String DBdepart = (String) depCombo.getSelectedItem();
								String DBbat = (String) SWEbatchCombo.getSelectedItem();
								String DBsection = (String) sectioncombo33.getSelectedItem();
								new WelcomePage(DBuserName, DBdepart, DBbat, DBsection);
								break;

							case "E":
								String EBuserName = nameField.getText();
								String EBdepart = (String) depCombo.getSelectedItem();
								String EBbat = (String) SWEbatchCombo.getSelectedItem();
								String EBsection = (String) sectioncombo33.getSelectedItem();
								new WelcomePage(EBuserName, EBdepart, EBbat, EBsection);
								break;
							}
						});

						break;

					case "32":
						String[] sectionlist32 = { "A", "B", "C" };
						JComboBox<String> sectioncombo32 = new JComboBox<>(sectionlist32);
						sectioncombo32.setBounds(90, 520, 420, 50);
						sectioncombo32.setBackground(new Color(108, 104, 153));
						sectioncombo32.setFont(new Font("Lato", Font.BOLD, 18));
						sectioncombo32.setForeground(Color.white);
						sectioncombo32.setVisible(true);
						frame.add(sectioncombo32);

						sectioncombo32.addActionListener(g -> {

							String allsectionlist32 = (String) sectioncombo32.getSelectedItem();
							switch (allsectionlist32) {
							case "A":

								String userName = nameField.getText();
								String depart = (String) depCombo.getSelectedItem();
								String bat = (String) SWEbatchCombo.getSelectedItem();
								String section = (String) sectioncombo32.getSelectedItem();
								new WelcomePage(userName, depart, bat, section);
								frame.setVisible(false);
								break;

							case "B":

								String BuserName = nameField.getText();
								String Bdepart = (String) depCombo.getSelectedItem();
								String Bbat = (String) SWEbatchCombo.getSelectedItem();
								String Bsection = (String) sectioncombo32.getSelectedItem();
								new WelcomePage(BuserName, Bdepart, Bbat, Bsection);
								break;

							case "C":
								String CBuserName = nameField.getText();
								String CBdepart = (String) depCombo.getSelectedItem();
								String CBbat = (String) SWEbatchCombo.getSelectedItem();
								String CBsection = (String) sectioncombo32.getSelectedItem();
								new WelcomePage(CBuserName, CBdepart, CBbat, CBsection);
								break;

							}
						});
						break;

					case "31":
						String[] sectionlist31 = { "A", "B", "C" };
						JComboBox<String> sectioncombo31 = new JComboBox<>(sectionlist31);
						sectioncombo31.setBounds(90, 520, 420, 50);
						sectioncombo31.setBackground(new Color(108, 104, 153));
						sectioncombo31.setFont(new Font("Lato", Font.BOLD, 18));
						sectioncombo31.setForeground(Color.white);
						sectioncombo31.setVisible(true);
						frame.add(sectioncombo31);

						sectioncombo31.addActionListener(g -> {

							String allsectionlist31 = (String) sectioncombo31.getSelectedItem();
							switch (allsectionlist31) {
							case "A":

								String userName = nameField.getText();
								String depart = (String) depCombo.getSelectedItem();
								String bat = (String) SWEbatchCombo.getSelectedItem();
								String section = (String) sectioncombo31.getSelectedItem();
								new WelcomePage(userName, depart, bat, section);
								frame.setVisible(false);
								break;

							case "B":

								String BuserName = nameField.getText();
								String Bdepart = (String) depCombo.getSelectedItem();
								String Bbat = (String) SWEbatchCombo.getSelectedItem();
								String Bsection = (String) sectioncombo31.getSelectedItem();
								new WelcomePage(BuserName, Bdepart, Bbat, Bsection);
								break;

							case "C":
								String CBuserName = nameField.getText();
								String CBdepart = (String) depCombo.getSelectedItem();
								String CBbat = (String) SWEbatchCombo.getSelectedItem();
								String CBsection = (String) sectioncombo31.getSelectedItem();
								new WelcomePage(CBuserName, CBdepart, CBbat, CBsection);
								break;

							}
						});

						break;

					}
				});

				break;

			case "BBA":
				String[] BBAbatchlist = { "43", "42", "41", "40" };
				JComboBox<String> BBAbatchCombo = new JComboBox<>(BBAbatchlist);
				BBAbatchCombo.setBounds(90, 430, 420, 50);
				BBAbatchCombo.setBackground(new Color(108, 104, 153));
				BBAbatchCombo.setFont(new Font("Lato", Font.BOLD, 18));
				BBAbatchCombo.setForeground(Color.white);
				BBAbatchCombo.setVisible(true);
				frame.add(BBAbatchCombo);

				BBAbatchCombo.addActionListener(f -> {

					String LLBselectedBatch = (String) BBAbatchCombo.getSelectedItem();
					switch (LLBselectedBatch) {

					case "43":
						String[] sectionlist43 = { "A", "B", "C", "D" };
						JComboBox<String> sectioncombo43 = new JComboBox<>(sectionlist43);
						sectioncombo43.setBounds(90, 520, 420, 50);
						sectioncombo43.setBackground(new Color(108, 104, 153));
						sectioncombo43.setFont(new Font("Lato", Font.BOLD, 18));
						sectioncombo43.setForeground(Color.white);
						sectioncombo43.setVisible(true);
						frame.add(sectioncombo43);

						sectioncombo43.addActionListener(g -> {

							String allsectionlist43 = (String) sectioncombo43.getSelectedItem();
							switch (allsectionlist43) {
							case "A":

								String userName = nameField.getText();
								String depart = (String) depCombo.getSelectedItem();
								String bat = (String) BBAbatchCombo.getSelectedItem();
								String section = (String) sectioncombo43.getSelectedItem();
								new WelcomePage(userName, depart, bat, section);
								frame.setVisible(false);
								break;

							case "B":

								String BuserName = nameField.getText();
								String Bdepart = (String) depCombo.getSelectedItem();
								String Bbat = (String) BBAbatchCombo.getSelectedItem();
								String Bsection = (String) sectioncombo43.getSelectedItem();
								new WelcomePage(BuserName, Bdepart, Bbat, Bsection);
								break;

							case "C":
								String CBuserName = nameField.getText();
								String CBdepart = (String) depCombo.getSelectedItem();
								String CBbat = (String) BBAbatchCombo.getSelectedItem();
								String CBsection = (String) sectioncombo43.getSelectedItem();
								new WelcomePage(CBuserName, CBdepart, CBbat, CBsection);
								break;

							case "D":
								String DBuserName = nameField.getText();
								String DBdepart = (String) depCombo.getSelectedItem();
								String DBbat = (String) BBAbatchCombo.getSelectedItem();
								String DBsection = (String) sectioncombo43.getSelectedItem();
								new WelcomePage(DBuserName, DBdepart, DBbat, DBsection);
								break;

							}
						});

						break;

					case "42":
						String[] sectionlist42 = { "A", "B", "C" };
						JComboBox<String> sectioncombo42 = new JComboBox<>(sectionlist42);
						sectioncombo42.setBounds(90, 520, 420, 50);
						sectioncombo42.setBackground(new Color(108, 104, 153));
						sectioncombo42.setFont(new Font("Lato", Font.BOLD, 18));
						sectioncombo42.setForeground(Color.white);
						sectioncombo42.setVisible(true);
						frame.add(sectioncombo42);

						sectioncombo42.addActionListener(g -> {

							String allsectionlist42 = (String) sectioncombo42.getSelectedItem();
							switch (allsectionlist42) {
							case "A":

								String userName = nameField.getText();
								String depart = (String) depCombo.getSelectedItem();
								String bat = (String) BBAbatchCombo.getSelectedItem();
								String section = (String) sectioncombo42.getSelectedItem();
								new WelcomePage(userName, depart, bat, section);
								frame.setVisible(false);
								break;

							case "B":

								String BuserName = nameField.getText();
								String Bdepart = (String) depCombo.getSelectedItem();
								String Bbat = (String) BBAbatchCombo.getSelectedItem();
								String Bsection = (String) sectioncombo42.getSelectedItem();
								new WelcomePage(BuserName, Bdepart, Bbat, Bsection);
								break;

							case "C":
								String CBuserName = nameField.getText();
								String CBdepart = (String) depCombo.getSelectedItem();
								String CBbat = (String) BBAbatchCombo.getSelectedItem();
								String CBsection = (String) sectioncombo42.getSelectedItem();
								new WelcomePage(CBuserName, CBdepart, CBbat, CBsection);
								break;

							}
						});
						break;

					case "41":
						String[] sectionlist41 = { "A", "B", "C" };
						JComboBox<String> sectioncombo41 = new JComboBox<>(sectionlist41);
						sectioncombo41.setBounds(90, 520, 420, 50);
						sectioncombo41.setBackground(new Color(108, 104, 153));
						sectioncombo41.setFont(new Font("Lato", Font.BOLD, 18));
						sectioncombo41.setForeground(Color.white);
						sectioncombo41.setVisible(true);
						frame.add(sectioncombo41);

						sectioncombo41.addActionListener(g -> {

							String allsectionlist41 = (String) sectioncombo41.getSelectedItem();
							switch (allsectionlist41) {
							case "A":

								String userName = nameField.getText();
								String depart = (String) depCombo.getSelectedItem();
								String bat = (String) BBAbatchCombo.getSelectedItem();
								String section = (String) sectioncombo41.getSelectedItem();
								new WelcomePage(userName, depart, bat, section);
								frame.setVisible(false);
								break;

							case "B":

								String BuserName = nameField.getText();
								String Bdepart = (String) depCombo.getSelectedItem();
								String Bbat = (String) BBAbatchCombo.getSelectedItem();
								String Bsection = (String) sectioncombo41.getSelectedItem();
								new WelcomePage(BuserName, Bdepart, Bbat, Bsection);
								break;

							case "C":
								String CBuserName = nameField.getText();
								String CBdepart = (String) depCombo.getSelectedItem();
								String CBbat = (String) BBAbatchCombo.getSelectedItem();
								String CBsection = (String) sectioncombo41.getSelectedItem();
								new WelcomePage(CBuserName, CBdepart, CBbat, CBsection);
								break;

							}
						});

						break;

					case "40":
						String[] sectionlist40 = { "A", "B" };
						JComboBox<String> sectioncombo40 = new JComboBox<>(sectionlist40);
						sectioncombo40.setBounds(90, 520, 420, 50);
						sectioncombo40.setBackground(new Color(108, 104, 153));
						sectioncombo40.setFont(new Font("Lato", Font.BOLD, 18));
						sectioncombo40.setForeground(Color.white);
						sectioncombo40.setVisible(true);
						frame.add(sectioncombo40);

						sectioncombo40.addActionListener(g -> {

							String allsectionlist40 = (String) sectioncombo40.getSelectedItem();
							switch (allsectionlist40) {
							case "A":

								String userName = nameField.getText();
								String depart = (String) depCombo.getSelectedItem();
								String bat = (String) BBAbatchCombo.getSelectedItem();
								String section = (String) sectioncombo40.getSelectedItem();
								new WelcomePage(userName, depart, bat, section);
								frame.setVisible(false);
								break;

							case "B":

								String BuserName = nameField.getText();
								String Bdepart = (String) depCombo.getSelectedItem();
								String Bbat = (String) BBAbatchCombo.getSelectedItem();
								String Bsection = (String) sectioncombo40.getSelectedItem();
								new WelcomePage(BuserName, Bdepart, Bbat, Bsection);
								break;

							}
						});

						break;

					}
				});

				break;

			case "ECO":
				String[] ECObatchlist = { "23", "22" };
				JComboBox<String> ECObatchCombo = new JComboBox<>(ECObatchlist);
				ECObatchCombo.setBounds(90, 430, 420, 50);
				ECObatchCombo.setBackground(new Color(108, 104, 153));
				ECObatchCombo.setFont(new Font("Lato", Font.BOLD, 18));
				ECObatchCombo.setForeground(Color.white);
				ECObatchCombo.setVisible(true);
				frame.add(ECObatchCombo);

				ECObatchCombo.addActionListener(f -> {

					String ECOselectedBatch = (String) ECObatchCombo.getSelectedItem();
					switch (ECOselectedBatch) {

					case "23":
						String[] sectionlist23 = { "A", "B", "C", "D" };
						JComboBox<String> sectioncombo23 = new JComboBox<>(sectionlist23);
						sectioncombo23.setBounds(90, 520, 420, 50);
						sectioncombo23.setBackground(new Color(108, 104, 153));
						sectioncombo23.setFont(new Font("Lato", Font.BOLD, 18));
						sectioncombo23.setForeground(Color.white);
						sectioncombo23.setVisible(true);
						frame.add(sectioncombo23);

						sectioncombo23.addActionListener(g -> {

							String allsectionlist23 = (String) sectioncombo23.getSelectedItem();
							switch (allsectionlist23) {
							case "A":

								String userName = nameField.getText();
								String depart = (String) depCombo.getSelectedItem();
								String bat = (String) ECObatchCombo.getSelectedItem();
								String section = (String) sectioncombo23.getSelectedItem();
								new WelcomePage(userName, depart, bat, section);
								frame.setVisible(false);
								break;

							case "B":

								String BuserName = nameField.getText();
								String Bdepart = (String) depCombo.getSelectedItem();
								String Bbat = (String) ECObatchCombo.getSelectedItem();
								String Bsection = (String) sectioncombo23.getSelectedItem();
								new WelcomePage(BuserName, Bdepart, Bbat, Bsection);
								break;

							case "C":
								String CBuserName = nameField.getText();
								String CBdepart = (String) depCombo.getSelectedItem();
								String CBbat = (String) ECObatchCombo.getSelectedItem();
								String CBsection = (String) sectioncombo23.getSelectedItem();
								new WelcomePage(CBuserName, CBdepart, CBbat, CBsection);
								break;

							case "D":
								String DBuserName = nameField.getText();
								String DBdepart = (String) depCombo.getSelectedItem();
								String DBbat = (String) ECObatchCombo.getSelectedItem();
								String DBsection = (String) sectioncombo23.getSelectedItem();
								new WelcomePage(DBuserName, DBdepart, DBbat, DBsection);
								break;

							}
						});

						break;

					case "22":
						String[] sectionlist22 = { "A", "B", "C" };
						JComboBox<String> sectioncombo22 = new JComboBox<>(sectionlist22);
						sectioncombo22.setBounds(90, 520, 420, 50);
						sectioncombo22.setBackground(new Color(108, 104, 153));
						sectioncombo22.setFont(new Font("Lato", Font.BOLD, 18));
						sectioncombo22.setForeground(Color.white);
						sectioncombo22.setVisible(true);
						frame.add(sectioncombo22);

						sectioncombo22.addActionListener(g -> {

							String allsectionlist22 = (String) sectioncombo22.getSelectedItem();
							switch (allsectionlist22) {
							case "A":

								String userName = nameField.getText();
								String depart = (String) depCombo.getSelectedItem();
								String bat = (String) ECObatchCombo.getSelectedItem();
								String section = (String) sectioncombo22.getSelectedItem();
								new WelcomePage(userName, depart, bat, section);
								frame.setVisible(false);
								break;

							case "B":

								String BuserName = nameField.getText();
								String Bdepart = (String) depCombo.getSelectedItem();
								String Bbat = (String) ECObatchCombo.getSelectedItem();
								String Bsection = (String) sectioncombo22.getSelectedItem();
								new WelcomePage(BuserName, Bdepart, Bbat, Bsection);
								break;

							case "C":
								String CBuserName = nameField.getText();
								String CBdepart = (String) depCombo.getSelectedItem();
								String CBbat = (String) ECObatchCombo.getSelectedItem();
								String CBsection = (String) sectioncombo22.getSelectedItem();
								new WelcomePage(CBuserName, CBdepart, CBbat, CBsection);
								break;

							}
						});
						break;

					}
				});

				break;

			}
		});

		frame.setVisible(true);

	}
}
