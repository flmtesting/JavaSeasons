package jun23rd;

public class Clock1 {
	
	int hr,min,sec;
	
	public Clock1()
	{
		hr=10;
		min=10;
		sec=10;
	}
	
	public Clock1(int hr)
	{
		this.hr=hr;
	}
	
	public Clock1(int hr,int min)
	{
		this.hr=hr;
		this.min=min;
	}
	
	public Clock1(int hr,int min,int sec)
	{
		this.hr=hr;
		this.min=min;
		this.sec=sec;
	}
	
	public void getClock()
	{
		System.out.format("%02d:%02d:%02d",hr,min,sec);
		System.out.println();
	}

}
