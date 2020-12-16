
public class Personnel extends Employee {

	double shift;
	boolean service;
	
	public Personnel(int employeeID, String firstName, String lastName, String socialID, double salary,
			String department, char type,double shift,boolean service) {
		super(employeeID, firstName, lastName, socialID, salary, department, type);
		// TODO Auto-generated constructor stub
		this.shift = shift;
		this.service = service;
	}
	public boolean isService() {
		return service;
	}
	public void setService(boolean service) {
		this.service = service;
	}
	public double getShift() {
		return shift;
	}
	public void setShift(double shift) {
		this.shift = shift;
	}
	
}
