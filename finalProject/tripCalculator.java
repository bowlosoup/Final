package finalProject;

public class tripCalculator {
	
	public double cost;
	public double fueleff;
	public double distance;
	public double gas;

	
	
	public void tripCalculator()
	{}
	public double fuelcost(double cost)
	{
		double fc = 1 * cost;
		return fc;
	}
	public double fueleff()
	{
		double fe = 1 * fueleff;
		return fe;
	}
	public double totalfuel()
	{
		double tf = ((cost*gas)*distance)/fueleff + gas;
		return tf;
	}
	
	


	
	
}

	
	
}
