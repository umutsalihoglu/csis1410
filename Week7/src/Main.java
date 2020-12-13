import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What employee's ID number do you want to see?: ");
		int id = sc.nextInt();
		
		Employee emp = new Employee();
		emp.getEmployee(id,emp);
		
		sc.close();
	
	
	}

}
