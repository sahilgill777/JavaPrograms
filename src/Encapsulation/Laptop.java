package Encapsulation;
import java.util.Scanner;

public class Laptop {
	private int pin=0007;
	private String company;
	private int ram;
	private double price; 
	public String  getCompany()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the pin here");
		int x=sc.nextInt();
		if(x==0007)
		{
			System.out.println("You have choosen right pin");
		
		return company;
		}
		else
		{
			System.out.println("Invalid pin");
			return null;
		}
	}
	public int getRam()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the pin here");
		int x=sc.nextInt();
		if(x==0007)
		{
			System.out.println("You have choosen right pin");
		
		return ram;
		}
		else
		{
			return 0;
		}
	}
	public double getPrice()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the pin here");
		int x=sc.nextInt();
		if(x==0007)
		{
			System.out.println("You have choosen right pin");
		
		return price;
		}
		else 
		{
			return 0;
		}
	}
	public void setCompany(String company)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the pin here");
		int x=sc.nextInt();
		if(x==0007)
		{
			System.out.println("You have choosen right pin");
		
		this.company=company;
		}
		else
		{
			System.out.println("Invalid pin");
		}
	}
	public void setRam(int ram)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the pin here");
		int x=sc.nextInt();
		if(x==0007)
		{
			System.out.println("You have choosen right pin");
		
		this.ram=ram;
		}
		else
		{
			System.out.println("Invalid pin");
		}
	}
	public void setPrice(double price)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the pin here");
		int x=sc.nextInt();
		if(x==0007)
		{
			System.out.println("You have choosen right pin");
		
		this.price=price;
		}
		else
		{
			System.out.println("Invalid pin");
		}
	}
	

}
