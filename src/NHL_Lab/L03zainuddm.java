package NHL_Lab;

public class L03zainuddm {

	public static void main(String[] args) {
		
		GameCenter gameCenter = new GameCenter(33, 40, 20, 20, 4);
		
		NHLFan1 fan1 = new NHLFan1();
		NHLFan2 fan2 = new NHLFan2();
				
		gameCenter.addObserver(fan1);
		gameCenter.addObserver(fan2);
		
		gameCenter.setHomeID(4);
		gameCenter.setVisitorID(5);
		
		gameCenter.setHomeScore(10);
		gameCenter.setVisitorScore(15);
		
		gameCenter.setCurrentPeriod(4);
		
		gameCenter.setHomeScore(14);
		gameCenter.setVisitorScore(18);
					
	}
}