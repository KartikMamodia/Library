import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Library extends JFrame {
	static JFrame frame;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() {
				try {
					frame= new JFrame();
					frame.setVisible(true);
					frame.setLayout(null);
					frame.setSize(500,500);
					new Library();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the frame.
	 */
	public Library() {
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblLibraryManagement = new JLabel("Library -Kartik Mamodia");
		lblLibraryManagement.setBounds(140,30,200,50);
		frame.add(lblLibraryManagement);
		lblLibraryManagement.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblLibraryManagement.setForeground(Color.GRAY);
	/**************************************************************************************************/	
		JButton btnAdminLogin = new JButton("Admin Login");
		btnAdminLogin.setBounds(70,140,150,150);
		frame.add(btnAdminLogin);
		btnAdminLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			AdminLogin.main(new String[]{});
			frame.dispose();
			}
		});
		btnAdminLogin.setFont(new Font("Tahoma", Font.PLAIN, 15));
	/**************************************************************************************************/		
		JButton btnLibrarianLogin = new JButton("Librarian Login");
		btnLibrarianLogin.setBounds(250,140,150,150);
		frame.add(btnLibrarianLogin);
		btnLibrarianLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LibrarianLogin.main(new String[]{});
			}
		});
		
		btnLibrarianLogin.setFont(new Font("Tahoma", Font.PLAIN, 15));
	/**************************************************************************************************/		
		JButton btnStudentLogin = new JButton("Student Login");
		btnStudentLogin.setBounds(150,300,150,150);
		frame.add(btnStudentLogin);
		btnStudentLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				StudentLogin.main(new String[]{});
			}
		});
	/**************************************************************************************************/
		
	}
}
