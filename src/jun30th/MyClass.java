package jun30th;

public class MyClass implements MyInter{

	int a;
	public void setA(int a)
	{
		this.a=a;
	}
	
	@Override
	public void display() {
		
		System.out.println("a is "+a);
		
	}

}
