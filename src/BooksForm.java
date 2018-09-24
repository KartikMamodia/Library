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
import javax.swing.LayoutStyle.ComponentPlacement;

public class BooksForm extends JFrame {
	static JFrame frame;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new JFrame();
					frame.setVisible(true);
					frame.setSize(500,400);
					frame.setLayout(null);
					new BooksForm();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BooksForm() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 404);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblAddBooks = new JLabel("Add Books");
		lblAddBooks.setBounds(200,20,100,30);
		frame.add(lblAddBooks);
		
		lblAddBooks.setForeground(Color.GRAY);
		lblAddBooks.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblCallNo = new JLabel("Call No:");
		lblCallNo.setBounds(50,70,60,30);
		frame.add(lblCallNo);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(50,110,60,30);
		frame.add(lblName);
		JLabel lblAuthor = new JLabel("Author:");
		lblAuthor.setBounds(50,150,60,30);
		frame.add(lblAuthor);
		JLabel lblPublisher = new JLabel("Publisher:");
		lblPublisher.setBounds(50,190,60,30);
		frame.add(lblPublisher);
		JLabel lblQuantity = new JLabel("Quantity:");
		lblQuantity.setBounds(50,230,60,30);
		frame.add(lblQuantity);
		
		textField = new JTextField();
		textField.setBounds(120,70,200,30);
		frame.add(textField);

		textField_1 = new JTextField();
		textField_1.setBounds(120,110,200,30);
		frame.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(120,150,200,30);
		frame.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(120,190,200,30);
		frame.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setBounds(120,230,200,30);
		frame.add(textField_4);
		
		JButton btnAddBooks = new JButton("Add Books");
		btnAddBooks.setBounds(180,300,100,30);
		frame.add(btnAddBooks);
		btnAddBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String callno=textField.getText();
			String name=textField_1.getText();
			String author=textField_2.getText();
			String publisher=textField_3.getText();
			String squantity=textField_4.getText();
			int quantity=Integer.parseInt(squantity);
			int i=BookDao.save(callno, name, author, publisher, quantity);
			if(i>0){
				JOptionPane.showMessageDialog(BooksForm.this,"Books added successfully!");
				LibrarianSuccess.main(new String[]{});
				frame.dispose();
				
			}else{
				JOptionPane.showMessageDialog(BooksForm.this,"Sorry, unable to save!");
			}
			}
		});
	}

}
