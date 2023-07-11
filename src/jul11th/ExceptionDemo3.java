package jul11th;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo3 {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException   {
		
		
		System.out.println("Welcome ...");
		
		
			Thread.sleep(3000);
		
		
		new FileInputStream("D:\\FLM0730PM\\Manual Testing\\Defect  Report Template.xlsx");
		
		System.out.println("End of Program");

	}

}
