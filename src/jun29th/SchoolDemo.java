package jun29th;

public class SchoolDemo {

	public static void main(String[] args) {
		
		
		//Student  s1=new Student();
		//Marks s1=new Marks();
		Leave s1=new Leave();
		
		s1.setDetails(1, "Ravi");
		s1.getDetails();
		s1.setMarks(70, 80, 90);
		s1.getResults();
		s1.setLeaves(6, 10);
		s1.getLeaves();
		

	}

}
