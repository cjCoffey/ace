public class CleanEnergyModel
{
	public static void main(String[] args)
	{
		//args = [storage_capacity] use this line to keep track of args needed
		final float STORAGE = Float.valueOf(args[0]);
		float stored = 0.f; //init storage to 0 

		System.out.println("Storage cap: " + STORAGE);
		//parse weather file to get wind and solar energy

		//model solar power generated
		float solar = 0.f;
		
		//model wind power generated
		float wind = 0.f;
		
		//double production  = solar + wind 
		float production = 0.f;
		
		//model demand
		float demand = 0.f;
		
		//power city
		boolean powered = false;
		float net = production - demand;
		if(net < 0 && stored > net)
		{
			stored  = stored - net;
			powered = true;
		}
		else
		{
			//TODO
		}


		//switch case for storage
			//case demand < solar + wind
			//case demand = solar + wind
			//case demand > solar + wind
		System.out.print("RAN");

	}
}