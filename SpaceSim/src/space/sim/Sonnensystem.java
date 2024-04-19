package space.sim;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class Sonnensystem 
{
	private List<Planet> planeten;
	private int anzahlPlaneten;
	private int zahl;
	private String systemName;
	private static List<String> usedNames = new ArrayList<>();
	
	public Sonnensystem()
	{
		this.planeten = new ArrayList<>();
		this.anzahlPlaneten = generierePlaneten(1, 9);
		planetenErzeugen(anzahlPlaneten);
	}
	
	public void planetenErzeugen(int anzahlPlaneten)
	{
		for (int i = 0; i < anzahlPlaneten; i++)
		{		
			Planet planet = new Planet(false, false, false);
			planeten.add(planet);
		}
	}
	
	
	public int generierePlaneten(int min, int max)
	{
		Random rand = new Random();
		return rand.nextInt( (max - min) +1) + min;
		
	}
	
	
	public void sonnensystemInformation(Sonnensystem system)
	{
		System.out.println("\n" + anzahlPlaneten + " Vorhandene Planeten in diesem System: \n");
		for (Planet planet : planeten)
		{
			System.out.println("Planet: " + planet.getPlanetName());
			planet.planetenInformationTest(planet);
			planet.mondInformation(planet);
			System.out.println("________________________\n");
		}
	}
	
	public void getPlanetenListe()
	{
		zahl = 1;
		System.out.println("\nHier die Planeten dieses Systems: \n");
		for (Planet planet : planeten)
		{
			System.out.print(zahl + ":" + "[" + (planet.getPlanetName()) + "] ");
			zahl +=1;
		}
		System.out.println(" ");
	}
	
	
	private void setSystemName(String system)
	{
		this.systemName = system;
	}
	
	
	private void zufälligerNameZuweisen()
	{
		List<String> namen = new ArrayList<>();
		namen.add("System1");
		namen.add("System2");
		namen.add("System3");
		namen.add("System4");
		namen.add("Celestiar");
		namen.add("Stellara");
		namen.add("Cosmara");
		namen.add("Orbius");
//		namen.add("Planety");
//		namen.add("Zoido");
//		namen.add("Corpsol");
//		namen.add("Aurora");
//		namen.add("Elysium");
//		namen.add("Nebulon");
//		namen.add("Vortexia");
//		namen.add("Aerion");
//		namen.add("Aetheria");
//		namen.add("Solaris");
//		namen.add("Hyperion");
//		namen.add("Icarus"); 
//		namen.add("Nemesis"); 
//		namen.add("Artemis"); 
//		namen.add("Galadriel"); 
//		namen.add("Eclipse"); 
//		namen.add("Helios"); 
//		namen.add("Zephyr"); 
//		namen.add("Avalon"); 
//		namen.add("Styx"); 
//		namen.add("Draco"); 


		systemName = namen.get((int)(Math.random() * namen.size()));
		
		if (usedNames.contains(systemName))
		{
			while (usedNames.contains(systemName))
			{
				systemName = namen.get((int)(Math.random() * namen.size()));
				
			}
		}
		
		this.setSystemName(systemName);
		usedNames.add(systemName);
	}
}
