
public class Plane extends Vehicle {

	private String model;
	private boolean start;
	private int speed;
	private boolean flying;
	private Pilot pilot;
	
	public Plane(String aColor, String aManufacturer, String aModel, Pilot aPilot) {
		super(aColor, aManufacturer);
		model=aModel;
		speed=0;
		start=false;
		flying=false;
		pilot=aPilot;
		
		// TODO Auto-generated constructor stub
	}
	public String start()
	{
		start=true;
		return "The "+ this.getColor()+" "+ model +" is started";
	}
	
	@Override
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
				if(speed>160)
				{
					flying();
					
				}
				
					
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
		if(start && (!flying)){
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
		else if(flying)
		{
			return "The "+ this.getColor()+" "+ model +" is flying! You can't brake!";
		}
		else
		{
			return "The "+ this.getColor()+" "+ model +" isn't started yet!";
		}
	}
	public String decelerate(int newSpeed)
	{
		if(start && (flying)){
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
				
				if(newSpeed<50)
				{
					
					return "The plane can't go that slow and fly!";
				}
				else{
					speed=newSpeed;
					return "The "+ this.getColor()+" "+ model +" is decelerating to "+newSpeed+" mph";
				}
			}
		}
		else
		{
			return "The "+ this.getColor()+" "+ model +" isn't flying yet!  Try braking";
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
	
	
	private void flying()
	
	{
		flying=true;
		System.out.println("The "+ this.getColor()+" "+ model +" has lifted off!");
	}
	public void land()
	{
		if(speed>180)
		{
			System.out.println("The plane is flying too fast to land!");
		}
		else
		{
			flying=false;
			System.out.println("The "+ this.getColor()+" "+ model +" has landed!");
		}
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
		// 
		
		return "The pilto of the plane is "+pilot.getName();
	}

}
