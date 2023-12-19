package Inheritance;

public class Mango extends Fruit {
	

	
		int x=40;
		public void demo()
		{
			int x=30;
			System.out.println("The value of local x is "+x);
			System.out.println("The value of global x is "+this.x);
			System.out.println("The value of global fruit  x is "+super.x);
			test();
		}
		
	}



