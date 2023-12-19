package String;
//print % in spaces
public class Progarm10 {

	public static void main(String[] args) {
		String s1="Today is Tuesday";
		String s2=" ";
		for(int i=0;i<s1.length();i++)
		{
			char x=s1.charAt(i);
			if(x==' ')
			{
				s2=s2+'$';			
			}
			else
			{
				s2=s2+x;
			}
		}
		System.out.println(s2);

	}

}
