import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField textField_username;
	private JTextField textField_password;
	static String username ;
	static String password ; 
	static String admin;
	JPasswordField password_field = new JPasswordField(30);
	/**
	 * @author Umut Salihoglu
	 * CSIS1410
	 * December 15th, 2020
	 * These codes on the below works to get a GUI and when I create a GUI page it comes with these code.
	 * Launch the application.
	 */
	public static void main(String[] args) {
	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});	
	}
	/**
	 * These codes on the below, read User CVS and check if its correct or not. if its not Correct, line 61 works and it gives an ERROR.
	 * Also, I did admin = username; because when I login , I wanted apps to say 'welcome, ...'  
	 */
	public void Login(String username,String password) {
		CSVRead csvreader = new CSVRead();
		String[][] users = csvreader.readCSV2();
		
		for(int i = 0 ; i < users.length; i++) {
			if(users[i][0].equals(username) && users[i][1].equals(password)) {
				admin = username;
				ManagementConsole frame1 = new ManagementConsole();
				frame1.setVisible(true);
				break;
			}else if(i == users.length-1){
				Main frame = new Main();
				frame.setVisible(true);
				JOptionPane.showMessageDialog(frame,"Login Failed, Please Try Again..","Login Failed!",JOptionPane.ERROR_MESSAGE);
			}
		
		}
		
	}
	public void addUser(String username,String password) {
		CSVRead csvreader = new CSVRead();
		String[][] users = csvreader.readCSV2();
		
		ArrayList<String> temp = new ArrayList<String>();
		
		for(int i = 0 ; i < users.length ; i++) {
			temp.add(users[i][0]+","+users[i][1]);
		}
		temp.add(username+","+password);
	
		String[][] array = new String[temp.size()][2];
		for (int i = 0; i < temp.size(); i++) {
		    String[] row = temp.get(i).split(",");
		    array[i][0]=row[0];
		    array[i][1]=row[1];
		}

		CSVWrite csvwriter = new CSVWrite();
		csvwriter.WriteData2(array);
	}
	/**
	 * Create the frame.
	 */
	public Main() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 380, 390);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField_username = new JTextField();
		textField_username.setBounds(99, 196, 168, 20);
		contentPane.add(textField_username);
		textField_username.setColumns(10);
		
		textField_password = new JTextField();
		textField_password.setColumns(10);
		textField_password.setBounds(99, 252, 168, 20);
		contentPane.add(textField_password);
		
		JButton btn_login = new JButton("LOGIN");
		btn_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Login(textField_username.getText(),textField_password.getText());
				
				
			}
		});
		btn_login.setBounds(99, 283, 168, 23);
		contentPane.add(btn_login);
		
		JLabel lbl_username = new JLabel("Username:");
		lbl_username.setBounds(99, 171, 168, 14);
		contentPane.add(lbl_username);
		
		JLabel lbl_password = new JLabel("Password:");
		lbl_password.setBounds(99, 227, 168, 14);
		contentPane.add(lbl_password);
		
		JButton btn_login_1 = new JButton("SIGN UP");
		btn_login_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SignUp frame1 = new SignUp();
				
				frame1.setVisible(true);
				
			}
		});
		btn_login_1.setBounds(99, 317, 168, 23);
		contentPane.add(btn_login_1);
		
		JLabel lblimages = new JLabel("");
		Image image = new ImageIcon(this.getClass().getResource("login4.png")).getImage();
		lblimages.setIcon(new ImageIcon(image));
		lblimages.setBounds(120, 11, 128, 128);
		contentPane.add(lblimages);
	}
}
