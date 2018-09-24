import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
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
import java.sql.*;

public class LibraryCard extends JFrame {
	static JFrame frame;
	private JPanel contentPane;
	String name;
	String contact;
	String mailid;
	String id;
	String enrollment;
	String department;
 
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
					new LibraryCard();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LibraryCard() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 433);
		contentPane = new JPanel();
		contentPane.setForeground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		try{
			Connection con=DB.getConnection();
			Statement ss=con.createStatement();
		
			ResultSet rs=ss.executeQuery("select * from student where enrollment='41213202815'");
			while(rs.next())
			{
				name=rs.getString("name");
				enrollment=rs.getString("enrollment");
				department=rs.getString("department");
				mailid=rs.getString("email");
				contact=rs.getString("contact");
				id=rs.getString("id");
			}
			
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println(name);
		System.out.println(enrollment);
		System.out.println(department);
		System.out.println(mailid);
		System.out.println(contact);
		System.out.println(id);

		
		
	}

}
