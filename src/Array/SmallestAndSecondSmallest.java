package Array;

public class SmallestAndSecondSmallest {

	public static void main(String[] args) {
		int[] a= {45,45,45,38,32};
		int s1=a[0];
		int s2=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<s1)
			{
				s2=s1;
				s1=a[i];
				
			}
			else if(s2>a[i]&&a[i]!=s1)
			{
				s2=a[i];
			}
		}
		System.out.println("Smallest  no. is " + s1);
		System.out.println("Second smallest no. is " +s2);

	}

}
