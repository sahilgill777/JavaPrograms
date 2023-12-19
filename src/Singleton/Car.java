package Singleton;

public class Car {
	static private Car c1=null;
	 private Car()
	{
		
	}
	 public static Car getInstance()
	 {
		 if(c1==null)
		 {
			 c1=new Car();
		 }
		 return c1;
	 }
	
	

}
