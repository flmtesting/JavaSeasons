package jun21st;

public class Methods4 {

	public static void main(String[] args) {
		
		Methods4 obj1=new Methods4();
		
		System.out.println(obj1.natSum(5));
		
		System.out.println(obj1.natSum(100));
		
		System.out.println("End of Program");

	}
	
	public int natSum(int n)
	{
		int res=n*(n+1)/2;
		return res;
	}

}
