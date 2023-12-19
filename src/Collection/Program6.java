package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class Program6 {

	public static void main(String[] args) {
		Collection c1= new ArrayList();
		c1.add(30);
		c1.add(50);
		c1.add(17);
		c1.add(77);
		c1.add(87);
		for(Object x:c1)
		{
				int y = (Integer)x;
				for(int i=0;i<y;i++)
				{
				int reve = reverse(y);
				System.out.println(reve);
				System.out.println(y);
				}	
		}
	}
	public static int reverse(int n)
	{
		int rev=0;
		while(n>0)
		{
		int rem=n%10;
		rev=10*rev+rem;
			
		}
	return rev;
		
	}
	

}
