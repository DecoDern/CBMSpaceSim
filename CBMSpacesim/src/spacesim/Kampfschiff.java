package spacesim;
import java.util.ArrayList;
import java.util.List;


public class Kampfschiff extends Schiff
{
	private List<Waffe> waffen;
	private Waffe aktuelleWaffe;
	private String KampfschiffName;
	
	
	public Kampfschiff(String name, int hp, int def, boolean zerst�rt)
	{
		super(name, hp, def, zerst�rt);
		this.aktuelleWaffe = null;
		this.waffen = new ArrayList<>();
		this.KampfschiffName = name;
		
	}
	
	
	public void waffeHinzuf�gen(Waffe waffe)
	{
		waffen.add(waffe);
		System.out.println("Die Waffe " + waffe.getWaffeName() + " wurde dem Arsenal des Schiffs hinzugefügt");
	}

	
	public void waffeWechseln(Waffe neueWaffe)
	{
		aktuelleWaffe = neueWaffe;
		System.out.println("Deine Ausgerüstete Waffe wurde geändert zu: " + aktuelleWaffe.getWaffeName());
	}
	
	
	public String getSchiffName()
	{
		return KampfschiffName;
	}
	
	
	public void waffenInformation()
	{
		if (aktuelleWaffe != null)
		{	
			 System.out.println("\nWaffen Informationen:\nWaffenname: " + aktuelleWaffe.getWaffeName() + "\nSchaden: " + aktuelleWaffe.getWaffeATK());
		}
		else
		{
			 System.out.println("Keine Waffe ausgerüstet");
		}
	}
	
	
	public void angreifen()
	{
		if (aktuelleWaffe != null)
		{
			int dmg = aktuelleWaffe.getWaffeATK();
			System.out.println("Dein " + getSchiffName() + " greift an und fügt mit " + aktuelleWaffe.getWaffeName() + " " + dmg + " Schaden hinzu.");
			// Angrifslogik
		}
		else
		{
			System.out.println("Keine Waffe ausgerüstet");
			// Angriffslogik
		}
		
	}
	
	
	
}
