package spacesim;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SpaceSimulation 
{
	Player player = new Player();
	
	Scanner scan = new Scanner(System.in);
	private List<Kampfschiff> verf�gbareSchiffe;
	private List<Sonnensystem> verf�gbareSysteme;
	private Kampfschiff aktuellesSchiff;
	private boolean gameRunning;
	private int anzahlSysteme;
	private int zahl;
	
	public SpaceSimulation()
	{
		this.verf�gbareSchiffe = new ArrayList<>();
		this.aktuellesSchiff = null;
		this.gameRunning = true;
		this.verf�gbareSysteme = new ArrayList<>();
		this.anzahlSysteme = generiereSonnensysteme(2, 5);
		sonnensystemeErzeugen(3);
		player.setSystem(verf�gbareSysteme.get(0));
		player.setLocation(player.getSystem().getPlanet(0));
	}
	
	
	
	public void sonnensystemeErzeugen(int anzahlSysteme) 
	{
		for (int i = 0; i < anzahlSysteme; i++)
		{
			Sonnensystem system = new Sonnensystem();
			verf�gbareSysteme.add(system);
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
		for (Sonnensystem system : verf�gbareSysteme)
		{
			System.out.print(zahl + ":" + "[" + (system.getSystemName()) + "]  ");
			zahl += 1;
		}
	}
	
	
	
	public void kampfschiffHinzuf�gen(Kampfschiff kampfschiff)
	{
		verf�gbareSchiffe.add(kampfschiff);
	}
	
	
	public void kampfschiffListe()
	{
		for (Kampfschiff schiff : verf�gbareSchiffe)
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
			// Menü Auswahl
			men�();
			// Scanner input
			System.out.print("Aktion w�hlen: ");
			int input = scan.nextInt();
			// Input verarbeiten
			inputVerarbeiten(input);
		}
	}
	
	public void men�()
	{
		// Menü zur Auswahl der Aktionen
		System.out.println(" ");
		System.out.println("____________________________________________________________________");
		System.out.println("\n1:[Reisen]  2:[Information HUD]  3:[Schiff HUD]  4:[Spiel Beenden]");
		System.out.println("____________________________________________________________________");
	}
	
	public void kampfMen�()
	{
		// Kampflogik
	}
	
	public void reiseMen�()
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
				System.out.print("\nSystem w�hlen: ");
				int system = scan.nextInt();
				
				switch (system)
				{
					case 1:
						System.out.println("\nHier die verf�gbaren Planeten dieses Systems:");
						player.getSystem().planetenListe();
						System.out.print("\nPlanet w�hlen: ");
						int planet = scan.nextInt();
						
						if (planet > player.getSystem().getPlanetList().size())
						{
							System.err.println("Ung�ltig");
						}
						else
						{
							
							switch (planet)
							{
								case 1:
									player.setLocation(player.getSystem().getPlanet(planet-1));
									player.setSystem(verf�gbareSysteme.get(0));
									System.out.println("Du befindest dich nun auf dem Planeten: " + player.getLocation().getPlanetName() + "\n");
									break;
								
								case 2:
									player.setLocation(player.getSystem().getPlanet(planet-1));
									player.setSystem(verf�gbareSysteme.get(0));
									System.out.println("Du befindest dich nun auf dem Planeten: " + player.getLocation().getPlanetName() + "\n");
									break;
									
								case 3:
									player.setLocation(player.getSystem().getPlanet(planet-1));
									player.setSystem(verf�gbareSysteme.get(0));
									System.out.println("Du befindest dich nun auf dem Planeten: " + player.getLocation().getPlanetName() + "\n");
									break;
									
								case 4:
									player.setLocation(player.getSystem().getPlanet(planet-1));
									player.setSystem(verf�gbareSysteme.get(0));
									System.out.println("Du befindest dich nun auf dem Planeten: " + player.getLocation().getPlanetName() + "\n");
									break;
									
								case 5:
									player.setLocation(player.getSystem().getPlanet(planet-1));
									player.setSystem(verf�gbareSysteme.get(0));
									System.out.println("Du befindest dich nun auf dem Planeten: " + player.getLocation().getPlanetName() + "\n");
									break;
									
								case 6:
									player.setLocation(player.getSystem().getPlanet(planet-1));
									player.setSystem(verf�gbareSysteme.get(0));
									System.out.println("Du befindest dich nun auf dem Planeten: " + player.getLocation().getPlanetName() + "\n");
									break;
									
								case 7:
									player.setLocation(player.getSystem().getPlanet(planet-1));
									player.setSystem(verf�gbareSysteme.get(0));
									System.out.println("Du befindest dich nun auf dem Planeten: " + player.getLocation().getPlanetName() + "\n");
									break;
									
								default:
									System.err.println("Ung�ltig");
							}
							break;
						}
						break;
						
						
					case 2:
						System.out.println("\nHier die verf�gbaren Planeten dieses Systems:");
						player.getSystem().planetenListe();
						System.out.print("\nPlanet w�hlen: ");
						int planet2 = scan.nextInt();
						
						if (planet2 > player.getSystem().getPlanetList().size())
						{
							System.err.println("Ung�ltig");
						}
						else
						{
							
							switch (planet2)
							{
								case 1:
									player.setLocation(player.getSystem().getPlanet(planet2-1));
									player.setSystem(verf�gbareSysteme.get(1));
									System.out.println("Du befindest dich nun auf dem Planeten: " + player.getLocation().getPlanetName() + "\n");
									break;
								
								case 2:
									player.setLocation(player.getSystem().getPlanet(planet2-1));
									player.setSystem(verf�gbareSysteme.get(1));
									System.out.println("Du befindest dich nun auf dem Planeten: " + player.getLocation().getPlanetName() + "\n");
									break;
									
								case 3:
									player.setLocation(player.getSystem().getPlanet(planet2-1));
									player.setSystem(verf�gbareSysteme.get(1));
									System.out.println("Du befindest dich nun auf dem Planeten: " + player.getLocation().getPlanetName() + "\n");
									break;
									
								case 4:
									player.setLocation(player.getSystem().getPlanet(planet2-1));
									player.setSystem(verf�gbareSysteme.get(1));
									System.out.println("Du befindest dich nun auf dem Planeten: " + player.getLocation().getPlanetName() + "\n");
									break;
									
								case 5:
									player.setLocation(player.getSystem().getPlanet(planet2-1));
									player.setSystem(verf�gbareSysteme.get(1));
									System.out.println("Du befindest dich nun auf dem Planeten: " + player.getLocation().getPlanetName() + "\n");
									break;
									
								case 6:
									player.setLocation(player.getSystem().getPlanet(planet2-1));
									player.setSystem(verf�gbareSysteme.get(1));
									System.out.println("Du befindest dich nun auf dem Planeten: " + player.getLocation().getPlanetName() + "\n");
									break;
									
								case 7:
									player.setLocation(player.getSystem().getPlanet(planet2-1));
									player.setSystem(verf�gbareSysteme.get(1));
									System.out.println("Du befindest dich nun auf dem Planeten: " + player.getLocation().getPlanetName() + "\n");
									break;
									
								default:
									System.err.println("Ung�ltig");
							}
							break;
						}
						break;
						
						
					case 3:
						System.out.println("\nHier die verf�gbaren Planeten dieses Systems:");
						player.getSystem().planetenListe();
						System.out.print("\nPlanet w�hlen: ");
						int planet3 = scan.nextInt();
						
						if (planet3 > player.getSystem().getPlanetList().size())
						{
							System.err.println("Ung�ltig");
						}
						else
						{
							
							switch (planet3)
							{
								case 1:
									player.setLocation(player.getSystem().getPlanet(planet3-1));
									player.setSystem(verf�gbareSysteme.get(2));
									System.out.println("Du befindest dich nun auf dem Planeten: " + player.getLocation().getPlanetName() + "\n");
									break;
								
								case 2:
									player.setLocation(player.getSystem().getPlanet(planet3-1));
									player.setSystem(verf�gbareSysteme.get(2));
									System.out.println("Du befindest dich nun auf dem Planeten: " + player.getLocation().getPlanetName() + "\n");
									break;
									
								case 3:
									player.setLocation(player.getSystem().getPlanet(planet3-1));
									player.setSystem(verf�gbareSysteme.get(2));
									System.out.println("Du befindest dich nun auf dem Planeten: " + player.getLocation().getPlanetName() + "\n");
									break;
									
								case 4:
									player.setLocation(player.getSystem().getPlanet(planet3-1));
									player.setSystem(verf�gbareSysteme.get(2));
									System.out.println("Du befindest dich nun auf dem Planeten: " + player.getLocation().getPlanetName() + "\n");
									break;
									
								case 5:
									player.setLocation(player.getSystem().getPlanet(planet3-1));
									player.setSystem(verf�gbareSysteme.get(2));
									System.out.println("Du befindest dich nun auf dem Planeten: " + player.getLocation().getPlanetName() + "\n");
									break;
									
								case 6:
									player.setLocation(player.getSystem().getPlanet(planet3-1));
									player.setSystem(verf�gbareSysteme.get(2));
									System.out.println("Du befindest dich nun auf dem Planeten: " + player.getLocation().getPlanetName() + "\n");
									break;
									
								case 7:
									player.setLocation(player.getSystem().getPlanet(planet3-1));
									player.setSystem(verf�gbareSysteme.get(2));
									System.out.println("Du befindest dich nun auf dem Planeten: " + player.getLocation().getPlanetName() + "\n");
									break;
									
								default:
									System.err.println("Ung�ltig");
							}
							break;
						}
						break;
						
				}
				break;
				
			case 2:
				// Info HUD für Planeten und Mond Infos
				player.getSystem().sonnensystemInformation();
				break;
				
			case 3:
				// Schiffs HUD, Infos übers Schiff
				kampfschiffListe();
				break;
				
			case 4:
				System.out.println("\nSpiel wird Beendet! Sch�nen Tag noch :) ");
				gameRunning = false;
				break;
				
			default:
				System.err.println("Ung�ltige Auswahl. Neue Auswahl treffen");
		}
	}
	
	
	
}
