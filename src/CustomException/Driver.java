package CustomException;
import java.util.Scanner;
public class Driver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		int age=sc.nextInt();
		try {
		Registration.verifyingAge(age);
		}
		catch(Exception e)
		{
			System.out.println(e);
			e.printStackTrace();
			System.out.println("You are not eligible");
		}

	}

}
