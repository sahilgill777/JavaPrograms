package MainMethod;

public class Program2 {

	public static void main(String[] args) {
		int n=Integer.valueOf(args[0]);
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("The factorial of the number is "+fact);

	}

}
