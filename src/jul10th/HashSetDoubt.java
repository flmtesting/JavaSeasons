package jul10th;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HashSetDoubt {

	public static void main(String[] args) {
		
		
		Set hs=new HashSet();
		
		hs.add(10);
		
		hs.add("Selenium");
		
		hs.add(10.33);
		
				
		System.out.println(hs.size());
		
		for(Object temp:hs)
		{
			System.out.println(temp);
		}
		
		ArrayList al=new ArrayList(hs);
		
		System.out.println(al);
		
		System.out.println(al.get(2));
		

	}

}
