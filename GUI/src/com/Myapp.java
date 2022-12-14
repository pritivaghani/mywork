package com;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Myapp {

	public static void main(String[] args) {
		JFrame j = new JFrame();
		j.setSize(400,400);
		j.setVisible(true);
		j.setTitle("Demo");
		//j.setResizable(false);
		j.setLayout(null);
		
		JLabel title = new JLabel("Registration form");
		title.setBounds(200, 20, 200, 50);
		
		JLabel uname = new JLabel("Username");
		uname.setBounds(50, 80, 100, 20);
		JTextField unameT = new JTextField();
		unameT.setBounds(150, 80, 100, 20);
		
		JLabel email = new JLabel("Email");
		email.setBounds(50, 110, 100, 20);
		JTextField emailt = new JTextField();
		emailt.setBounds(150, 110, 100, 20);
		
		JLabel pass = new JLabel("Password");
		pass.setBounds(50, 140, 100, 20);
		JPasswordField passT = new JPasswordField();
		passT.setBounds(150, 140, 100, 20);
		
		JLabel gender = new JLabel("Gender");
		gender.setBounds(50, 170, 100, 20);
		JRadioButton male = new JRadioButton("Male");
		JRadioButton female = new JRadioButton("Female");
		male.setBounds(150, 170, 100, 20);
         female.setBounds(250, 170, 100, 20);
        ButtonGroup btn = new ButtonGroup();
        btn.add(male);
        btn.add(female);
        
        JLabel lang = new JLabel("Languages");
        lang.setBounds(50, 200, 100, 20);
        JCheckBox j1 = new JCheckBox("English");
        JCheckBox j2 = new JCheckBox("Gujarati");
        JCheckBox j3 = new JCheckBox("Hindi");
        JCheckBox j4 = new JCheckBox("Tamil");
        j1.setBounds(150, 200, 100, 20);
        j2.setBounds(250, 200, 100, 20);
        j3.setBounds(150, 230, 100, 20);
        j4.setBounds(250, 230, 100, 20);
        ButtonGroup b = new ButtonGroup();
        b.add(j1);
        b.add(j2);
        b.add(j3);
        b.add(j4);         
        
        String allcountry[] = {"India","USA","Canada","Germany","London","Japan","Austrlia"};
        JLabel country = new JLabel("Country");
        country.setBounds(50, 260, 100, 20);
		JComboBox<String> ct = new JComboBox<>(allcountry);
		ct.setBounds(150, 260, 100, 20);
		
		JButton submit = new JButton("Submit");
		submit.setBounds(150, 290, 100, 20);
		
		JMenuBar menu = new JMenuBar();
		menu.setBounds(0, 0, 400, 20);
		
		JMenu file = new JMenu("File");
		JMenu edit = new JMenu("Edit");
		JMenu source = new JMenu("Source");
		JMenu help = new JMenu("Help");
		menu.add(file);
		menu.add(edit);
		menu.add(source);
		menu.add(help);
		
		JMenuItem open = new JMenuItem("Open");
		JMenuItem save = new JMenuItem("Save");
		JMenuItem saveas = new JMenuItem("Save As");
		file.add(open);
		file.add(save);
		file.add(saveas);
		
		
		
		j.add(title);
		j.add(uname);
		j.add(unameT);
		j.add(email);
		j.add(emailt);
		j.add(pass);
		j.add(passT);
		j.add(gender);
		j.add(male);
		j.add(female);
		j.add(lang);
		j.add(j1);
		j.add(j2);
		j.add(j3);
		j.add(j4);
		j.add(country);
		j.add(ct);
		j.add(submit);
		j.add(menu);
		
		
		
		
		
		
		
	}

}
