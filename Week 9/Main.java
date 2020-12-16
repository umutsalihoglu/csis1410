
public class Main
{

	public static void main(String[] args)
	{
		
		SalaryEmployee e1 = new SalaryEmployee(1);
		HourlyEmployee e2 = new HourlyEmployee(2);
		CommissionEmployee e3 = new CommissionEmployee(4);
		
		
		e1.printEmployee();
		e2.printEmployee();
		e3.printEmployee();

	}

}
