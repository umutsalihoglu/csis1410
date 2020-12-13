
public class Main {

	public static void main(String[] args) {
		Employee emp1 = new Employee(1);
		Employee emp2 = new Employee(2);
		Employee emp3 = new Employee(3);
		
		emp1.setFirstName("Furkan");
		emp1.setLastName("Akar");
		emp1.setAge((byte) 20);
		emp1.setTitle("Database Administrator");
		emp1.setSalary(10000.0);
		emp1.setStatus("F");
		
		emp1.printEmployee();
		
		emp2.setFirstName("Umut");
		emp2.setLastName("Salihoglu");
		emp2.setAge((byte) 20);
		emp2.setTitle("Computer Engineer");
		emp2.setSalary(12000.0);
		emp2.setStatus("a");
		
		emp2.printEmployee();
		
		emp3.setFirstName("Ahmet");
		emp3.setLastName("Mehmet");
		emp3.setAge((byte) 24);
		emp3.setTitle("Software Developer");
		emp3.setSalary(9000.0);
		emp3.setStatus("P");
		
		emp3.printEmployee();
		

	}

}
