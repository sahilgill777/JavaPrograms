package Upcasting;

public class Driver {

	public static void main(String[] args) {
Vehicle v1=new Car();
		
		System.out.println(v1.x);
		System.out.println(v1.y);
		Car c1=new ElectricCar();
		System.out.println(c1.x);

	}

}
