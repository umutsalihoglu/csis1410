
public class CommissionEmployee extends Employee
{
	
	private double hourlyWage = ((((super.getSalary()) / 4) / 52) / 30);
	
	public CommissionEmployee(int employeeID)
	{
		super(employeeID);
	}

	public void printPay()
	{		
		System.out.println("\tCompensation");
		System.out.println("Status: " + this.getStatus());
		System.out.printf("Hourly rate: $%,.2f/hour\n", hourlyWage);
		System.out.printf("YTD Commissions: $%,.2f\n", ((super.getSalary() / 4) * 3));
	}
}
