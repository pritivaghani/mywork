package curd;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import net.proteanit.sql.DbUtils;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class CURD_operation_1 {

	private JFrame frame;
	private JTextField name;
	private JTextField email;
	private JTextField phno;
	private int updateid;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CURD_operation_1 window = new CURD_operation_1();
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
	public CURD_operation_1() {
		initialize();
		connection();
		loaddata();
	}

	Connection c ;
	private JTable table;
	private JTextField did;
	
	
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
	
	public void loaddata()
	{
		try {
			PreparedStatement p = c.prepareStatement("select * from sreg");
			ResultSet r = p.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(r));
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 793, 712);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 60, 377, 289);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(21, 10, 55, 28);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Email");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(21, 57, 55, 28);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Phno");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_2.setBounds(21, 108, 55, 28);
		panel.add(lblNewLabel_1_2);
		
		name = new JTextField();
		name.setBounds(118, 10, 223, 26);
		panel.add(name);
		name.setColumns(10);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(118, 57, 223, 26);
		panel.add(email);
		
		phno = new JTextField();
		phno.setColumns(10);
		phno.setBounds(118, 108, 223, 26);
		panel.add(phno);
		
		JButton btnNewButton = new JButton("Reset");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				name.setText("");
				email.setText("");
				phno.setText("");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(118, 171, 217, 28);
		panel.add(btnNewButton);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//System.out.println(updateid);
				String sname = name.getText();
				String semail = email.getText();
				String sphno = phno.getText();
				//System.out.println(sname+" "+semail+" "+sphno);				
		try {
		
	         if(updateid>0)
		{
			PreparedStatement p = c.prepareStatement("update sreg set sname = ?, semail = ?, sphno = ? where id =?");
			
			p.setInt(4, updateid);
            p.setString(1, sname);
            p.setString(2, semail);
			p.setString(3, sphno);
            int a = p.executeUpdate();
			if(a>0)
			{
				JOptionPane.showMessageDialog(frame,"data updated successfully..");
				loaddata();
			}
		}
						
		else
			{
			PreparedStatement p = c.prepareStatement("insert into sreg values(?,?,?,?)");
			
				p.setInt(1, 0);
				p.setString(2, sname);
				p.setString(3, semail);
				p.setString(4, sphno);
				int a = p.executeUpdate();
				if(a>0)
				{
					name.setText("");
					email.setText("");
					phno.setText("");
					JOptionPane.showMessageDialog(frame, "data inserted succesfully");
					loaddata();
				}
			}
					}
			catch (SQLException e1) {
				e1.printStackTrace();
					}
				}
			
		});
		btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSubmit.setBounds(118, 227, 217, 28);
		panel.add(btnSubmit);
		
		JLabel lblNewLabel = new JLabel("Student Registration");
		lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 18));
		lblNewLabel.setBounds(323, 20, 194, 30);
		frame.getContentPane().add(lblNewLabel);
		
		table = new JTable();
		table.setBounds(422, 60, 335, 289);
		frame.getContentPane().add(table);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 378, 748, 276);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1_3 = new JLabel("Id");
		lblNewLabel_1_3.setBounds(49, 97, 86, 20);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_1.add(lblNewLabel_1_3);
		
		did = new JTextField();
		did.setColumns(10);
		did.setBounds(124, 97, 223, 26);
		panel_1.add(did);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int id = Integer.parseInt(did.getText());
				
				try {
					PreparedStatement p = c.prepareStatement("delete from sreg where id = ?");
					p.setInt(1, id);
					int a = p.executeUpdate();
					if(a>0)
					{
						JOptionPane.showMessageDialog(frame, "delete successfully");
						loaddata();
					}
					
				}
				catch (SQLException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnDelete.setBounds(435, 93, 217, 28);
		panel_1.add(btnDelete);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(did.getText());
				try {
					PreparedStatement p = c.prepareStatement("select * from sreg where id = ?");
					p.setInt(1, id);
					ResultSet r = p.executeQuery();
					if(r.next())
					{
						updateid = r.getInt(1);
						name.setText(r.getString(2));
						email.setText(r.getString(3));
						phno.setText(r.getString(4));
					}
					else
					{
						JOptionPane.showMessageDialog(frame, "invalid id!!!");
					}
					
				} 
				catch (SQLException e1) {
					JOptionPane.showMessageDialog(frame, "invalid id!!!");

				}
				
			}
		});
		btnEdit.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnEdit.setBounds(435, 169, 217, 28);
		panel_1.add(btnEdit);
	}
}
