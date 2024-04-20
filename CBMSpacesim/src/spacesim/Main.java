package spacesim;

public class Main {

	public static void main(String[] args) 
	{
		SpaceSimulation simulation = new SpaceSimulation();

	    Kampfschiff kampfschiff1 = new Kampfschiff("Small Boy", 100, 50, false);
	    Kampfschiff kampfschiff2 = new Kampfschiff("Big Boy", 120, 60, false);
	    Kampfschiff kampfschiff3 = new Kampfschiff("Goliath", 150, 70, false);

	    simulation.kampfschiffHinzufügen(kampfschiff1);
	    simulation.kampfschiffHinzufügen(kampfschiff2);
	    simulation.kampfschiffHinzufügen(kampfschiff3);
	    simulation.startSchiff(kampfschiff1);
	    
	    /*
	    Waffe stock = new Waffe("Stock", 2);
	    Waffe laser = new Waffe("Laser", 50);
	    Waffe rakete = new Waffe("Rakete", 100);
	    
	    kampfschiff1.waffeHinzufÃ¼gen(stock);
	    
		simulation.aktuellesSchiff();
		kampfschiff1.waffeWechseln(stock);
		kampfschiff1.waffenInformation();
		
		 
		String output = kampfschiff1.waffenInformation();
		System.out.println(output);
		int test = merkur.generiereZufallszahl(1, 7);
		System.out.println("Deine Zufallszahl " + test);
		
		merkur.planetenInformation();
		merkur.setBesucht(true);
		merkur.planetenInformation();
		
		system1.sonnensystemInformation();
	     */
	    simulation.startGame();
		
	}

}
