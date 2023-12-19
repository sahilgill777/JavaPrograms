package Relationship;

public class StudentDriver {
	public static void main(String[] args) {
		
	
	Address a1 =new Address("noida","up",201301);
	Student s1=new Student("mohan",345,a1);
	Student s2=new Student("rohan",123,a1);
	s1=null;
	s2.displayStudent();
	a1.displayAddress();
	
	}
}
