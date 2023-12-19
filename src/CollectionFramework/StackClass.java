package CollectionFramework;

import java.util.Stack;

public class StackClass {

	public static void main(String[] args) {
		Stack s1=new Stack<>();
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(70);
		System.out.println(s1);
		s1.pop();
		System.out.println(s1);
		System.out.println(s1.search(30));
		s1.push(56);
		System.out.println(s1.peek());
		

	}

}
