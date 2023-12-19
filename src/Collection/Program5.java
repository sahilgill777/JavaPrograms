package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class Program5 {

	public static void main(String[] args) {
		Collection c1= new ArrayList();
		c1.add(30);
		c1.add(50);
		c1.add(17);
		c1.add(77);
		c1.add(87);
		for(Object x:c1)
		{
			if(checkPrime((Integer)x))
			{
				System.out.println(x);
			}
		}
		
		

	}
	public static boolean checkPrime(int n)
	{
		int sum=0;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}

}
