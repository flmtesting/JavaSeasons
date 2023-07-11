package jun29th;

public class MethodOveridingDemo1 {

	public static void main(String[] args) {
		
		
		//case 1
		
		//A obj=new A();
		
		//case 2
		
		//B obj=new B();
		
		//case 3  -- > Invalid 
		
	    //	B obj=new A();
		
		//case 4
		
		A obj=new B();
		
		obj.greet("John");
		

	}

}
