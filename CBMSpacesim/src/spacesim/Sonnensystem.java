package spacesim;
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
		zufälligerNameZuweisen();
		this.planeten = new ArrayList<>();
		this.anzahlPlaneten = generierePlaneten(1, 7);
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
	
	
	public void sonnensystemInformation()
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
	
	public void planetenListe()
	{
		zahl = 1;
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
		namen.add("ArglaSystem1");
		namen.add("Strokkol");
		namen.add("Systim");
		namen.add("Sykkarl");
		namen.add("Celestiaris");
		namen.add("Stellarana");
		namen.add("Androxifa");
		namen.add("Orbiol");
		namen.add("Plaraga");
		namen.add("Zolx");


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
	
	public String getSystemName()
	{
		return this.systemName;
	}
	
	public List<Planet> getPlanetList()
	{
		return this.planeten;
	}
	
	
	public Planet getPlanet(int index)
	{
		Planet temp = getPlanetList().get(index);
		return temp;
	}
}
