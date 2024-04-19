package space.sim;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Planet extends Himmelskörper
{
	private Raumstation raumstation;
	private List<Mond> monde;
	private static List<String> usedNames = new ArrayList<>();
	private String planetRessource;
	private String planetTerrain;
	private String planetName;
	private int anzahlMonde;
	

	
	public Planet(boolean lager, boolean fabrik, boolean besucht) 
	{
		super(lager, fabrik, besucht);
		zufälligeRessourceZuweisen();
		zufälligesTerrainZuweisen();
		zufälligerNameZuweisen();
		this.raumstation = null;
		this.monde = new ArrayList<>();
		this.anzahlMonde = generiereMonde(1,7);
		mondeErzeugen(anzahlMonde);
	}
	
	
	private void zufälligeRessourceZuweisen()
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
		planetRessource = ressourcen.get(randRessource.nextInt(ressourcen.size()));
		this.setRessource(planetRessource);
		
	}
	
	private void zufälligesTerrainZuweisen()
	{
		List<String> terrain = new ArrayList<>();
		terrain.add("Gestein");
		terrain.add("Wasser");
		terrain.add("Magma");
		terrain.add("Eis");
		terrain.add("Wüste");
		terrain.add("Urwald");
		terrain.add("Wiese");
		Random randTerrain = new Random();
		planetTerrain = terrain.get(randTerrain.nextInt(terrain.size()));
		this.setTerrain(planetTerrain);
	}
	
	private void zufälligerNameZuweisen()
	{
		List<String> namen = new ArrayList<>();
		namen.add("Glorzorp");
		namen.add("Hoggol");
		namen.add("Astraforma");
		namen.add("Novaterra");
		namen.add("Celestiar");
		namen.add("Stellara");
		namen.add("Cosmara");
		namen.add("Orbius");
		namen.add("Planety");
		namen.add("Zoido");
		namen.add("Corpsol");
		namen.add("Aurora");
		namen.add("Elysium");
		namen.add("Nebulon");
		namen.add("Vortexia");
		namen.add("Aerion");
		namen.add("Aetheria");
		namen.add("Solaris");
		namen.add("Hyperion");
		namen.add("Icarus"); 
		namen.add("Nemesis"); 
		namen.add("Artemis"); 
		namen.add("Galadriel"); 
		namen.add("Eclipse"); 
		namen.add("Helios"); 
		namen.add("Zephyr"); 
		namen.add("Avalon"); 
		namen.add("Styx"); 
		namen.add("Draco"); 


		planetName = namen.get((int)(Math.random() * namen.size()));
		
		if (usedNames.contains(planetName))
		{
			while (usedNames.contains(planetName))
			{
				planetName = namen.get((int)(Math.random() * namen.size()));
				
			}
		}
		
		this.setPlanetName(planetName);
		usedNames.add(planetName);
	}
	
	private void mondeErzeugen(int anzahlMonde)
	{
		for (int i = 0; i <anzahlMonde; i++)
		{
			Mond mond = new Mond(false, false, false);
			monde.add(mond);
		}
	}
	
	public int generiereMonde(int min, int max)
	{
		Random rand = new Random();
		return rand.nextInt( (max - min) +1) + min;
	}
	
	public void planetenInformation(Planet planet)
	{
	    if (planet.getBesucht())
	    {
	        System.out.println
	        (
	    		"\nPlaneten Infos: \nName: " + planet.getPlanetName() + 
	    		"\nRessourcen: " + planet.getRessource() + 
	    		"\nTerrain: " + planet.getTerrain() + 
	    		"\nLager vorhanden: " + planet.getLager() + 
	    		"\nFabrik vorhanden: " + planet.getFabrik()  
	        );
	        System.out.println(" ");
	        System.out.println("Vorhandene Monde: " + anzahlMonde + "\n");
	    }
	    else
	    {
	        System.out.println("\nKeine Planeten Informationen vorhanden\n");
	    }
	}

	
	public void setBesucht(boolean besucht)
	{
		super.setBesucht(besucht);
	}
	
	public void mondInformation(Planet planet)
	{
		for (Mond mond : monde)
		{
			System.out.println("Name: " + mond.getMondName() + "\n- Ressource: " + mond.getMondRessource());
		}
	}
	
	
	
	public void planetenInformationTest(Planet planet)
	{
		 System.out.println
	        (
	    		"\nPlaneten Infos:\n \nName: " + planet.getPlanetName() + 
	    		"\nRessourcen: " + planet.getRessource() + 
	    		"\nTerrain: " + planet.getTerrain() + 
	    		"\nLager vorhanden: " + planet.getLager() + 
	    		"\nFabrik vorhanden: " + planet.getFabrik()  
	        );
	        System.out.println(" ");
	        System.out.println("Vorhandene Monde: " + anzahlMonde + "\n");
	}
	
}
