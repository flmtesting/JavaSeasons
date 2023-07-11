package jul10th;

import java.util.HashSet;

public class Hashset2 {

	public static void main(String[] args) {
		
		HashSet<String> hs=new HashSet<String>();
		
		hs.add("Selenium");
		
		hs.add("FLM");
		
		hs.add("Riyaz");
		
		System.out.println(hs);
		
		//enhanced for loop or for-each
		
		for(String temp:hs)
		{
			System.out.println(temp);
		}

	}

}
