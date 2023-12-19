package MethodOverriding;

public class Driver {

	public static void main(String[] args) {
		Food f1=new Burger();
		Burger b1=new Burger();
		f1.findWeight();
		f1.findPrice();
		System.out.println(b1.x);
		//Method overriding applicable only for non static methods only if we want to initalise global members,it will display only as per refernce provided not on type of object created

	}

}
