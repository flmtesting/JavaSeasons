package jun29th;

public class Two extends One{
	
	int a;
	
	public void put(int a)
	{
		this.a=a;
	}
	
	public void showAll()
	{
		System.out.println("a is "+super.a);
		System.out.println("a is "+this.a);
	}

}
