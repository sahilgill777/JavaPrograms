package Keyword;

public class InstanceOf {

	public static void main(String[] args) {
			Object x= 234;
			System.out.println(x instanceof Integer);
			if(x instanceof Integer)
			{
				System.out.println("The result is "+ ((Integer)x+100 ));
			}
			else
			{
				System.out.println("It is not integer");
				System.out.println("100 cant be accessed");
			}

	}

}
