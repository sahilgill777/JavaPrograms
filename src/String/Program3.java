package String;
//small into big and big into small
public class Program3 {

	public static void main(String[] args) {
		String  s1= "aBd xT";
		String s2="";
		for(int i=0;i<s1.length();i++)
			
		{
			char x=s1.charAt(i);
			if(x>=65&&x<=90)
			{
				s2=s2+(char)(x+32);
			}
			else if(x>=97&&x<=122)
			{
				s2=s2+(char)(x-32);
			}
		}
		System.out.println("The output is" +s2);
	}
}
