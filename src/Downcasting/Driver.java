package Downcasting;

public class Driver {

	public static void main(String[] args) {
		Vehicle v1=new Car();
		Car c1=(Car)v1;
		System.out.println(c1.x);
		System.out.println(v1.a);

	}

}
