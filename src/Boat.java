
public class Boat extends Vehicle {

	private String type;
	private boolean start;
	private int speed;
	private boolean floating;
	private boolean docked;
	
	
	
	public Boat(String aColor, String aManufacturer,String aType) {
		super(aColor, aManufacturer);
		type=aType;
		speed=0;
		start=false;
		// TODO Auto-generated constructor stub
	}

	public String start()
	{
		start=true;
		floating=false;
		return "The "+ this.getColor()+" "+ type +" is started";
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
				return "The "+ this.getColor()+" "+ type +" is accelerating to "+newSpeed+" mph";
			}
		}
		else
		{
			return "The "+ this.getColor()+" "+ type +" isn't started yet!";
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
					
					return "The "+ this.getColor()+" "+ type +" has braked and stopped";
				}
				else{
					return "The "+ this.getColor()+" "+ type +" is braking to "+newSpeed+" mph";
				}
			}
		}
		else
		{
			return "The "+ this.getColor()+" "+ type +" isn't started yet!";
		}
	}
	public String getModel()
	{
		return type;
	}
	
	public void setModel(String newM)
	{
		type=newM;
	}
	
	
	public void floats()
	{
		if(!docked)
		{
			floating=true;
			brake(0);
			start=false;
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
		floats();
		
		
	}
	public String dock()
	{
		if((!floating) && start)
		{
			if(speed>20)
			{
				return "The "+ this.getColor()+" "+ type +" is going too fast to dock";
			
			}
			else
			{
				return "The "+ this.getColor()+" "+ type +" docked successfully!";
			}
		}
		else if(floating)
		{
			return "The "+ this.getColor()+" "+ type +" is floating!  You can't move!";
		}
		else
		{
			return "The "+ this.getColor()+" "+ type +" isn't started yet!";
		}
	}
	

}
