package jun26th;

import java.util.Scanner;

public class WhileLooopDemo2 {

	public static void main(String[] args) {
		
		
		
		
		
		while(true)
		{
			
			System.out.println("Enter some charcter :");
			
			Scanner input=new Scanner(System.in);
			
			char ch=input.next().toCharArray()[0];
			
			if(!(ch == 'x' || ch == 'X'))
			{
				System.out.println("you have entered "+ch );
			}
			else
			{
				break;
			}
		}

	}

}
