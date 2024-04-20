package spacesim;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mond extends Himmelsk�rper
{
	private String mondName;
	private String mondRessource;
	private static List<String> usedNames = new ArrayList<>();

	public Mond(boolean lager, boolean fabrik, boolean besucht) 
	{
		super(lager, fabrik, besucht);
		zufälligerMondNameZuweisen();
		zufälligeMondRessourceZuweisen();
		
	}
	
	private void zufälligerMondNameZuweisen()
	{
	    List<String> namen = new ArrayList<>();
	    namen.add("Lunara");
	    namen.add("Selena");
	    namen.add("Astrion");
	    namen.add("Phobos");
	    namen.add("Deimos");
	    namen.add("Titanus");
	    namen.add("Lunaris");
	    namen.add("Nebula");
	    namen.add("Aquila");
	    namen.add("Galaxia");
	    namen.add("Polaris");
	    namen.add("Neptunia");
	    namen.add("Sirius");
	    namen.add("Orion");
	    namen.add("Auriga");
	    namen.add("Perseus");
	    namen.add("Andromeda");
	    namen.add("Cassiopeia");
	    namen.add("Lyra");
	    namen.add("Tranquility");
	    namen.add("Elysian"); 
	    namen.add("Seraphim"); 
	    namen.add("Luminara"); 
	    namen.add("Astoria"); 
	    namen.add("Lysandra"); 
	    namen.add("Arcturus");
	    namen.add("Umbriel"); 
	    namen.add("Nova"); 
	    namen.add("Aether");
	    namen.add("Coakl");
	    namen.add("Serbbzu");
	    namen.add("Ast");
	    namen.add("x7543");
	    namen.add("Toot");
	    namen.add("CaptainHero");
	    namen.add("Zandir");
	    namen.add("Neblock");
	    namen.add("FreundlicherGeist");
	    namen.add("WaffeKaufen");
	    namen.add("Beeeee");
	    namen.add("Kappalon");
	    namen.add("SirBlackjack");
	    namen.add("Ori");
	    namen.add("Auriaga");
	    namen.add("Perse");
	    namen.add("Androx");
	    namen.add("Cressle");
	    namen.add("Lyramo");
	    namen.add("Tranqx");
	    namen.add("Elyos"); 
	    namen.add("Asmodae"); 
	    namen.add("Azera"); 
	    namen.add("Assimi"); 
	    namen.add("Lysol"); 
	    namen.add("Arcx34");
	    namen.add("UxUdF3"); 
	    namen.add("Avon"); 
	    namen.add("skorm");
	    
	    mondName = namen.get((int)(Math.random() * namen.size()));
	    
	    if (usedNames.contains(mondName))
	    {
		    while (usedNames.contains(mondName)) 
		    {
		        mondName =  namen.get((int)(Math.random() * namen.size()));
		    }
	    }
		    
	    this.setMondName(mondName);
	    usedNames.add(mondName);
	}
	
	private void zufälligeMondRessourceZuweisen()
	{
		List<String> ressourcen = new ArrayList<>();
		ressourcen.add("Eisen");
		ressourcen.add("Wasser");
		ressourcen.add("Platin");
		ressourcen.add("Titan");
		ressourcen.add("Kristall");
		ressourcen.add("Holz");
		ressourcen.add("Dunkle Energie");
		ressourcen.add("Schwefel");
		Random randRessource = new Random();
		mondRessource = ressourcen.get(randRessource.nextInt(ressourcen.size()));
		this.setMondRessource(mondRessource);
		
	}
	
	
}
