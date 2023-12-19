package String;

public class ReverseString2 {

	public static void main(String[] args) {
		String s1="Mohan and sohan are here";
		reveString(s1);

	}
	public static void reveString(String s)
	{
		String s2="";
		String[] k=s.split(" ");
		System.out.println(k);
		int last_index=k.length-1;
		for(int i=last_index;i>=0;i--)
		{
			s2=s2+k[i]+" ";
		}
		System.out.println(s2);
	}

}
