package spacesim;
  
public class Player 
{
	private Sonnensystem aktuellesSystem;
	private Himmelsk�rper aktuelleLocation;
	private Kampfschiff aktuellesSchiff;
	
	public void setSystem(Sonnensystem system)
	{
		this.aktuellesSystem = system;
	}
	
	public Sonnensystem getSystem()
	{
		return aktuellesSystem;
	}
	
	public void setLocation(Himmelsk�rper location)
	{
		this.aktuelleLocation = location;
	}
	
	public Himmelsk�rper getLocation()
	{
		return aktuelleLocation;
	}
}
