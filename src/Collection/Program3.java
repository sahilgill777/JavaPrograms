package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class Program3 {

	public static void main(String[] args) {
		Collection c1= new ArrayList();
		c1.add(30);
		c1.add(50);
		c1.addAll(c1);
		System.out.println(c1);
		Collection c2=new ArrayList();
		c2.add(89);
		c2.add(98);
		c2.addAll(c1);
		c2.remove(50);
		System.out.println(c2);
		

	}

}
