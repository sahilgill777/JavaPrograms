package MainMethod;

public class Program3 {

	public static void main(String[] args) {
		int x=Integer.valueOf(args[0]);
		int count=0;
		for(int i=2;i<=x/2;i++)
		{
			if(x%i==0)
			{
				count++;
			}
		}
		if(count==0)
		{
			System.out.println("This is prime number");
		}
		else
		{
			System.out.println("It is not prime number");
		}

	}

}
