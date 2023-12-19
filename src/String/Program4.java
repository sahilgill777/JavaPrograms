package String;
//print only alphabets
public class Program4 {

	public static void main(String[] args) {
		String s1="a#b3 5d$4";
		String s2="";
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			char x=s1.charAt(i);
			if(x>=65&&x<=90||x>=97&&x<=122)
			{
				s2=s2+x;
			}
		}
		System.out.println(s2);

	}

}
