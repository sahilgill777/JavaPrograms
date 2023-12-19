package CollectionFramework;

import java.util.TreeSet;

public class Question1Part2 {

	public static void main(String[] args) {
		int [] a= {30,18,16,30,40,18,30};
		toSort(a);
	}
	public static void toSort(int[] c)
	{
		TreeSet t1=new TreeSet();
		for(int x:c)
		{
			t1.add(x);
		}
		System.out.println(t1);
	}

}
