package VariableShadowing;

public class Driver {

	public static void main(String[] args) {
		ClassA a1=new ClassB();
		System.out.println(a1.x);
		ClassB b1=new ClassC();
		System.out.println(b1.x);
		ClassC c1=new ClassC();
		System.out.println(c1.x);
		System.out.println(c1.(super.x));

	}

}
