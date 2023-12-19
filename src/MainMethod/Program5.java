package MainMethod;

public class Program5 {

	public static void main(String[] args) {
		int x=Integer.valueOf(args[0]);
		int n=x;
		int rev=0;
		while(x>0)
		{
			int rem=x%10;
			rev=10*rev+rem;
			x=x/10;
		}
		if(rev==n)
		{
			System.out.println("It is palindrome number");
		}
		else
		{
			System.out.println("It is not palindrome number");
		}

	}

}
