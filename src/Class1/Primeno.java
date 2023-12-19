package Class1;

public class Primeno {
	public static void main(String[] args)
	{
		for(int i=2;i<=100;i++)
		{
			primeno(i);	
		}
		
	}
	public static void primeno(int x)
	{
		int count=0;
		for(int n=2;n<=x/2;n++)
		{
			if(x%n==0)
			{
				count++;
				break;
			}
		}
		if(count==0)
		{
			System.out.println(x);
		}
	}
	

}