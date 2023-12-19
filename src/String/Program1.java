package String;

public class Program1 {
//all characters into smallest
	public static void main(String[] args) {
		String  s1= "abjSaD";
		String s2="";
		for(int i=0;i<s1.length();i++)
			
		{
			char x=s1.charAt(i);
			if(x>=65&&x<=90)
			{
				s2=s2+(char)(x+32);
			}
			else
			{
				s2=s2+x;
			}
		}
		System.out.println("the value is "+s2);
		

	}

}
