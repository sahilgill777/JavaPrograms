package CollectionFramework;

import java.util.LinkedHashMap;
import java.util.Map;

public class ProgramParmetirizedConstructroHashMAP {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> l9=new LinkedHashMap<Integer,String>();
		l9.put(12, "asd");
		l9.put(87, "kjh");
		l9.put(98, "987");
		System.out.println(l9);
		for(Integer x:l9.keySet())
		{
			System.out.println(x);
		}
		for(String y:l9.values())
		{
			System.out.println(y);
		}
		for(Map.Entry<Integer,String> j:l9.entrySet())
		{
			System.out.println("The value is "+ j.getValue() + "The key is " + j.getKey());
		}
		

	}

}
