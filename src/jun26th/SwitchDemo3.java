package jun26th;

import java.util.Scanner;

public class SwitchDemo3 {

	public static void main(String[] args) {

		System.out.println("Enter month number : ");
		Scanner input = new Scanner(System.in);

		//int mon = input.nextInt();
		
		//long mon=input.nextLong();
		
		
		char mon=66;
		
		switch (mon) {
		case 'A':
			System.out.println("Jan");
			break;
		case 'B':
			System.out.println("Feb");
			break;
		
		default:
			System.out.println("Invalid number for month entered");

		}

	}

}
