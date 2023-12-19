package Encapsulation;

public class LaptopDriver {

	public static void main(String[] args) {
		Laptop l1=new Laptop();
		l1.setCompany("Apple");
		System.out.println(l1.getCompany());
		l1.setRam(987);
		System.out.println(l1.getRam());

	}

}
