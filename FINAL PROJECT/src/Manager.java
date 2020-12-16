public class Manager extends Employee {

	double bonus;
	boolean haveCar;
	
	public Manager(int employeeID, String firstName, String lastName, String socialID, double salary, String department,
			char type, double bonus, boolean haveCar) {
		super(employeeID, firstName, lastName, socialID, salary, department, type);
		// TODO Auto-generated constructor stub
		this.bonus = bonus;
		this.haveCar = haveCar;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public boolean isHaveCar() {
		return haveCar;
	}
	public void setHaveCar(boolean haveCar) {
		this.haveCar = haveCar;
	}

}
