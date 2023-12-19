package CollectionFramework;

import java.util.*;

public class InterfaceQueue {

	public static void main(String[] args) {
		Queue q1=new LinkedList();
		q1.add(10);
		q1.add(56);
		q1.add(65);
		q1.add(90);
		System.out.println(q1);
		q1.add(44);
		System.out.println(q1);
		q1.remove();
		System.out.println(q1);

	}

}
