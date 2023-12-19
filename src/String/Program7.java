package String;
//count words
public class Program7 {

	public static void main(String[] args) {
		String s1=" Today is monday ";
		int count=0;
		for(int i=0;i<s1.length();i++)
			
		{
			
			
			if((i==0&&s1.charAt(i)!=' '||s1.charAt(i)!=' '&&s1.charAt(i-1)==' '))
			{
				count++;
			}
		}
		System.out.println("Total words are "+ count);

	}

}
