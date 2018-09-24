import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IssueBookForm extends JFrame {
	static JFrame frame;
	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new JFrame();
					frame.setVisible(true);
					frame.setSize(500,350);
					frame.setLayout(null);
					new IssueBookForm(args);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public IssueBookForm(String enrollmentconst) {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 438, 414);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Issue Book ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setForeground(Color.GRAY);
		lblNewLabel.setBounds(50,30,100,30);
		frame.add(lblNewLabel);
		
		
		JLabel lblBookName = new JLabel("Book Callno:");
		lblBookName.setBounds(50,70,80,30);
		frame.add(lblBookName);
		
		
		JLabel lblEnrollment = new JLabel("Enrollment No.");
		lblEnrollment.setBounds(50,110,110,30);
		frame.add(lblEnrollment);
		
		
		JLabel lblStudentName = new JLabel("Student Name:");
		lblStudentName.setBounds(50,150,110,30);
		frame.add(lblStudentName);
		
		JLabel lblStudentContact = new JLabel("Student Contact:");
		lblStudentContact.setBounds(50,190,110,30);
		frame.add(lblStudentContact);
		
		textField_1 = new JTextField();
		textField_1.setBounds(180,70,200,30);
		frame.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(180,110,200,30);
		frame.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(180,150,200,30);
		frame.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setBounds(180,190,200,30);
		frame.add(textField_4);
		
		
		
		JButton btnIssueBook = new JButton("Issue Book");
		btnIssueBook.setBounds(100,250,100,30);
		frame.add(btnIssueBook);
		
		btnIssueBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			String bookcallno=textField_1.getText();
			String enrollment=textField_2.getText();
			String studentname=textField_3.getText();
			String studentcontact=textField_4.getText();
			if(!enrollment.equals(enrollmentconst))
			{
				JOptionPane.showMessageDialog(IssueBookForm.this,"Enter Your Enrollment number.!");
			}
			//System.out.println("Available");
			else
			{
			if(IssueBookDao.checkBook(bookcallno)){
			
			int i=IssueBookDao.save(bookcallno, enrollment, studentname, studentcontact);
			if(i>0){
				JOptionPane.showMessageDialog(IssueBookForm.this,"Book issued successfully!");
				Library.main(new String[]{});
				frame.dispose();
				
			}else{
				JOptionPane.showMessageDialog(IssueBookForm.this,"Sorry, unable to issue!");
			}//end of save if-else
			
			}else{
				JOptionPane.showMessageDialog(IssueBookForm.this,"Sorry, Callno doesn't exist!");
			}//end of checkbook if-else
			
			}
		}
		});
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(250,250,100,30);
		frame.add(btnBack);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LibrarianSuccess.main(new String[]{});
				frame.dispose();
			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("Note: Please check Student ID Carefully before issuing book!");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setForeground(Color.RED);
		
	}
}
