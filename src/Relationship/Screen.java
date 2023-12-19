package Relationship;

public class Screen {
	String name;
	int pixel;
	double size;
	Screen(){
	}
	Screen(String name,int pixel,double size)
	{
		this.name=name;
		this.pixel=pixel;
		this.size=size;
	}
	public void run()
	{
		System.out.println("Screen will run");
	}
	public void displayDetails()
	{
		System.out.println("The name of the screen is "+name);
		System.out.println("The pixel of the screen is "+pixel);
		System.out.println("The size of the screen is "+size);
		
	}
	
	
	





}
