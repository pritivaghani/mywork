package modual;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JMenuBar;
import javax.swing.JScrollBar;
import javax.swing.JMenu;
import javax.swing.JProgressBar;

public class Swing {

	private JFrame frmRegistrationForm;
	private JTextField id;
	private JTextField name;
	private JTextField address;
	private JTextField contact;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Swing window = new Swing();
					window.frmRegistrationForm.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Swing() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRegistrationForm = new JFrame();
		frmRegistrationForm.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		frmRegistrationForm.setTitle("Registration Form");
		frmRegistrationForm.setBounds(100, 100, 825, 637);
		frmRegistrationForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRegistrationForm.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(25, 23, 293, 489);
		frmRegistrationForm.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registration Form");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBackground(new Color(240, 240, 240));
		lblNewLabel.setBounds(125, 5, 140, 25);
		panel.add(lblNewLabel);
		
		JLabel lblID = new JLabel("ID");
		lblID.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblID.setBackground(SystemColor.menu);
		lblID.setBounds(10, 59, 140, 25);
		panel.add(lblID);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblName.setBackground(SystemColor.menu);
		lblName.setBounds(10, 110, 130, 25);
		panel.add(lblName);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblGender.setBackground(SystemColor.menu);
		lblGender.setBounds(10, 164, 140, 25);
		panel.add(lblGender);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAddress.setBackground(SystemColor.menu);
		lblAddress.setBounds(10, 216, 140, 25);
		panel.add(lblAddress);
		
		JLabel lblContact = new JLabel("Contact");
		lblContact.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblContact.setBackground(SystemColor.menu);
		lblContact.setBounds(10, 271, 140, 25);
		panel.add(lblContact);
		
		id = new JTextField();
		id.setBounds(96, 59, 169, 29);
		panel.add(id);
		id.setColumns(10);
		
		name = new JTextField();
		name.setColumns(10);
		name.setBounds(96, 110, 169, 29);
		panel.add(name);
		
		address = new JTextField();
		address.setColumns(10);
		address.setBounds(96, 216, 169, 24);
		panel.add(address);
		
		contact = new JTextField();
		contact.setColumns(10);
		contact.setBounds(96, 271, 169, 24);
		panel.add(contact);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton.setBounds(96, 168, 103, 21);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Female");
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton_1.setBounds(196, 168, 103, 21);
		panel.add(rdbtnNewRadioButton_1);
		
		JButton btnNewButton = new JButton("Exit");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(25, 325, 95, 29);
		panel.add(btnNewButton);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnRegister.setBounds(145, 325, 120, 29);
		panel.add(btnRegister);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnDelete.setBounds(25, 379, 95, 29);
		panel.add(btnDelete);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnUpdate.setBounds(145, 379, 120, 29);
		panel.add(btnUpdate);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnReset.setBounds(96, 435, 95, 29);
		panel.add(btnReset);
		
		table_1 = new JTable();
		table_1.setBounds(342, 23, 424, 458);
		frmRegistrationForm.getContentPane().add(table_1);
		
		JButton btnRefreshTable = new JButton("Refresh Table");
		btnRefreshTable.setBounds(461, 537, 194, 29);
		btnRefreshTable.setFont(new Font("Tahoma", Font.PLAIN, 16));
		frmRegistrationForm.getContentPane().add(btnRefreshTable);
		
		JScrollBar vertical = new JScrollBar();
		vertical.setBounds(765, 23, 25, 458);
		frmRegistrationForm.getContentPane().add(vertical);
		
		JScrollBar horizontal = new JScrollBar();
		horizontal.setOrientation(JScrollBar.HORIZONTAL);
		horizontal.setBounds(342, 483, 448, 29);
		frmRegistrationForm.getContentPane().add(horizontal);
	}
}
