package Factory;

public class EngineFactory 
{

	public Vechicle getSelectedEngine(String vechicle)
	
	{
		
		if (vechicle.equalsIgnoreCase("CAR") )
		{
		return new Car();
		}
		else if (vechicle.equalsIgnoreCase("TRUCK") )
		{
			return new Truck();
		
		}
		else if (vechicle.equalsIgnoreCase("ELECTRIC") )
		{
			return new ElectricVechicle();
		
		}
			
		return null;
	}
}
