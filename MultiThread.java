package ClientServer;

public class MultiThread extends Thread {
	
	@Override
	public void run() {
		Terre terre = Terre.getInstance();
		terre.show();
	}
	
}
