package Project;
import java.util.Scanner;
public class Game {
	
	public Weapon pressButton()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your score  here");
		int x=sc.nextInt();
		if(x<=400)
		{
			System.out.println("Give knife to player");
			Knife k=new Knife();
			return k;
		}
		else if (x<=800)
		{
			System.out.println("Give gun to player");
			Gun g=new Gun();
			return g;
		}
		else
		{
			System.out.println("Give bomb to the player");
			Bomb b=new Bomb();
			return b;
		}
		
	}

}
