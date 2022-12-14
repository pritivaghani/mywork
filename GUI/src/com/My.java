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

public class My {

	public static void main(String[] args) {

		JFrame j = new JFrame();
		j.setSize(800, 800);
		j.setVisible(true);
		j.setTitle("Demo 1");
		j.setLayout(null);
		
		JLabel title = new JLabel("Registration Form");
		title.setBounds(300, 20, 200, 50);
		
		JLabel username = new JLabel("Username");
		username.setBounds(100, 80, 100, 20);
		JTextField u = new JTextField();
		u.setBounds(200, 80, 100, 20);
		
		JLabel email = new JLabel("Email");
		email.setBounds(100, 110, 100, 20);
		JTextField e = new JTextField();
		e.setBounds(200, 110, 100, 20);
		
		JLabel password = new JLabel("Password");
		password.setBounds(100, 140, 100, 20);
		JPasswordField p = new JPasswordField();
		p.setBounds(200, 140, 100, 20);
		
		JLabel gender = new JLabel("Gender");
		gender.setBounds(100, 170, 100, 20);
		JRadioButton male = new JRadioButton("Male");
		male.setBounds(200, 170, 100, 20);
		JRadioButton female = new JRadioButton("Female");
		female.setBounds(300, 170, 100, 20);
		ButtonGroup btn = new ButtonGroup();
		btn.add(male);
		btn.add(female);
		
		JLabel l = new JLabel("languages");
		l.setBounds(100, 200, 100, 20);
		JCheckBox l1 = new JCheckBox("Hindi");
		JCheckBox l2 = new JCheckBox("English");
		JCheckBox l3 = new JCheckBox("Gujarati");
		JCheckBox l4 = new JCheckBox("Telugu");
		l1.setBounds(200, 200, 100, 20);
		l2.setBounds(300, 200, 100, 20);
		l3.setBounds(200, 230, 100, 20);
		l4.setBounds(300, 230, 100, 20);
		
		String allc[] = {"India","Canada","USA","UK","Japan"};
		JLabel c = new JLabel("Country");
		c.setBounds(100, 260, 100, 20);
		JComboBox<String> ct = new JComboBox<String>(allc);
		ct.setBounds(200, 260, 100, 20);
		
		JButton s = new JButton("Submit");
		s.setBounds(200, 290, 100, 20);
		
		JMenuBar m = new JMenuBar();
		m.setBounds(0, 0, 800, 20);
		
		JMenu f = new JMenu("File");
		JMenu e1 = new JMenu("Edit");
		JMenu s1 = new JMenu("Source");
		JMenu h = new JMenu("Help");
		m.add(f);
		m.add(e1);
		m.add(s1);
		m.add(h);
		
		JMenuItem o = new JMenuItem("Open");
		JMenuItem s2 = new JMenuItem("Save");
		JMenuItem n = new JMenuItem("New");
		JMenuItem c1 = new JMenuItem("Copy");
		f.add(o);
		f.add(s2);
		f.add(n);
		f.add(c1);
		
		
		j.add(title);
		j.add(username);
		j.add(u);
		j.add(email);
		j.add(e);
		j.add(password);
		j.add(p);
		j.add(gender);
		j.add(male);
		j.add(female);
		j.add(l);
		j.add(l1);
		j.add(l2);
		j.add(l3);
		j.add(l4);
		j.add(c);
		j.add(ct);
		j.add(s);
		j.add(m);
		
	}

}
