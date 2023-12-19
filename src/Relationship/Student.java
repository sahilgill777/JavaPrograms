package Relationship;

public class Student {
	String name;
	int rollno;
	Address a =new Address();
	Student()
	{
		
	}
	Student(String name,int rollno,Address a )
	{
		this.name=name;
		this.rollno=rollno;
		this.a=a;
		
	}
	public void displayStudent()
	{
		System.out.println("The name of the student is "+name);
		System.out.println("The rollno  of the student is "+rollno);
		a.displayAddress();
	}

}
