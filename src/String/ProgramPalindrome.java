package String;

public class ProgramPalindrome {

	public static void main(String[] args) {
		int x=5335;
		String y=String.valueOf(x);
		String s2="";
		int n=y.length();
		for(int i=n-1;i>=0;i--)
		{
			char v=y.charAt(i);
			s2=s2+v;
			
		}
		System.out.println(s2);
		if(y.equals(s2))
		{
			System.out.println("It is palindrome ");
		}
		else
		{
			System.out.println("It is not palindrome");
		}
		

	}



	}


