package jul12th;

import java.util.Scanner;

public class VoterIdRegistration {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Voter Registration...");
		
		System.out.println("Please enter your age : ");
		
		Scanner input=new Scanner(System.in);
		
		int age=input.nextInt();
		
		if(age>=18)
		{
			System.out.println("You are eligible for registraion..please proceed..");
		}
		else
		{
			try
			{
			throw new InvalidAgeException();
			}
			catch(InvalidAgeException e)
			{
				System.out.println(e.getMessage());
			}
		}
		
		System.out.println("End of program");

	}

}
