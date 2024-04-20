package spacesim;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SpaceSimulation 
{
	Player player = new Player();
	
	Scanner scan = new Scanner(System.in);
	private List<Kampfschiff> verfügbareSchiffe;
	private List<Sonnensystem> verfügbareSysteme;
	private Kampfschiff aktuellesSchiff;
	private boolean gameRunning;
	private int anzahlSysteme;
	private int zahl;
	
	public SpaceSimulation()
	{
		this.verfügbareSchiffe = new ArrayList<>();
		this.aktuellesSchiff = null;
		this.gameRunning = true;
		this.verfügbareSysteme = new ArrayList<>();
		this.anzahlSysteme = generiereSonnensysteme(2, 5);
		sonnensystemeErzeugen(3);
		player.setSystem(verfügbareSysteme.get(0));
		player.setLocation(player.getSystem().getPlanet(0));
	}
	
	
	
	public void sonnensystemeErzeugen(int anzahlSysteme) 
	{
		for (int i = 0; i < anzahlSysteme; i++)
		{
			Sonnensystem system = new Sonnensystem();
			verfügbareSysteme.add(system);
		}
	}
	
	
	
	public int generiereSonnensysteme(int min, int max)
	{
		Random rand = new Random();
		return rand.nextInt( (max - min) +1 ) + min; 
	}
	
	
	
	public void sonnensystemListe()
	{
		zahl = 1;
		for (Sonnensystem system : verfügbareSysteme)
		{
			System.out.print(zahl + ":" + "[" + (system.getSystemName()) + "]  ");
			zahl += 1;
		}
	}
	
	
	
	public void kampfschiffHinzufügen(Kampfschiff kampfschiff)
	{
		verfügbareSchiffe.add(kampfschiff);
	}
	
	
	public void kampfschiffListe()
	{
		for (Kampfschiff schiff : verfügbareSchiffe)
		{
			System.out.println(schiff.getSchiffName());
		}
	}
	
	public String aktuellesSchiff1()
	{
		return aktuellesSchiff.getSchiffName();
	}
	
	
	public void aktuellesSchiff()
	{
		String name = aktuellesSchiff1();
		System.out.println("Dein Aktuelles Schiff ist: " + name);
	}
	
	public void startSchiff(Kampfschiff kampfschiff)
	{
		aktuellesSchiff = kampfschiff;
	}
	
	
	
	
	public void startGame()
	{
		while (gameRunning)
		{
			// MenÃ¼ Auswahl
			menü();
			// Scanner input
			System.out.print("Aktion wählen: ");
			int input = scan.nextInt();
			// Input verarbeiten
			inputVerarbeiten(input);
		}
	}
	
	public void menü()
	{
		// MenÃ¼ zur Auswahl der Aktionen
		System.out.println(" ");
		System.out.println("____________________________________________________________________");
		System.out.println("\n1:[Reisen]  2:[Information HUD]  3:[Schiff HUD]  4:[Spiel Beenden]");
		System.out.println("____________________________________________________________________");
	}
	
	public void kampfMenü()
	{
		// Kampflogik
	}
	
	public void reiseMenü()
	{
	
	}
	
	public void inputVerarbeiten(int input)
	{
		// Game Logik was passiert nach erhalt des inputs
		switch (input)
		{
			case 1:
				// Reise Logik
				System.out.println("\nDu befindest dich im System: " + player.getSystem().getSystemName());
				System.out.println("Auf dem Planeten: " + player.getLocation().getPlanetName() + "\n");
				System.out.println("In welches System reisen?\n");
				sonnensystemListe();
				System.out.print("\nSystem wählen: ");
				int system = scan.nextInt();
				
				switch (system)
				{
					case 1:
						System.out.println("\nHier die verfügbaren Planeten dieses Systems:");
						player.getSystem().planetenListe();
						System.out.print("\nPlanet wählen: ");
						int planet = scan.nextInt();
						
						if (planet > player.getSystem().getPlanetList().size())
						{
							System.err.println("Ungültig");
						}
						else
						{
							
							switch (planet)
							{
								case 1:
									player.setLocation(player.getSystem().getPlanet(planet-1));
									player.setSystem(verfügbareSysteme.get(0));
									System.out.println("Du befindest dich nun auf dem Planeten: " + player.getLocation().getPlanetName() + "\n");
									break;
								
								case 2:
									player.setLocation(player.getSystem().getPlanet(planet-1));
									player.setSystem(verfügbareSysteme.get(0));
									System.out.println("Du befindest dich nun auf dem Planeten: " + player.getLocation().getPlanetName() + "\n");
									break;
									
								case 3:
									player.setLocation(player.getSystem().getPlanet(planet-1));
									player.setSystem(verfügbareSysteme.get(0));
									System.out.println("Du befindest dich nun auf dem Planeten: " + player.getLocation().getPlanetName() + "\n");
									break;
									
								case 4:
									player.setLocation(player.getSystem().getPlanet(planet-1));
									player.setSystem(verfügbareSysteme.get(0));
									System.out.println("Du befindest dich nun auf dem Planeten: " + player.getLocation().getPlanetName() + "\n");
									break;
									
								case 5:
									player.setLocation(player.getSystem().getPlanet(planet-1));
									player.setSystem(verfügbareSysteme.get(0));
									System.out.println("Du befindest dich nun auf dem Planeten: " + player.getLocation().getPlanetName() + "\n");
									break;
									
								case 6:
									player.setLocation(player.getSystem().getPlanet(planet-1));
									player.setSystem(verfügbareSysteme.get(0));
									System.out.println("Du befindest dich nun auf dem Planeten: " + player.getLocation().getPlanetName() + "\n");
									break;
									
								case 7:
									player.setLocation(player.getSystem().getPlanet(planet-1));
									player.setSystem(verfügbareSysteme.get(0));
									System.out.println("Du befindest dich nun auf dem Planeten: " + player.getLocation().getPlanetName() + "\n");
									break;
									
								default:
									System.err.println("Ungültig");
							}
							break;
						}
						break;
						
						
					case 2:
						System.out.println("\nHier die verfügbaren Planeten dieses Systems:");
						player.getSystem().planetenListe();
						System.out.print("\nPlanet wählen: ");
						int planet2 = scan.nextInt();
						
						if (planet2 > player.getSystem().getPlanetList().size())
						{
							System.err.println("Ungültig");
						}
						else
						{
							
							switch (planet2)
							{
								case 1:
									player.setLocation(player.getSystem().getPlanet(planet2-1));
									player.setSystem(verfügbareSysteme.get(1));
									System.out.println("Du befindest dich nun auf dem Planeten: " + player.getLocation().getPlanetName() + "\n");
									break;
								
								case 2:
									player.setLocation(player.getSystem().getPlanet(planet2-1));
									player.setSystem(verfügbareSysteme.get(1));
									System.out.println("Du befindest dich nun auf dem Planeten: " + player.getLocation().getPlanetName() + "\n");
									break;
									
								case 3:
									player.setLocation(player.getSystem().getPlanet(planet2-1));
									player.setSystem(verfügbareSysteme.get(1));
									System.out.println("Du befindest dich nun auf dem Planeten: " + player.getLocation().getPlanetName() + "\n");
									break;
									
								case 4:
									player.setLocation(player.getSystem().getPlanet(planet2-1));
									player.setSystem(verfügbareSysteme.get(1));
									System.out.println("Du befindest dich nun auf dem Planeten: " + player.getLocation().getPlanetName() + "\n");
									break;
									
								case 5:
									player.setLocation(player.getSystem().getPlanet(planet2-1));
									player.setSystem(verfügbareSysteme.get(1));
									System.out.println("Du befindest dich nun auf dem Planeten: " + player.getLocation().getPlanetName() + "\n");
									break;
									
								case 6:
									player.setLocation(player.getSystem().getPlanet(planet2-1));
									player.setSystem(verfügbareSysteme.get(1));
									System.out.println("Du befindest dich nun auf dem Planeten: " + player.getLocation().getPlanetName() + "\n");
									break;
									
								case 7:
									player.setLocation(player.getSystem().getPlanet(planet2-1));
									player.setSystem(verfügbareSysteme.get(1));
									System.out.println("Du befindest dich nun auf dem Planeten: " + player.getLocation().getPlanetName() + "\n");
									break;
									
								default:
									System.err.println("Ungültig");
							}
							break;
						}
						break;
						
						
					case 3:
						System.out.println("\nHier die verfügbaren Planeten dieses Systems:");
						player.getSystem().planetenListe();
						System.out.print("\nPlanet wählen: ");
						int planet3 = scan.nextInt();
						
						if (planet3 > player.getSystem().getPlanetList().size())
						{
							System.err.println("Ungültig");
						}
						else
						{
							
							switch (planet3)
							{
								case 1:
									player.setLocation(player.getSystem().getPlanet(planet3-1));
									player.setSystem(verfügbareSysteme.get(2));
									System.out.println("Du befindest dich nun auf dem Planeten: " + player.getLocation().getPlanetName() + "\n");
									break;
								
								case 2:
									player.setLocation(player.getSystem().getPlanet(planet3-1));
									player.setSystem(verfügbareSysteme.get(2));
									System.out.println("Du befindest dich nun auf dem Planeten: " + player.getLocation().getPlanetName() + "\n");
									break;
									
								case 3:
									player.setLocation(player.getSystem().getPlanet(planet3-1));
									player.setSystem(verfügbareSysteme.get(2));
									System.out.println("Du befindest dich nun auf dem Planeten: " + player.getLocation().getPlanetName() + "\n");
									break;
									
								case 4:
									player.setLocation(player.getSystem().getPlanet(planet3-1));
									player.setSystem(verfügbareSysteme.get(2));
									System.out.println("Du befindest dich nun auf dem Planeten: " + player.getLocation().getPlanetName() + "\n");
									break;
									
								case 5:
									player.setLocation(player.getSystem().getPlanet(planet3-1));
									player.setSystem(verfügbareSysteme.get(2));
									System.out.println("Du befindest dich nun auf dem Planeten: " + player.getLocation().getPlanetName() + "\n");
									break;
									
								case 6:
									player.setLocation(player.getSystem().getPlanet(planet3-1));
									player.setSystem(verfügbareSysteme.get(2));
									System.out.println("Du befindest dich nun auf dem Planeten: " + player.getLocation().getPlanetName() + "\n");
									break;
									
								case 7:
									player.setLocation(player.getSystem().getPlanet(planet3-1));
									player.setSystem(verfügbareSysteme.get(2));
									System.out.println("Du befindest dich nun auf dem Planeten: " + player.getLocation().getPlanetName() + "\n");
									break;
									
								default:
									System.err.println("Ungültig");
							}
							break;
						}
						break;
						
				}
				break;
				
			case 2:
				// Info HUD fÃ¼r Planeten und Mond Infos
				player.getSystem().sonnensystemInformation();
				break;
				
			case 3:
				// Schiffs HUD, Infos Ã¼bers Schiff
				kampfschiffListe();
				break;
				
			case 4:
				System.out.println("\nSpiel wird Beendet! Schönen Tag noch :) ");
				gameRunning = false;
				break;
				
			default:
				System.err.println("Ungültige Auswahl. Neue Auswahl treffen");
		}
	}
	
	
	
}
