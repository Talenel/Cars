
public class Car extends Vehicle {
	
	private String model;
	private boolean start;
	private int speed;
	private Driver driver;

	public Car(String aColor, String aManufacturer, Driver aDriver)
	{
		super( aColor,  aManufacturer);
		speed=0;
		model="car";
		start=false;
		driver=aDriver;
	}
	
	public Car(String aColor, String aManufacturer, String aModel) {
		super(aColor, aManufacturer);
		model=aModel;
		speed=0;
		start=false;
		// TODO Auto-generated constructor stub
	}

	public String start()
	{
		start=true;
		return "The "+ this.getColor()+" "+ model +" is started";
	}
	
	public String accelerate(int newSpeed)
	{
		if(start){	
			if(speed>newSpeed)
			{
				return "You can't accelerate to go slower silly!";
			}
			else if(speed==newSpeed)
			{
				return "You're already going that speed";
				
			}
			else
			{
				speed=newSpeed;
				return "The "+ this.getColor()+" "+ model +" is accelerating to "+newSpeed+" mph";
			}
		}
		else
		{
			return "The "+ this.getColor()+" "+ model +" isn't started yet!";
		}
		
		
	}
	public String brake(int newSpeed)
	{
		if(start){
			if(speed<newSpeed)
			{
				return "You can't decelerate to go faster silly!";
			}
			else if(speed==newSpeed)
			{
				return "You're already going that speed";
				
			}
			
			else
			{
				speed=newSpeed;
				if(newSpeed==0)
				{
					
					return "The "+ this.getColor()+" "+ model +" has braked and stopped";
				}
				else{
					return "The "+ this.getColor()+" "+ model +" is braking to "+newSpeed+" mph";
				}
			}
		}
		else
		{
			return "The "+ this.getColor()+" "+ model +" isn't started yet!";
		}
	}
	public String getModel()
	{
		return model;
	}
	
	public void setModel(String newM)
	{
		model=newM;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		start();
		accelerate(1);
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		start=false;
		brake(0);
		
		
	}

	@Override
	public String getOperator() {
		// TODO Auto-generated method stub
		return "The driver of the car is "+driver.getName();
	}
	
	
}
