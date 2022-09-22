package calculation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Calc1 {

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
					Calc1 window = new Calc1();
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
	public Calc1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 734, 644);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		n1 = new JTextField();
		n1.setBounds(262, 37, 213, 19);
		frame.getContentPane().add(n1);
		n1.setColumns(10);
		
		n2 = new JTextField();
		n2.setBounds(262, 68, 213, 19);
		frame.getContentPane().add(n2);
		n2.setColumns(10);
		
		r = new JTextField();
		r.setBounds(262, 104, 213, 19);
		frame.getContentPane().add(r);
		r.setColumns(10);
		
		JButton add = new JButton("add");
		add.setBackground(new Color(128, 128, 0));
		add.setForeground(new Color(0, 0, 0));
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		int a = Integer.parseInt(n1.getText());
		int b = Integer.parseInt(n2.getText());
	     int c = a + b;
	     r.setText(c+"");
			}
		});
		add.setBounds(262, 142, 112, 21);
		frame.getContentPane().add(add);
		
		JLabel name = new JLabel("number 1");
		name.setBounds(176, 40, 45, 13);
		frame.getContentPane().add(name);
		
		JLabel lblNewLabel = new JLabel("number 2");
		lblNewLabel.setBounds(176, 71, 45, 13);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("result");
		lblNewLabel_1.setBounds(176, 107, 45, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnDiv = new JButton("div");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(n1.getText());
				int b = Integer.parseInt(n2.getText());
				int c = a/b;
				r.setText(c+"");
			}
		});
		btnDiv.setBounds(262, 173, 112, 21);
		frame.getContentPane().add(btnDiv);
		
		JButton btnSub = new JButton("sub");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(n1.getText());
				int b = Integer.parseInt(n2.getText());
				int c = a - b;
				r.setText(c+"");
			}
		});
		btnSub.setBounds(412, 142, 112, 21);
		frame.getContentPane().add(btnSub);
		
		JButton btnMul = new JButton("mul");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(n1.getText());
				int b = Integer.parseInt(n2.getText());
				int c = a * b;
				r.setText(c+"");
			}
		});
		btnMul.setBounds(412, 173, 112, 21);
		frame.getContentPane().add(btnMul);
	}
}
