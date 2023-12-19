package constructor;

public class Vehicle {

	String name;
	int price;
	String color;
	Vehicle(String name,int price,String color)
	{
		this.name=name;
		this.price=price;
		this.color=color;
		
	}
	Vehicle (Vehicle p){
		this.name=p.name;
		this.price=p.price;
		
				
	}
	Vehicle(Vehicle q,Vehicle w,String color){
		this.name=w.name;
		this.price=q.price;
		this.color=color;
		
		
	}
	public void displayDetails() {
		System.out.println("The name of the vehicle is "+name);
		System.out.println("The price of the vehicle is "+price);
		System.out.println("The color of the vehicle is "+color);
	}
	
	
		// TODO Auto-generated method stub

	}


