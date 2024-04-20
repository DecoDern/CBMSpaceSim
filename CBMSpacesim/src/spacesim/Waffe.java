package spacesim;

public class Waffe
{
	private String name;
	private int atk;
	
	public Waffe(String name, int atk)
	{
		this.name = name;
		this.atk = atk;
	}
	
	public int getWaffeATK()
	{
		return atk;
	}
	
	public String getWaffeName()
	{
		return name;
	}
}
