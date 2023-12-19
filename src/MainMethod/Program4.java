package MainMethod;

public class Program4 {

	public static void main(String[] args) {
		int n=Integer.valueOf(args[0]);
		int rev=0;
		while(n>0)
		{
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println("The reverse of this number is " + rev);

	}

}
