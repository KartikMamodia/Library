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

public class DeleteLibrarian extends JFrame {
static JFrame frame;
private JPanel contentPane;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new JFrame();
					frame.setVisible(true);
					frame.setSize(500,400);
					frame.setLayout(null);
					new DeleteLibrarian();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DeleteLibrarian() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		

/********************************************************************************/
		JLabel lblID = new JLabel("ID:");
		lblID.setBounds(50,110,60,30);
		frame.add(lblID);

		JTextField side = new JTextField();
		side.setBounds(120,110,200,30);
		frame.add(side);
/********************************************************************************/

/********************************************************************************/

		JLabel pass = new JLabel("Password");
		pass.setBounds(50,150,60,30);
		frame.add(pass);

		JTextField	passworde = new JTextField();
		passworde.setBounds(120,150,200,30);
		frame.add(passworde);


/********************************************************************************/

		String sid=side.getText();
		String password=passworde.getText();



/********************************************************************************/






/********************************************************************************/

		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(180,300,100,30);
		frame.add(btnDelete);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String sid=side.getText();
				if(sid==null||sid.trim().equals("")){
					JOptionPane.showMessageDialog(DeleteLibrarian.this,"Id can't be blank");

				}else{
					int id=Integer.parseInt(sid);
					int i=LibrarianDao.delete(id,password);
					if(i>0){
						JOptionPane.showMessageDialog(DeleteLibrarian.this,"Record deleted successfully!");
					}else{
						JOptionPane.showMessageDialog(DeleteLibrarian.this,"Unable to delete given id!");
					}
					frame.dispose();
				}
			}
		});
		
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminSuccess.main(new String[]{});
				frame.dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
	}
}
