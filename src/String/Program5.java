package String;
//how many gaps
public class Program5 {

	public static void main(String[] args) {
		String s1="ab x pqr xyz";
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			char x=s1.charAt(i);
			if(x==' ')
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
