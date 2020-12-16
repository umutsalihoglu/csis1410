import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SignUp extends JFrame {

	private JPanel contentPane;
	private JTextField textField_newUsername;
	private JTextField textField_newPassword;
	static String newUsername ;
	static String newPassword ; 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp frame = new SignUp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the frame.
	 */
	public SignUp() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 352, 430);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registeration");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(29, 2, 263, 20);
		contentPane.add(lblNewLabel);
		
		textField_newUsername = new JTextField();
		textField_newUsername.setBounds(70, 240, 205, 20);
		contentPane.add(textField_newUsername);
		textField_newUsername.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Username:");
		lblNewLabel_1.setBounds(70, 215, 69, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password:");
		lblNewLabel_1_1.setBounds(70, 271, 69, 14);
		contentPane.add(lblNewLabel_1_1);
		
		textField_newPassword = new JTextField();
		textField_newPassword.setColumns(10);
		textField_newPassword.setBounds(70, 296, 205, 20);
		contentPane.add(textField_newPassword);
		
		/**
		 * When I click register, these codes on the below work and write newUsername and newPassword and then go back Main.java, read users CVS to login.
		 */
		
		JButton btn_Register = new JButton("Register");
		btn_Register.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				newUsername = textField_newUsername.getText();
				newPassword = textField_newPassword.getText();
				
				Main frame1 = new Main();
				frame1.addUser(newUsername, newPassword);
				frame1.setVisible(true);
			}
		});
		btn_Register.setBounds(71, 344, 205, 36);
		contentPane.add(btn_Register);
		
		JLabel lblsignUp = new JLabel("");
		Image image = new ImageIcon(this.getClass().getResource("signup.png")).getImage();
		lblsignUp.setIcon(new ImageIcon(image));
		lblsignUp.setBounds(100, 33, 128, 128);
		contentPane.add(lblsignUp);
	}

}
