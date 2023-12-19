package String;

public class Program6 {

	public static void main(String[] args) {
		String s1="28 ecB 282 923";
		int sum=0;
		for(int i=0;i<s1.length();i++)
		{
			char x=s1.charAt(i);
			if(x>=49&&x<=57)
			{
				sum=sum+(x-48);
				
			}
		}
		System.out.println(sum);
	}
}
		
