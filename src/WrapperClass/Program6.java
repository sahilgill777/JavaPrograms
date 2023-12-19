package WrapperClass;

public class Program6 {

	public static void main(String[] args) {
		Object o1=345;
		int x=(Integer)o1;
		System.out.println(x+100);
		/*
		 * Whenever different type of data is stored on object reference ,then we have to perform 
		 * downcasting for its original form
		 */
		Object o2="asdf";
		String s=(String)o2;
		System.out.println(s.length());
		System.out.println(s.toUpperCase());

	}

}
