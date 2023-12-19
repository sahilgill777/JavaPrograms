package ClassB;

import java.io.Serializable;

public class Employ implements Serializable {
	private String name;
	 public Employ()
	 {
		 
	 }
	 public void setName(String n)
	 {
		 //validation
		 name=n;
	 }
	 public String getName()
	 {
		 //validation
		 return name;
	 }

}
