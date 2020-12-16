
public class Employee {
	int employeeID;
	String firstName;
	String lastName;
	String socialID;
	double salary;
	String department;
	char type;
	
	/**
	 * @author Umut Salihoglu
	 * CSIS1410
	 * December 15th, 2020
	 * These codes on the below, it is going to be get inheritance with getters and setters by Personal and Manager.
	 */

	public Employee(int employeeID, String firstName, String lastName, String socialID, double salary,
			String department, char type) {
		super();
		this.employeeID = employeeID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialID = socialID;
		this.salary = salary;
		this.department = department;
		this.type = type;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
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
	public String getSocialID() {
		return socialID;
	}
	public void setSocialID(String socialID) {
		this.socialID = socialID;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public char getType() {
		return type;
	}
	public void setType(char type) {
		this.type = type;
	}

}
