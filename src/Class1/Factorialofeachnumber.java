package Class1;

public class Factorialofeachnumber {
	public static void main(String[] args)
	{
	
	for(int i=1;i<=15;i++)
	{
		Factorial(i);
	}
	
	}

	public static void Factorial(int n)
	{
		int fact=1;
		for (int i=1;i<=n;i++)
		{
			fact=fact*i;
			
			}
		System.out.println("The factorial of this no is "+fact);
			
			
		
	}

}
