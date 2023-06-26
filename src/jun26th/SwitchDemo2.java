package jun26th;

import java.util.Scanner;

public class SwitchDemo2 {

	public static void main(String[] args) {

		
		String str="Monday";
		
		switch (str) {
		
		case "Sunday":
			System.out.println("First day of Week");
			break;
		case "Monday":
			System.out.println("Second day of Week");
			break;
				
		default:
			System.out.println("Invalid");

		}

	}

}
