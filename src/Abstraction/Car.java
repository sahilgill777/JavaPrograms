package Abstraction;

public abstract class Car extends Vehicle {
	int r;
	
	//Abstract class m default ya khali constructor bna skte h uske alava banynge toh errior AJEGA 
	//
	public abstract void run();
	public abstract void brake();
	public void start()
	{
		System.out.println("Start method");
	}
	
}
