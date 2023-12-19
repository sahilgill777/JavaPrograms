package constructor;

public class Fruit {
	String name;
	int price;
	double weight;
	
	Fruit(String name)
	{
	this.name=name;
	}
	Fruit(String name,int price)
	{
	this(name);
	this.price=price;
	
	}
			Fruit(String name,int price,double weight)
			{
			this(name,price);
			this.weight=weight;
			}
			public void displayResults()
			{
				System.out.println("The name of the fruit is"+ name);
				System.out.println("The price of the fruit is"+price);
			}
	
	


		// TODO Auto-generated method stub

	

}
