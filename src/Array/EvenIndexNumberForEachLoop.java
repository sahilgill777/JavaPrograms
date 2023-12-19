package Array;

public class EvenIndexNumberForEachLoop {
	public static void main (String[] args)
	{
		int [] a= {12,45,67,89,98,76};
		int count=0;
		for(int x:a)
		{
			if(count%2==0)
			{
				System.out.println(x);
			}
			count++;
		}
		}

}
