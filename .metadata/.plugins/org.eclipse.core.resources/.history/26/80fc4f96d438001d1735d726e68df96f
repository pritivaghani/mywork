package fristconnection;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Combo_connection {

	private JFrame frame;
	private JTextField name;
	private JTextField email;
	private JTextField phno;

    
	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Combo_connection window = new Combo_connection();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	
	public Combo_connection() {
		initialize();
	}

      Connection c;
       
	public void connection()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/16june","root","");
			}
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 18));
		frame.setBounds(100, 100, 798, 693);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(22, 79, 344, 271);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblName.setBounds(25, 33, 96, 24);
		panel.add(lblName);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEmail.setBounds(25, 76, 96, 24);
		panel.add(lblEmail);
		
		JLabel lblPhno = new JLabel("Phno");
		lblPhno.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPhno.setBounds(25, 122, 96, 24);
		panel.add(lblPhno);
		
		name = new JTextField();
		name.setBounds(131, 38, 169, 19);
		panel.add(name);
		name.setColumns(10);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(131, 81, 169, 19);
		panel.add(email);
		
		phno = new JTextField();
		phno.setColumns(10);
		phno.setBounds(131, 127, 169, 19);
		panel.add(phno);
		
		JButton btnNewButton = new JButton("Reset");
		btnNewButton.setBounds(131, 166, 169, 31);
		panel.add(btnNewButton);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String sname = name.getText();
				String semail = email.getText();
				String sphno = phno.getText();
				
				try {
					PreparedStatement p = c.prepareStatement("insert into sreg values(?,?,?,?)");
					p.setInt(1, 0);
					p.setString(2, sname);
					p.setString(3, semail);
					p.setString(4, sphno);
					int a = p.executeUpdate();
					if(a>0)
					{
						System.out.println("data inserted");
					}
					
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		btnSubmit.setBounds(131, 207, 169, 31);
		panel.add(btnSubmit);
		
		JLabel lblNewLabel = new JLabel("Student Registration");
		lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 16));
		lblNewLabel.setBounds(313, 32, 223, 24);
		frame.getContentPane().add(lblNewLabel);
	}
}
