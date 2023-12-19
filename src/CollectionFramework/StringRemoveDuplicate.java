package CollectionFramework;

import java.util.HashSet;


public class StringRemoveDuplicate {

	public static void main(String[] args) {
		String s1="abpkadab";
		
		toRemoveDuplicateString(s1);
	}
	public static void toRemoveDuplicateString(String v)
	{
		
			HashSet l1=new HashSet();
		for(int i=0;i<v.length();i++)
		{
			l1.add(v.charAt(i));
		}
		System.out.println(l1);
		
		
	
	}

}
