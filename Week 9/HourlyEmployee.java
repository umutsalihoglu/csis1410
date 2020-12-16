
public class HourlyEmployee extends Employee
{
	
	private double hourlyWage = (((super.getSalary()) / 52) / 30);
	
	public HourlyEmployee(int employeeID)
	{
		super(employeeID);
	}

	@Override
	public void printPay()
	{
		
		
		System.out.println("\tCompensation");
		System.out.println("Status: " + this.getStatus());
		System.out.printf("Hourly rate: $%,.2f/hour\n", hourlyWage);
	}
}
