package CollectionFramework;

import java.util.HashSet;

public class Question {

	public static void main(String[] args) {
		int[] a= {30,18,16,30,40,18,30};
		toRemoveDuplicates(a);

	}
	public  static void toRemoveDuplicates(int[] s)
	{
		HashSet h2=new HashSet();
		for(int x:s)
		{
			h2.add(x);
		}
		System.out.println(h2);
		
	}

}
