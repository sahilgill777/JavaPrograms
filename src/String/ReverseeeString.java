package String;

public class ReverseeeString {

	public static void main(String[] args) {
		String s1="Mohan and sohan are here";
		reverseeString(s1);

	}
	public static void reverseeString(String s)
	{
		String[] k=s.split(" ");
		String rev="";
		for(int i=0;i<k.length;i++)
		{
			String p=k[i];
			for(int j=p.length()-1;j>=0;j--)
			{
				rev=rev+p.charAt(j)+" ";
			}
			
			
			
		}
		System.out.println(rev);
	}

}
