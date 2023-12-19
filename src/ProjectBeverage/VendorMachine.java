package ProjectBeverage;
import java.util.Scanner;
public class VendorMachine {
	public Beverage pressButton()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Select one option from 1,2,3");
		System.out.println("If you select 1 you will get Tea");
		System.out.println("If you select 2 you will get coffee");
		System.out.println("If you select 3 you will get wine");
		int x=sc.nextInt();
		switch(x)
		{
		case 1:
		System.out.println("You selected tea ");
		System.out.println("Enjoy the tea");
		Tea t1=new Tea();
		return t1;
		
		case 2:
		System.out.println("You selected coffee");
		System.out.println("Enjoy the coffee as much as you can");
		Coffee c1=new Coffee();
		return c1;
		
		case 3:
		System.out.println("You selected wine");
		System.out.println("Enjoy it and be chill");
		Wine w1=new Wine();
		return w1;
		
		default:
			System.out.println("Please select valid options");
		return null;
		}
		
		
		
		}
		
	}


