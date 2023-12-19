package String;

public class ReverseString {

	public static void main(String[] args) {
		String s1="Sahil";
		 reverseSting(s1);

	}
	public static void reverseSting(String s)
	{
		String s2="";
		int length=s.length()-1;
		for(int i=length;i>=0;i--)
		{
			s2=s2+s.charAt(i);
		}
		System.out.println(s2);
	}

}
