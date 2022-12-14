package calculation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calc2 {

	private JFrame frame;
	private JTextField n1;
	private JTextField n2;
	private JTextField r;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc2 window = new Calc2();
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
	public Calc2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 715, 622);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("number 1");
		lblNewLabel.setBounds(124, 52, 83, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNumber = new JLabel("number 2 ");
		lblNumber.setBounds(124, 87, 83, 25);
		frame.getContentPane().add(lblNumber);
		
		JLabel lblResult = new JLabel("result");
		lblResult.setBounds(124, 122, 83, 25);
		frame.getContentPane().add(lblResult);
		
		n1 = new JTextField();
		n1.setBounds(209, 57, 194, 15);
		frame.getContentPane().add(n1);
		n1.setColumns(10);
		
		n2 = new JTextField();
		n2.setColumns(10);
		n2.setBounds(209, 87, 194, 15);
		frame.getContentPane().add(n2);
		
		r = new JTextField();
		r.setColumns(10);
		r.setBounds(209, 125, 194, 15);
		frame.getContentPane().add(r);
		
		JButton btnNewButton = new JButton("add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(n1.getText());
				int b = Integer.parseInt(n2.getText());
				int c = a + b;
				r.setText(c+"");
			}
		});
		btnNewButton.setBounds(172, 170, 85, 21);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnDiv = new JButton("div");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(n1.getText());
				int b = Integer.parseInt(n2.getText());
				int c = a / b;
				r.setText(c+"");
			}
		});
		btnDiv.setBounds(172, 221, 85, 21);
		frame.getContentPane().add(btnDiv);
		
		JButton btnMul = new JButton("mul");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(n1.getText());
				int b = Integer.parseInt(n2.getText());
				int c = a * b;
				r.setText(c+"");
			}
		});
		btnMul.setBounds(336, 170, 85, 21);
		frame.getContentPane().add(btnMul);
		
		JButton btnSub = new JButton("sub");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(n1.getText());
				int b = Integer.parseInt(n2.getText());
				int c = a - b;
				r.setText(c+"");
			}
		});
		btnSub.setBounds(336, 221, 85, 21);
		frame.getContentPane().add(btnSub);
	}
}
