//Davin Singh
//APCS 1 4th Period
//February 2020
//Traveler superclass, it can travel and have a name/get the name and distance traveled.

public class Traveler 
{
	//fields
	private int distanceTraveled;
	private String name;
	
	
	//constructor
	public Traveler(String name)
	{
		this.distanceTraveled = 0;
		this.name = name;
	}
	
	
	//methods
	public int getDistanceTraveled()
	{
		return distanceTraveled;
	}
	
	public void travel(int miles)
	{
		distanceTraveled += miles;
	}
	
	public String getName()
	{
		return name;
	}
	
}
