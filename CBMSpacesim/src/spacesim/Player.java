package spacesim;
  
public class Player 
{
	private Sonnensystem aktuellesSystem;
	private Himmelskörper aktuelleLocation;
	private Kampfschiff aktuellesSchiff;
	
	public void setSystem(Sonnensystem system)
	{
		this.aktuellesSystem = system;
	}
	
	public Sonnensystem getSystem()
	{
		return aktuellesSystem;
	}
	
	public void setLocation(Himmelskörper location)
	{
		this.aktuelleLocation = location;
	}
	
	public Himmelskörper getLocation()
	{
		return aktuelleLocation;
	}
}
