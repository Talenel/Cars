
public abstract class Vehicle {
	
	private String color;
	private String manufact;
	

	public Vehicle(String aColor, String aManufacturer ) {
		// TODO Auto-generated constructor stub
		color=aColor;
		manufact=aManufacturer;
		System.out.printf("This is a %s %s \n", color, manufact);
		
	}
	
	public String getColor()
	{
		return color;
	}
	public String getManufact()
	{
		return manufact;
	}
	
	public void setManufact(String newM)
	{
		manufact=newM;
		
	}
	public void setColor(String newC)
	{
		color=newC;
		
	}
	
	public abstract String accelerate(int newSpeed);
	
	public abstract void run();
	
	public abstract void stop();

}
