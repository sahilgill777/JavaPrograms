package constructor;

public class Employee {
	String name;
	int ID;
	double salary;
	Employee()
	{
		
	}
	Employee(String name)
	{
		this.name=name;
	}
	Employee(String name,int ID)
	{
		this(name);
		this.ID=ID;
		
	}
	Employee(String name,int ID,double salary)
	{
		this(name,ID);
		this.salary=salary;
	}
	Employee(int ID,double salary)
	{
		this.ID=ID;
		this.salary=salary;
	}
	
	Employee(Employee d,String name)
	{
		this(d.ID,d.salary);
		this.name=name;
	}
	Employee(Employee y)
	{
		this.name=y.name;
		this.ID=y.ID;
		this.salary=y.salary;
	}
	
		
	
	public void displayDetails()
	{
		System.out.println("The name eof the employee is "+ name);
		System.out.println("The ID eof the employee is "+ ID);
		System.out.println("The salary eof the employee is "+ salary);
		
	}
	

		// TODO Auto-generated method stub

	}


