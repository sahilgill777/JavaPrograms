package String;

import java.util.Scanner;

public class CountFreq4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the original string");
		String s1=sc.nextLine();
		//formatString(s1);
		String s2=formatString(s1);
		System.out.println(s2);
		
		
			
	}
	public static  String formatString(String s)
	{
		String result="";
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
			result=result+x[i];
			
		}
		return result;
		
	}





	}


