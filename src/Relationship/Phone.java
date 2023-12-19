package Relationship;

public class Phone {
	String name;
	int  price;
	Screen s=new Screen("black",234,45.56);
	 Phone()
	{
	
	}
	Phone(String name,int price)
	{
		this.name=name;
		this.price=price;
	}
	public void getDetails()
	{
		System.out.println("The name of the phone is "+name);
		System.out.println("The price of the phone is "+price);
		s.displayDetails();
		
		
	}
	}
	


