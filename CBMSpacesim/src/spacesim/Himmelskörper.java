package spacesim;

public class Himmelskörper 
{
	private String planetName;
	private String ressource;
	private String mondName;
	private String mondRessource;
	private String terrain;
	private boolean lager;
	private boolean fabrik;
	private boolean besucht;
	
	
	
	
	public Himmelskörper(boolean lager, boolean fabrik, boolean besucht)
	{
		this.lager = lager;
		this.fabrik = fabrik;
		this.besucht = besucht;
	}
	
	
	public String getPlanetName() 
	{
		return planetName;
	}
	
	
	
	public void setPlanetName(String name)
	{
		this.planetName = name;
	}
	
	
	
	public void setMondName(String name)
	{
		this.mondName = name;
	}
	
	
	
	public String getMondName()
	{
		return mondName;
	}
	
	
	
	
	public String getRessource()
	{
		return ressource;
	}
	
	
	
	
	public void setRessource(String ressource) 
	{
		this.ressource = ressource;
	}
	
	
	
	public void setMondRessource(String ressource)
	{
		this.mondRessource = ressource;
	}
	
	
	public String getMondRessource()
	{
		return mondRessource;
	}


	
	
	public boolean getBesucht()
	{
		return besucht;
	}
	
	
	
	
	public String getTerrain()
	{
		return terrain;
	}
	
	
	
	
	public void setTerrain(String terrain)
	{
		this.terrain = terrain;
	}
	
	
	
	
	public boolean getLager()
	{
		return lager;
	}
	
	
	
	
	public boolean getFabrik()
	{
		return fabrik;
	}
	
	
	
	
	public void setBesucht(boolean besucht)
	{
		this.besucht = besucht;
	}

}
