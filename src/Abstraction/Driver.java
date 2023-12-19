package Abstraction;

public class Driver {

	public static void main(String[] args) {
		Vehicle v1=new ElectricCar(12,45,67);
		v1.start();
		Car c1=new ElectricCar(34,64,25);
		c1.brake();
		c1.drive();

	}

}
