package jul10th;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset3 {

	public static void main(String[] args) {
		
		HashSet<String> hs=new HashSet<String>();
		
		hs.add("Selenium");
		
		hs.add("FLM");
		
		hs.add("Riyaz");
		
		System.out.println(hs);
		
		//Iterator
		
		Iterator<String>  it=hs.iterator();
		
		while(it.hasNext())
		{
			//it.next();
			System.out.println(it.next());
		}
		
		

	}

}
