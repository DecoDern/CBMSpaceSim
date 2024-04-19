package space.sim;

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
		this.anzahlSysteme = generiereSonnensysteme(2, 5);
		sonnensystemeErzeugen(anzahlSysteme);
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
		for (Sonnensystem system : verfügbareSysteme)
		{
			System.out.println(zahl + "[" + );
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
			// Menü Auswahl
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
		// Menü zur Auswahl der Aktionen
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
				system1.getPlanetenListe();
				player.getSystem();
				break;
				
			case 2:
				// Info HUD für Planeten und Mond Infos
				system1.sonnensystemInformation(system1);
				break;
				
			case 3:
				// Schiffs HUD, Infos übers Schiff
				kampfschiffListe();
				break;
				
			case 4:
				System.out.println("\nSpiel wird Beendet! Schönen Tag noch :) ");
				gameRunning = false;
				break;
				
			default:
				System.out.println("Ungültige Auswahl. Neue Auswahl treffen: ");
		}
	}
	
	
	
}
