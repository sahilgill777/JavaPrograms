package String;
//All characters into largest
public class Program2 {

	public static void main(String[] args) {
		String  s1= "abjSaD";
		String s2="";
		for(int i=0;i<=s1.length()-1;i++)
			
		{
			char x=s1.charAt(i);
			if(x>=97&&x<=122)
			{
				s2=s2+(char)(x-32);
			}
			else
			{
				s2=s2+x;
			}
		}
		System.out.println("the value is "+s2);
		

	}



	}


