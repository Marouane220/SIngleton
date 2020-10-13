package ClientServer;


public class Terre {
	private static Terre instance = new Terre();
	private final double age = 4.54;
	private final double population = 7.6;
	
	private Terre() {
		System.out.println("Instanciation de la terre");
	}
	
	public static Terre getInstance() {
		return instance;
	}
	
	public synchronized void show() {
		System.out.println("l'age de la terre (en 2020) est: "+ age +" Millards");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("la population de la terre (en 2020) est: "+ population +" Millards \n");
	}
	
	

}
