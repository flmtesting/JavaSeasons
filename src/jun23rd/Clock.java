package jun23rd;

public class Clock {
	
	int hr,min,sec;
	
	//setters
	
	public void setClock(int hr)
	{
		this.hr=hr;
	}
	
	public void setClock(int hr,int min)
	{
		this.hr=hr;
		this.min=min;
	}
	public void setClock(int hr,int min,int sec)
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
