package jul11th;

import java.util.Scanner;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		
		System.out.println("Enter value for x : ");
		Scanner input=new Scanner(System.in);
		
		int x=input.nextInt();
		
		System.out.println("Enter value for y : ");
		
		int y=input.nextInt();
		
		try
		{
		System.out.println("Quotient is "+x/y);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println("Please enter non-zero value for y..");
		}
		finally
		{
			System.out.println("Code for closing");
		}
		
		
		System.out.println("End of Program..");

	}

}
