package MethodOverriding;

public class Burger extends Food {
	int y=50;

	public void findPrice()
	{
		int x=90;
		int y=67;
		System.out.println("The price of the food is "+x*y);

	}
	public void findWeight()
	{
		int x=67;
		int y=98;
		System.out.println("The weight of the food is "+x*y+x);
	}

}
