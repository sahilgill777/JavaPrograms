package Array;

public class ReverseByForEachLoop {

	public static void main(String[] args) {
		int [] a= {23,43,76,43,21};
		int k=a.length-1;
		for(int x:a)
		{
			System.out.println(a[k]);
			k--;
			
		}

	}

}
