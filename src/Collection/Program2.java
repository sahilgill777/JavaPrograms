package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class Program2 {

	public static void main(String[] args) {
		Collection c1= new ArrayList();
		c1.add(30);
		c1.add(50);
		c1.addAll(c1);
		System.out.println(c1);
		System.out.println(c1.add(45));
		c1.remove(50);
		c1.removeAll(c1);
		System.out.println(c1.removeAll(c1));
		

	}

}
