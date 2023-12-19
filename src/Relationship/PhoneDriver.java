package Relationship;

public class PhoneDriver {
	public static void main(String[] args)
	{
		Phone p1=new Phone("apple",45678);
		p1.getDetails();
		System.out.println("the name of the screen is "+ p1.s.name);
		System.out.println("The size of the screen is "+p1.s.size);
		System.out.println("The name of the phone is "+p1.name);
		
		
		p1.s.displayDetails();
		p1=null;
		System.out.println("The name of the phone is "+p1.name);
		
		
	}

}
