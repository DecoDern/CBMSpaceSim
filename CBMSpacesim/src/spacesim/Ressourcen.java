package spacesim;

public class Ressourcen 
{
	private String name;
	private int menge;
	
	public Ressourcen(String name, int menge)
	{
		this.name = name;
		this.menge = menge;
		
	}
	
	public void setRessource(String name, int menge)
	{
		this.name = name;
		this.menge = menge;
	}
}
