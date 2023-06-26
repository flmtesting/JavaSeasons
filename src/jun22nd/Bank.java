package jun22nd;

public class Bank {
	
	
	private double balance = 10000;
	
	//setter
	public void setBalance(int amount)
	{
		balance=balance+amount;
	}
	
	//getters
	public double getBalance(int pin,int otp)
	{
		
		//validation
		
		if(pin==6543 && otp==124578)
		{
			return balance;
		}
		
		else
		{
			System.out.println("Pin Entered is wrong ..");
			return 0.0;
		}
		//return
		
		
	}

}
