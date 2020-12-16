import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NewEmployee extends JFrame {

	private JPanel contentPane;
	private JTextField txt_employeeID;
	private JTextField txt_firstName;
	private JTextField txt_LastName;
	private JTextField txt_socialID;
	private JTextField txt_salary;
	private JTextField txt_department;
	private JTextField txt_type;
	private JTextField txt_bonusShift;
	private JTextField txt_carService;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewEmployee frame = new NewEmployee();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 *This is where I add new Employee to my CVS and I did the line String[] newEmployee = {employeeID,firstName,lastName,socialID,salary,department,type,bonusShift,carService};
	 *because my CSWRITE gets as a line and writes on cvs.
	 */
	public void NewEmployeeAdd() {
		
		String employeeID = txt_employeeID.getText();
		String firstName = txt_firstName.getText();
		String lastName = txt_LastName.getText();
		String socialID = txt_socialID.getText();
		String salary = txt_salary.getText();
		String department = txt_department.getText();
		String type = txt_type.getText();
		String bonusShift = txt_bonusShift.getText();
		String carService = txt_carService.getText();
		
		String[] newEmployee = {employeeID,firstName,lastName,socialID,salary,department,type,bonusShift,carService};
		CSVWrite csvwriter = new CSVWrite();
		csvwriter.WriteData(newEmployee);
		
	}
	/**
	 * Create the frame.
	 */
	public NewEmployee() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 390, 460);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_employeeID = new JLabel("Employee ID: ");
		lbl_employeeID.setBounds(10, 63, 78, 19);
		contentPane.add(lbl_employeeID);
		
		JLabel lbl_FirstName = new JLabel("First Name: ");
		lbl_FirstName.setBounds(10, 93, 78, 19);
		contentPane.add(lbl_FirstName);
		
		JLabel lbl_LastName = new JLabel("Last Name:");
		lbl_LastName.setBounds(10, 123, 78, 19);
		contentPane.add(lbl_LastName);
		
		JLabel lbl_SocialId = new JLabel("Social ID:");
		lbl_SocialId.setBounds(10, 153, 78, 19);
		contentPane.add(lbl_SocialId);
		
		JLabel lbl_Salary = new JLabel("Salary:");
		lbl_Salary.setBounds(10, 183, 78, 19);
		contentPane.add(lbl_Salary);
		
		JLabel lbl_Department = new JLabel("Department:");
		lbl_Department.setBounds(10, 213, 78, 19);
		contentPane.add(lbl_Department);
		
		JLabel lbl_Type = new JLabel("Type:");
		lbl_Type.setBounds(10, 243, 78, 19);
		contentPane.add(lbl_Type);
		
		JLabel lbl_BonusShift = new JLabel("Bonus / Shift:");
		lbl_BonusShift.setBounds(10, 273, 78, 19);
		contentPane.add(lbl_BonusShift);
		
		JLabel lbl_HavingCar = new JLabel("Having Car /");
		lbl_HavingCar.setBounds(10, 308, 78, 14);
		contentPane.add(lbl_HavingCar);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				NewEmployeeAdd();
				ManagementConsole mng = new ManagementConsole();
				mng.setVisible(true);
			}
		});
		btnNewButton.setBounds(91, 355, 183, 28);
		contentPane.add(btnNewButton);
		
		txt_employeeID = new JTextField();
		txt_employeeID.setBounds(98, 62, 176, 20);
		contentPane.add(txt_employeeID);
		txt_employeeID.setColumns(10);
		
		JLabel lbl_UsingService = new JLabel("Using Service :");
		lbl_UsingService.setBounds(10, 321, 78, 14);
		contentPane.add(lbl_UsingService);
		
		txt_firstName = new JTextField();
		txt_firstName.setColumns(10);
		txt_firstName.setBounds(98, 92, 176, 20);
		contentPane.add(txt_firstName);
		
		txt_LastName = new JTextField();
		txt_LastName.setColumns(10);
		txt_LastName.setBounds(98, 122, 176, 20);
		contentPane.add(txt_LastName);
		
		txt_socialID = new JTextField();
		txt_socialID.setColumns(10);
		txt_socialID.setBounds(98, 152, 176, 20);
		contentPane.add(txt_socialID);
		
		txt_salary = new JTextField();
		txt_salary.setColumns(10);
		txt_salary.setBounds(98, 182, 176, 20);
		contentPane.add(txt_salary);
		
		txt_department = new JTextField();
		txt_department.setColumns(10);
		txt_department.setBounds(98, 212, 176, 20);
		contentPane.add(txt_department);
		
		txt_type = new JTextField();
		txt_type.setColumns(10);
		txt_type.setBounds(98, 242, 176, 20);
		contentPane.add(txt_type);
		
		txt_bonusShift = new JTextField();
		txt_bonusShift.setColumns(10);
		txt_bonusShift.setBounds(98, 272, 176, 20);
		contentPane.add(txt_bonusShift);
		
		txt_carService = new JTextField();
		txt_carService.setColumns(10);
		txt_carService.setBounds(98, 305, 176, 20);
		contentPane.add(txt_carService);
		
		JLabel lblNewLabel_1 = new JLabel("New Employee");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(98, 11, 177, 28);
		contentPane.add(lblNewLabel_1);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManagementConsole mng = new ManagementConsole();
				mng.setVisible(true);
			}
		});
		btnBack.setBounds(91, 394, 183, 19);
		contentPane.add(btnBack);
	}
}
