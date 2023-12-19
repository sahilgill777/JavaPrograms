package String;

import java.util.Scanner;

public class CountFreq2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=sc.nextLine();
		countFreq(s1);
			
	}
	public static void countFreq(String s)
	{
		char[] x=s.toCharArray();
		int n=x.length;
		for(int i=0;i<n;i++)
		{
			int count=1;
			
			for(int j=i+1;j<n;j++)
			{
				if(x[i]==x[j])
				{
					count++;
					x[j]=x[n-1];
					j--;
					n--;
				}
			}
			if(count==1)
			{
				System.out.println(x[i]);
		}
		
	}

}


	}


