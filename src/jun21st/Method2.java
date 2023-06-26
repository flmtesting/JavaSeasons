package jun21st;

public class Method2 {

	public static void main(String[] args) {
		
		Method2 obj=new Method2();
		
		obj.natSum(5);
		
		obj.natSum(10);
		
		obj.natSum(100);

	}
	
	public void natSum(int n)
	{
		int res=n*(n+1)/2;
		
		System.out.println(res);
	}

}
