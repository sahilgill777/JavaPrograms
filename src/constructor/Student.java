package constructor;

public class Student {

	String name;
	int rollno;
	String house;
	
	Student(String name,String house)
	{
		this(name);
		this.house=house;
	}
	Student(String name)
	{
		this.name=name;
	}
	Student(String name,int rollno,String house)
	{
		this(name,house);
		this.rollno=rollno;
		
	}
	
	
	public void displayResults()
	{
		System.out.println("the name of the student is "+name);
		System.out.println("the rollno of the student is "+rollno);
		System.out.println("the house of the student is "+house);
	}
	
				
		
	
		
		// TODO Auto-generated method stub

	

}
