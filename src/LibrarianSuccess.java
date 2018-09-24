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

public class LibrarianSuccess extends JFrame {
	static JFrame frame;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new JFrame();
					frame.setSize(500,500);
					frame.setLayout(null);
					frame.setVisible(true);
					new LibrarianSuccess();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LibrarianSuccess() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 433);
		contentPane = new JPanel();
		contentPane.setForeground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblLibrarianSection = new JLabel("Librarian Section");
		lblLibrarianSection.setBounds(140,30,200,50);
		frame.add(lblLibrarianSection);
		lblLibrarianSection.setFont(new Font("Tahoma", Font.PLAIN, 22));
		
		JButton btnNewButton = new JButton("Add Books");
		btnNewButton.setBounds(120,90,220,30);
		frame.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			BooksForm.main(new String[]{});
			frame.dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JButton btnViewBooks = new JButton("View Books");
		btnViewBooks.setBounds(120,130,220,30);
		frame.add(btnViewBooks);
		btnViewBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ViewBooks.main(new String[]{});
			}
		});
		btnViewBooks.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JButton btnIssuedBook = new JButton("Issued Book");
		btnIssuedBook.setBounds(120,170,220,30);
		frame.add(btnIssuedBook);
		btnIssuedBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewIssuedBooks.main(new String[]{});
			}
		});
		btnIssuedBook.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JButton btnAddStudent = new JButton("Add Student");
		btnAddStudent.setBounds(120,210,220,30);
		frame.add(btnAddStudent);
		btnAddStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentForm.main(new String[]{});
				frame.dispose();
			}
		});
		btnAddStudent.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JButton btnViewStudents = new JButton("View Students");
		btnViewStudents.setBounds(120,250,220,30);
		frame.add(btnViewStudents);
		btnViewStudents.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewStudents.main(new String[]{});
				//frame.dispose();
			}
		});
		btnViewStudents.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JButton btnViewRequestedBooks = new JButton("View Requested Books");
		btnViewRequestedBooks.setBounds(120,290,220,30);
		frame.add(btnViewRequestedBooks);
		btnViewRequestedBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewRequestedBooks.main(new String[]{});
				//frame.dispose();
			}
		});
		btnViewRequestedBooks.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setBounds(120,330,220,30);
		frame.add(btnLogout);
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Library.main(new String[]{});
				frame.dispose();
			}
		});
		btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 13));




		JButton btnDelete = new JButton("Delete Student");
		btnDelete.setBounds(120,370,220,30);
		frame.add(btnDelete);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeleteStudent.main(new String[]{});
				frame.dispose();
			}
		});
		btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
	}

}
