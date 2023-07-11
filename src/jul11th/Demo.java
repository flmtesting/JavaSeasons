package jul11th;

public class Demo {

	public static void main(String[] args) {
		
		try
		{
			String x=null;
			System.out.println(10/2);
			System.out.println(x.length());
		}
		
		catch(ArithmeticException ae)
		{
			System.out.println("ArithmeticException found..");
			System.out.println(ae.getMessage());
		}
		
		catch(NullPointerException npe)
		{
			System.out.println("NullPointerException found..");
			System.out.println(npe.getMessage());
		}
		
		catch(RuntimeException re)
		{
			System.out.println("Runtime Exception found..");
			System.out.println(re.getMessage());
		}
		
		
		catch(Exception e)
		{
			System.out.println("Some New Exception found");
			System.out.println(e.getMessage());
		}
		
			
		finally
		{
			
		}

	}

}
