package String;
//Print % where there is a space
public class Program8 {

	public static void main(String[] args) {
	  String s1="Sahil gill noida";
	  String s2=" ";
	  for(int i=0;i<=s1.length()-1;i++)
	  {
		  char x=s1.charAt(i);
		  if(x==' ')
		  {
			s2=s2+'%';  
		  }
		  else
		  {
			  s2=s2+x;
		  }
	  }
	  System.out.println(s2);
	  
	  
			 
	  

	}

}
