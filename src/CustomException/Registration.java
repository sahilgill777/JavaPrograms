package CustomException;

public class Registration {
	public static void verifyingAge(int age)throws UnderAgeException {
		if(age>18)
		{
			System.out.println("You are eligible");
		}
		else
		{
			throw new UnderAgeException();
		}
		
	}

}
