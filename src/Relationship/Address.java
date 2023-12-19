package Relationship;

public class Address {
	String city;
	String state;
	int pinno;
	Address()
	{
		
	}
	Address(String city,String state,int pinno)
	{
		this.city=city;
		this.state=state;
		this.pinno=pinno;
		
	}
	public void displayAddress()
	{
		System.out.println("The name of the city is "+city);
		System.out.println("The name of the state  is "+state);
		System.out.println("The pinno of the city is "+pinno);
		
	}

}
