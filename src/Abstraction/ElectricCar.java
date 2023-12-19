package Abstraction;

public class ElectricCar extends Car{
	int h;
	public void sit()
	{
		System.out.println("Sit method");
	}
	public void brake()
	{
		System.out.println("Apply the brakes");
	}
	public void run()
	{
		
	}
	public void drive()
	{
		System.out.println("Drive method");
	}
	ElectricCar()
	{
		
	}
	ElectricCar(int x,int r,int h)
	{
		this.h=h;
		super.r=r;
		super.x=x;
	}
	

	

	}


