package Factory;

public class Main 

{

	public static void main(String[] args) 
	{
		EngineFactory engineFactory = new EngineFactory();
		engineFactory.getSelectedEngine("CAR").getEngine();
		engineFactory.getSelectedEngine("Truck").getEngine();
	}

}
