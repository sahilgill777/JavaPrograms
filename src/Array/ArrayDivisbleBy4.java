package Array;

public class ArrayDivisbleBy4 {

	public static void main(String[] args) {
		int [] a= {12,45,76,45,98};
		int count=0;
		for(int x:a)
		{
			if(x%4==0)
			{
				count++;
			}
		}
		System.out.println("Total count is "+count);
	}

}
