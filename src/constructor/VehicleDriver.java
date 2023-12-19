package constructor;

public class VehicleDriver {

	public static void main(String[] args) {
		Vehicle v1=new Vehicle("car",1234567,"red");
		Vehicle v2=new Vehicle(v1);
		Vehicle v3=new Vehicle("bus",34567654,"pink");
		Vehicle v4=new Vehicle("bike",34567654,"blue");
		Vehicle v5=new Vehicle("auto",34567654,"green");
		Vehicle v6=new Vehicle(v5,v4,"black");
		v1.displayDetails();
		v2.displayDetails();
		v3.displayDetails();
		v4.displayDetails();
		v5.displayDetails();
		v6.displayDetails();
		// TODO Auto-generated method stub

	}

}