
public class Employee {
	
	int employeeID;
	String firstName;
	String lastName;
	Byte age;
	String title;
	Double salary;
	String status;
	int supervisor_id;
	boolean bonus;
	String department;
	int insurance;
	String hiredate;
	String phone;
	
	public int getSupervisor_id() {
		return supervisor_id;
	}
	public void setSupervisor_id(int supervisor_id) {
		this.supervisor_id = supervisor_id;
	}
	public boolean isBonus() {
		return bonus;
	}
	public void setBonus(boolean bonus) {
		if(bonus) {
			this.bonus = bonus;
			Double newBonus = salary + 1000.0;
			setSalary(newBonus);
		}else {
			this.bonus = bonus;
		}
		
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getInsurance() {
		return insurance;
	}
	public void setInsurance(int insurance) {
		if(insurance == 0) {
			
		}else if(insurance == 1){
			Double newSalary=salary-2000.0;
			setSalary(newSalary);
		}else if(insurance == 2){
			Double newSalary=salary-1500.0;
			setSalary(newSalary);
		}else if(insurance == 3){
			Double newSalary=salary-1000.0;
			setSalary(newSalary);
		}else if(insurance == 4){
			Double newSalary=salary-500.0;
			setSalary(newSalary);
		}
		this.insurance = insurance;
	}
	public String getHiredate() {
		return hiredate;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Employee() {
		super();
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Byte getAge() {
		return age;
	}
	public void setAge(Byte age) {
		this.age = age;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		if(status.equals("F")|| status.equals("P") || status.equals("R") || status.equals("I") || status.equals("C")) {
			this.status = status;
		}else {
			this.status = "Unknown Status";
		}
		
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public void getEmployee(int id,Employee emp) {
		CSVRead csv = new CSVRead();
		String[][] employee = csv.readCSV();
		
		emp.setEmployeeID(Integer.parseInt(employee[id-1][0]));
		emp.setFirstName(employee[id-1][1]);
		emp.setLastName(employee[id-1][2]);
		emp.setAge(Byte.parseByte(employee[id-1][3]));
		emp.setTitle(employee[id-1][4]);
		emp.setSalary(Double.parseDouble(employee[id-1][5]));
		emp.setStatus(employee[id-1][6]);
		emp.setSupervisor_id(Integer.parseInt(employee[id-1][7]));
		if(Integer.parseInt(employee[id-1][8]) == 1) {
			emp.setBonus(true);
		}else if(Integer.parseInt(employee[id-1][8]) == 0) {
			emp.setBonus(false);
		}
		emp.setDepartment(employee[id-1][9]);
		emp.setInsurance(Integer.parseInt(employee[id-1][10]));
		emp.setHiredate(employee[id-1][11]);
		emp.setPhone(employee[id-1][12]);
		
		printEmployee();
	}
	
	public void printEmployee() {		
		System.out.println("Employee ID: "+employeeID);
		System.out.println("First Name: "+firstName);
		System.out.println("Last Name: "+lastName);
		System.out.println("Age: "+age);
		System.out.println("Title:  "+title);
		System.out.println("Salary:  "+salary);
		System.out.println("Status: "+status);
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		System.out.println("Supervisor ID: "+supervisor_id);
		if(bonus) {
			System.out.println("Bonus: Yes");
		}else {
			System.out.println("Bonus: No");
		}
		System.out.println("Department: "+department);
		if(insurance == 0) {
			System.out.println("Insurance: None");
		}else {
			System.out.println("Insurance: Option #"+insurance);
		}
		String[] hire = hiredate.split("-");
		System.out.println("Hire Date: "+hire[2]+"/"+hire[1]+"/"+hire[0]);
		String phone1 = phone.substring(0,3);
		String phone2 = phone.substring(3,phone.length());
		System.out.println("Phone Number: ("+phone1+")"+phone2);
		
	}
	
	

}
