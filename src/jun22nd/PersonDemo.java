package jun22nd;

public class PersonDemo {

	public static void main(String[] args) {
		
		// new operator to create an  object
		
		Person p1=new Person();
		
		System.out.println(p1.name);  //null
		System.out.println(p1.age); // 0
		System.out.println(p1.phone); // 0
		
		p1.greet();
		
		Person.bye();
		
		p1.name="SivaMani";
		
		p1.age=30;
		
		p1.phone=9848022338L;

		System.out.println(p1.name); 
		System.out.println(p1.age); 
		System.out.println(p1.phone);
		
		p1.greet();
		
		Person.bye();
	}

}
