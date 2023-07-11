package jul8th;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		
		
		ArrayList<String> al=new ArrayList<String>(150);
		
		al.add("Mango");
		
		al.add("Grape");
		
		al.add("Orange");
		
		//al.add(10);
		
		al.add("Apple");
		
		
		
		System.out.println(al.size());
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		al.add(0,"ngs");
		al.add(100,"shsgs");
		
		for(String temp:al)
		{
			System.out.println(temp);
		}
		

	}

}
