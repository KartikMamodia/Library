import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class LibrarianLogin extends JFrame {
	static JFrame frame;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new JFrame();
					frame.setVisible(true);
					frame.setSize(400,300);
					frame.setLayout(null);
					
					new LibrarianLogin();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LibrarianLogin() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblAdminLoginForm = new JLabel("Librarian Login Form");
		lblAdminLoginForm.setBounds(100,10,180,30);
		frame.add(lblAdminLoginForm);
		lblAdminLoginForm.setForeground(Color.GRAY);
		lblAdminLoginForm.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblEnterName = new JLabel("Enter Name:");
		lblEnterName.setBounds(30,80,100,30);
		frame.add(lblEnterName);
		JLabel lblEnterPassword = new JLabel("Enter Password:");
		lblEnterPassword.setBounds(30,130,100,30);
		frame.add(lblEnterPassword);
		
		textField = new JTextField();
		textField.setBounds(140,80,180,30);
		frame.add(textField);
		textField.setColumns(10);
		
		
		passwordField=new JPasswordField();
		passwordField.setBounds(140,130,180,30);
		frame.add(passwordField);
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(150,170,100,50);
		frame.add(btnLogin);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String name=textField.getText();
			String password=String.valueOf(passwordField.getPassword());
			//System.out.println(name+" "+password);
			if(LibrarianDao.validate(name, password)){
				LibrarianSuccess.main(new String[]{});
				frame.dispose();
			}else{
				JOptionPane.showMessageDialog(LibrarianLogin.this, "Sorry, Username or Password Error","Login Error!", JOptionPane.ERROR_MESSAGE);
				textField.setText("");
				passwordField.setText("");
			}
			}
		});
	}
}
