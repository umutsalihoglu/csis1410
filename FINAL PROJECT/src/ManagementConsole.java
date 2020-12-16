import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class ManagementConsole extends JFrame {

	private JPanel contentPane;
	DefaultTableModel tableModel = new DefaultTableModel();
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManagementConsole frame = new ManagementConsole();
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
	public ManagementConsole() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 956, 460);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_welcome = new JLabel("");
		Main mn = new Main();
		lbl_welcome.setText("Welcome, " + mn.admin);
		lbl_welcome.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_welcome.setBounds(10, 11, 171, 29);
		contentPane.add(lbl_welcome);
		
		JButton btnNewButton = new JButton("List Employees");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				/**
				 * This is where I use inheritance and Read the CVS.
				 * Also, I look for is new employee a Manager or a Personal by getType(). and then I use inheritance depends on that.
				 */
				String[] columns = {"Employee ID","First Name", "Last Name", "Social ID", "Salary" , "Department", "Type", "Bonus or Shift", "Having Car or Using Service"};
				
				CSVRead csvreader = new CSVRead();
				String[][] employee = csvreader.readCSV();
				String[][] AllEmployees = new String [employee.length][9];
				
				for(int i = 0 ; i < employee.length ; i++) {
						if(employee[i][6].equals("M")) {
							Manager mg = new Manager(Integer.parseInt(employee[i][0]),employee[i][1],employee[i][2],employee[i][3],Double.parseDouble(employee[i][4]),employee[i][5],employee[i][6].charAt(0),Double.parseDouble(employee[i][7]),Boolean.parseBoolean(employee[i][8]));
							AllEmployees[i][0] = String.valueOf(mg.getEmployeeID());
							AllEmployees[i][1] = mg.getFirstName();
							AllEmployees[i][2] = mg.getLastName();
							AllEmployees[i][3] = mg.getSocialID();
							AllEmployees[i][4] = String.valueOf(mg.getSalary());
							AllEmployees[i][5] = mg.getDepartment();
							AllEmployees[i][6] = String.valueOf(mg.getType());
							AllEmployees[i][7] = String.valueOf(mg.getBonus());
							AllEmployees[i][8] = String.valueOf(mg.isHaveCar());
						}else if(employee[i][6].equals("P")) {
							Personnel prs = new Personnel(Integer.parseInt(employee[i][0]),employee[i][1],employee[i][2],employee[i][3],Double.parseDouble(employee[i][4]),employee[i][5],employee[i][6].charAt(0),Double.parseDouble(employee[i][7]),Boolean.parseBoolean(employee[i][8]));
							AllEmployees[i][0] = String.valueOf(prs.getEmployeeID());							
							AllEmployees[i][1] = prs.getFirstName();							
							AllEmployees[i][2] = prs.getLastName();							
							AllEmployees[i][3] = prs.getSocialID();							
							AllEmployees[i][4] = String.valueOf(prs.getSalary());							
							AllEmployees[i][5] = prs.getDepartment();							
							AllEmployees[i][6] = String.valueOf(prs.getType());						
							AllEmployees[i][7] = String.valueOf(prs.getShift());							
							AllEmployees[i][8] = String.valueOf(prs.isService());							
						}
				}
				int row = employee.length;
				int columns2 = 9;
				
				tableModel.setRowCount(row);
				tableModel.setColumnCount(columns2);
				table.setModel(tableModel);
				
				tableModel.setDataVector(AllEmployees, columns);
			}
		});
		btnNewButton.setBounds(10, 306, 171, 35);
		contentPane.add(btnNewButton);
		
		JButton btnListNewEmployee = new JButton("Add New Employee");
		btnListNewEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				NewEmployee frame1 = new NewEmployee();
				frame1.setVisible(true);
			}
		});
		btnListNewEmployee.setBounds(10, 352, 171, 35);
		contentPane.add(btnListNewEmployee);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(220, 99, 717, 288);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setBounds(715, 45, 222, 65);
		//contentPane.add(table);
		scrollPane.setViewportView(table);
		
		/**
		 * Where is I got the logo to label inside my GUI
		 */
		JLabel lbl_logo = new JLabel("");
		Image image = new ImageIcon(this.getClass().getResource("logo.png")).getImage();
		lbl_logo.setIcon(new ImageIcon(image));
		lbl_logo.setBounds(10, 85, 180, 180);
		contentPane.add(lbl_logo);
		
		
	}
}
