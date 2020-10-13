package ClientServer;

public class Client {

	public static void main(String[] args) {
		/* for(int i=0 ; i<=5 ; i++) {
			Terre terre = Terre.getInstance();
			terre.show();
		} */
		for(int i=0; i<=5 ; i++) {			
			MultiThread thread = new MultiThread();
			thread.start();
		}
	}

}
