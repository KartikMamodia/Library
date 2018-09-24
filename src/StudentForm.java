import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.*; 
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
import javax.swing.JPasswordField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentForm extends JFrame {
	static JFrame frame;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
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
					frame.setSize(500,500);
					frame.setLayout(null);
					new StudentForm();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public StudentForm() {
		
		 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblAddStudent = new JLabel("Add Student");
		lblAddStudent.setBounds(180,50,200,30);
		frame.add(lblAddStudent);
		lblAddStudent.setForeground(Color.DARK_GRAY);
		lblAddStudent.setFont(new Font("Tahoma", Font.PLAIN, 22));
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(40,100,80,30);
		frame.add(lblName);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(40,140,80,30);
		frame.add(lblPassword);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(40,180,80,30);
		frame.add(lblEmail);
		
		
		JLabel lblEnrollment = new JLabel("Enrollment No.");
		lblEnrollment.setBounds(40,220,80,30);
		frame.add(lblEnrollment);
		
		JLabel lblCity = new JLabel("Department:");
		lblCity.setBounds(40,260,80,30);
		frame.add(lblCity);
		
		JLabel lblContactNo = new JLabel("Contact No:");
		lblContactNo.setBounds(40,300,80,30);
		frame.add(lblContactNo);
		
		
		
				
		textField = new JTextField();
		textField.setBounds(150,100,200,30);
		frame.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(150,140,200,30);
		frame.add(passwordField);
		passwordField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(150,180,200,30);
		frame.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(150,220,200,30);
		frame.add(textField_2);
		textField_2.setColumns(10);
		
		String[] option = { " ","CSE-1","CSE-2","CSE-3","IT-1","IT-2","IT-3","ECE-1","ECE-2","ECE-3","EEE"};  
		JComboBox box = new JComboBox(option); 
		box.setBounds(150,260,200,30);
		frame.add(box);
		
		textField_3 = new JTextField();
		textField_3.setBounds(150,300,200,30);
		frame.add(textField_3);
		
		JButton btnNewButton = new JButton("Add Student");
		btnNewButton.setBounds(150,330,150,50);
		frame.add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String name=textField.getText();
			String password=String.valueOf(passwordField.getPassword());
			String email=textField_1.getText();
			String enrollment=textField_2.getText();
			String department="";
			department=department+box.getItemAt(box.getSelectedIndex());
			String contact=textField_3.getText();

			int i=StudentDao.save(enrollment,name, password,department,email, contact);
			if(i>0){
				JOptionPane.showMessageDialog(StudentForm.this,"Student added successfully!");
				AdminSuccess.main(new String[]{});
				frame.dispose();
				
			}else{
				JOptionPane.showMessageDialog(StudentForm.this,"Sorry, unable to save! Try changing Enrollment number.!");
			}
			}
		});
		btnNewButton.setForeground(Color.DARK_GRAY);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			LibrarianSuccess.main(new String[]{});
			frame.dispose();
			}
		});
		
	}

}
