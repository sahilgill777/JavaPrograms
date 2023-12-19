package String;
import java.util.*;
public class Anagram {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
		String x=sc.nextLine();
		System.out.println("Enter the second String");
		String y=sc.nextLine();
		
		if(checkAnagram(x,y))
		{
			System.out.println("It is an Anagram ");
		}
		else
		{
			System.out.println("It is not anagram");
		}
		
	}
	public static int[] countCharacter(String s)
	{
		int [] count=new int[25];
		int last_index=s.length()-1;
		for(int i=0;i<=last_index;i++)
		{
			char p=s.charAt(i);
			if(p>=65&&p<=90)
			{
				count[p-65]++;
			}
			else if(p>=97&&p<=122)
			{
				count[p-97]++;
			}
		}
		return count;
		
	}
	public static boolean checkAnagram(String s1, String s2)
	{
		int[] count1=countCharacter(s1);
		int[] count2=countCharacter(s2);
		for(int i=0;i<count1.length;i++)
		{
			if(count1[i]!=count2[i])
			{
				return false;
			}
		}
		return true;
	}

}
