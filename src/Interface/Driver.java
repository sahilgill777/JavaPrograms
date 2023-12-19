package Interface;

public class Driver {

	public static void main(String[] args) {
		C c=new C();
		c.use();
		System.out.println(c.a);
		
	}
	//interface variable will go everywhere because it is 
	// it is is public static or final they can go everywhere
	//static method in interface is private
	//non static method in interface is abstract
	//We have to give body to nons static method in other class as we interface can not have body of non static method

}
