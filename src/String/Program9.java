package String;
//Print first character as capital letter and other small
public class Program9 {

	public static void main(String[] args) {
		String s1="mY nAMe iS SusHAnt";
		String s2="";
		for(int i=0;i<s1.length();i++)
		{
			char x=s1.charAt(i);
			if(i==0&&x!=' '||s1.charAt(i)!=' '&&s1.charAt(i-1)==' ')
		{
			if(x>=97&&x<=122)	
			{
				s2=s2+(char)(x-32);
			}
			else
			{
				s2=s2+x;
			}
		}
			else if(x>=65&&x<=90)
			{
				s2=s2+(char)(x+32);
			}
			else
			{
				s2=s2+x;
			}
			
			
		}
		System.out.println(s2);

	}

}
