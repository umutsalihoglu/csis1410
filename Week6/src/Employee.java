
public class Employee {
	
	
	int employeeID;
	String firstName;
	String lastName;
	Byte age;
	String title;
	Double salary;
	String status;
	
	public Employee(int employeeID) {
		super();
		this.employeeID = employeeID;
	}
	public void printEmployee() {		
		System.out.println("Employee ID: "+employeeID);
		System.out.println("First Name: "+firstName);
		System.out.println("Last Name: "+lastName);
		System.out.println("Title:  "+title);
		System.out.println("Age: "+age);
		System.out.println("Salary:  "+salary);
		System.out.println("Status: "+status);
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
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
		if(status == "F" || status == "P" || status == "R" || status == "I" || status == "C") {
			this.status = status;
		}else {
			this.status = "Unknown Status";
		}
		
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	
	
	
	

}
