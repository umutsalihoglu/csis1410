
public class SalaryEmployee extends Employee 
{
	
	private double salary = super.getSalary();
	int bonus = super.getBonus();
	int insurance = super.getInsurance();
	
	public SalaryEmployee(int employeeID)
	{
		super(employeeID);
		updateSalary();
	}
	
	public void updateSalary()
	{
		
		int i = super.getInsurance();
		
		if (this.bonus == 1)
		{
			salary = salary + 1000;
		}
		
		switch (i)
		{
		case 1:
			salary = salary - 2000;
			break;
		case 2:
			salary = salary - 1500;
			break;
		case 3:
			salary = salary - 1000;
			break;
		case 4:
			salary = salary - 500;
			break;
		
		}
		
	}
	
	@Override
	public void printPay()
	{
		
		int i = insurance;
		
		System.out.println("\tCompensation");
		System.out.println("Status: " + this.getStatus());
		
		switch (i)
		{
		case 0:
			System.out.println("Insurance Option: None");
			break;
		default:
			System.out.println("Insurance Option: " + i);
			break;
		}		
			System.out.printf("Salary: $%,.2f/year\n", salary);
	}
}
