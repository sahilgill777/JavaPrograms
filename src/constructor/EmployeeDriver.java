package constructor;

public class EmployeeDriver {

	public static void main(String[] args) {
		Employee e1=new Employee("jaat",123,2345.67);
		e1.displayDetails();
		Employee e2=new Employee(e1,"sahil");
		e2.displayDetails();
		// TODO Auto-generated method stub

		Employee e3=new Employee(e2);
		e3.displayDetails();
		Employee e4=new Employee(e3);
		e4.displayDetails();
	}

}
