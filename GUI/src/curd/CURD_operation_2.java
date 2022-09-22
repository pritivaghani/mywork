package curd;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JTextField;
import javax.swing.table.TableModel;

import net.proteanit.sql.DbUtils;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class CURD_operation_2 {

	private JFrame frame;
	private JTextField name;
	private JTextField number;
	private JTextField code;
	private int updateid;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CURD_operation_2 window = new CURD_operation_2();
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
	public CURD_operation_2() {
		initialize();
		connection();
		loaddata();
	}
	Connection c;
	private JTable table;
	private JTextField bid;
	
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
			PreparedStatement p = c.prepareStatement("select * from bank");
			ResultSet r = p.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(r));
		}
catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 833, 716);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 59, 417, 348);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(24, 28, 84, 23);
		panel.add(lblNewLabel);
		
		JLabel lblAnumber = new JLabel("Number");
		lblAnumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAnumber.setBounds(24, 73, 84, 23);
		panel.add(lblAnumber);
		
		JLabel lblCode = new JLabel("Code");
		lblCode.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCode.setBounds(24, 117, 84, 23);
		panel.add(lblCode);
		
		name = new JTextField();
		name.setBounds(145, 22, 194, 29);
		panel.add(name);
		name.setColumns(10);
		
		number = new JTextField();
		number.setColumns(10);
		number.setBounds(145, 73, 194, 29);
		panel.add(number);
		
		code = new JTextField();
		code.setColumns(10);
		code.setBounds(145, 117, 194, 29);
		panel.add(code);
		
		JButton btnNewButton = new JButton("Reset");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				name.setText("");
				number.setText("");
				code.setText("");
				}
			
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(145, 179, 194, 29);
		panel.add(btnNewButton);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String aname = name.getText();
				String anumber = number.getText();
				String ifsccode = code.getText();
				
				try {
					
					if(updateid>0)
					{
						PreparedStatement p = c.prepareStatement("update bank set aname = ?, anumber = ?,ifsccode = ? where id = ?");
						p.setString(1, aname);
						p.setString(2, anumber);
						p.setString(3, ifsccode);
						p.setInt(4, updateid);
						
						int a = p.executeUpdate();
						if(a>0)
						{
							JOptionPane.showMessageDialog(frame, "data updated...");
							loaddata();
						}
					}
					else
					{
					PreparedStatement p = c.prepareStatement("insert into bank values(?, ?, ?, ?)");
				p.setInt(1, 0);
				p.setString(2, aname);
				p.setString(3, anumber);
				p.setString(4, ifsccode);
				
				int a = p.executeUpdate();
				if(a>0)
				{
					name.setText("");
					number.setText("");
					code.setText("");
					JOptionPane.showMessageDialog(frame,"data inserted successfully..");
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
		btnSubmit.setBounds(145, 231, 194, 29);
		panel.add(btnSubmit);
		
		JLabel lblBankRegistration = new JLabel("Bank Registration");
		lblBankRegistration.setFont(new Font("Tahoma", Font.ITALIC, 18));
		lblBankRegistration.setBounds(313, 21, 190, 23);
		frame.getContentPane().add(lblBankRegistration);
		
		table = new JTable();
		table.setBounds(460, 59, 349, 348);
		frame.getContentPane().add(table);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 452, 799, 187);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblId = new JLabel("Id");
		lblId.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblId.setBounds(42, 66, 84, 23);
		panel_1.add(lblId);
		
		bid = new JTextField();
		bid.setColumns(10);
		bid.setBounds(124, 60, 194, 29);
		panel_1.add(bid);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(bid.getText());
				
				try {
					PreparedStatement p = c.prepareStatement("delete from bank where id = ?");
					p.setInt(1, id);
					int a = p.executeUpdate();
					if(a>0)
					{
						JOptionPane.showMessageDialog(frame, "deleted successfully!!");
						loaddata();
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnDelete.setBounds(426, 28, 194, 29);
		panel_1.add(btnDelete);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(bid.getText());
				
				try {
					PreparedStatement p = c.prepareStatement("select * from bank where id = ?");
					p.setInt(1, id);
					ResultSet r = p.executeQuery();
					if(r.next())
					{
						updateid = r.getInt(1);
					   name.setText(r.getString(2));
					   number.setText(r.getString(3));
					   code.setText(r.getString(4));
					  
					}
					else
					{
						JOptionPane.showMessageDialog(frame, "invalid id...");
					}
				} catch (SQLException e1) {
					JOptionPane.showMessageDialog(frame, "invalid id...");
				}
				
			}
		});
		btnEdit.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnEdit.setBounds(426, 90, 194, 29);
		panel_1.add(btnEdit);
	}
}
