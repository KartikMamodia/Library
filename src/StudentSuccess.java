import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentSuccess extends JFrame {
	static JFrame frame;
	private JPanel contentPane;
 
	/**
	 * Launch the application.
	 */
	public static void main(String args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new JFrame();
					frame.setSize(500,500);
					frame.setLayout(null);
					frame.setVisible(true);
					new StudentSuccess(args);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public StudentSuccess(String enrollment) {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 433);
		contentPane = new JPanel();
		contentPane.setForeground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblStudentSection = new JLabel("Student Section");
		lblStudentSection.setBounds(140,30,200,50);
		frame.add(lblStudentSection);
		lblStudentSection.setFont(new Font("Tahoma", Font.PLAIN, 22));
		
		JButton btnIssueButton = new JButton("Issue Books");
		btnIssueButton.setBounds(120,90,220,30);
		frame.add(btnIssueButton);
		btnIssueButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			IssueBookForm.main(enrollment);
			frame.dispose();
			}
		});
		btnIssueButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JButton btnReturnBooks = new JButton("Return Books");
		btnReturnBooks.setBounds(120,130,220,30);
		frame.add(btnReturnBooks);
		btnReturnBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ReturnBook.main(new String[]{});
			}
		});
		btnReturnBooks.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JButton btnFine = new JButton("Fine");
		btnFine.setBounds(120,170,220,30);
		frame.add(btnFine);
		btnFine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//IssueBookForm.main(new String[]{});
				frame.dispose();
			}
		});
		btnFine.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JButton btnViewIssuedBooks = new JButton("View Issued Books");
		btnViewIssuedBooks.setBounds(120,210,220,30);
		frame.add(btnViewIssuedBooks);
		btnViewIssuedBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewIssuedBooks.main(new String[]{});
			}
		});
		btnViewIssuedBooks.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JButton btnViewBook = new JButton("View Book");
		btnViewBook.setBounds(120,250,220,30);
		frame.add(btnViewBook);
		btnViewBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewBooks.main(new String[]{});
				frame.dispose();
			}
		});
		btnViewBook.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JButton btnRequestBooks = new JButton("Request Books");
		btnRequestBooks.setBounds(120,290,220,30);
		frame.add(btnRequestBooks);
		btnRequestBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RequestBookForm.main(new String[]{});
				frame.dispose();
			}
		});
		btnRequestBooks.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		
		JButton btnLibraryCard = new JButton("Library Card");
		btnLibraryCard.setBounds(120,330,220,30);
		frame.add(btnLibraryCard);
		btnLibraryCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LibraryCard.main(new String[]{});
				frame.dispose();
			}
		});
		btnLibraryCard.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setBounds(120,370,220,30);
		frame.add(btnLogout);
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Library.main(new String[]{});
				frame.dispose();
			}
		});
		btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
	}

}
