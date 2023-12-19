package String;

public class programOfvalueOFmethod {
//CHECK WHETHER IT IS PALINDROME or not
	public static void main(String[] args) {
		String s1="MADAM";
		
		String s2="";
		int n=s1.length();
		for(int i=n-1;i>=0;i--)
		{
			char x=s1.charAt(i);
			s2=s2+x;
			
		}
		System.out.println(s2);
		if(s1.equals(s2))
		{
			System.out.println("It is palindrome ");
		}
		else
		{
			System.out.println("It is not palindrome");
		}
		

	}
}
