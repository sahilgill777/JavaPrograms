package Inheritance;

public class ElectricCar extends Car {
	int x=40;
	public void demo()
	{
		int x=45;
		System.out.println("The value of local x is "+x);
		System.out.println("The value of Global x is "+this.x);
		System.out.println("The value of Global car x is "+super.x);
		System.out.println("The value of local x is "+takeXToThere());
		System.out.println("The value of local x is "+takeThisXToThere());
		
	}

}
