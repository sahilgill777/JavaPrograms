package Inheritance;

public class Fruit {
	int x=50;
	public void test() {
		int y=10;
		int x=59;
		System.out.println("The value of local x is "+x);
		System.out.println("The value of global  x is "+this.x);
		System.out.println("The value of local y is "+y);
	}

}
