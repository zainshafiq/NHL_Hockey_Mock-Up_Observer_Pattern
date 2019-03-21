/**
 * 
 */
package NHL_Lab;


import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

/**
 * @author trevordouglas
 *
 */

public class GameCenter implements GameSubject {
	
	Set <GameObserver> gameObservers; 
	
	private int homeGameID;
	private int visitorGameID;
	private int homeScore;
	private int visitorScore;
	private int currentPeriod;
	private Hashtable<String, Integer> teams;
	
	public GameCenter(int homeGameID, int visitorGameID, int homeScore, 
						int visitorScore, int currentPeriod) {
		
		gameObservers = new HashSet<GameObserver>();
		
		this.homeGameID = homeGameID;
		this.visitorGameID = visitorGameID;
		this.homeScore = homeScore;
		this.visitorScore = visitorScore;
		this.currentPeriod = currentPeriod;
		
		teams  = new Hashtable<String, Integer>();
		teams.put("Toronto Maple Leafs", 1);
		teams.put("Montreal Canadiens", 2);
		teams.put("Edmonton Oilers", 3);	
		teams.put("Vancouver Canucks", 4);
		teams.put("Calgary Flames",  5);
		teams.put("Ottawa Senators", 6);
		}
	
	
	@Override
	public void addObserver(GameObserver gameObserver) {
		gameObservers.add(gameObserver);
	}
	
	@Override
	public void removeObserver(GameObserver gameObserver) {
		gameObservers.remove(gameObserver);
	}

	@Override
	public void doNotify() {
		Iterator<GameObserver> it = gameObservers.iterator();
		
		while (it.hasNext()) {
			GameObserver gameObserver = it.next();
			gameObserver.doUpdate(homeGameID, visitorGameID, homeScore, 
					visitorScore, currentPeriod);
		}
	}

	public void setHomeID(int newHomeID) {
		System.out.println("\nThe Home Team, The Vancouver Canucks '" + newHomeID + "'");
		homeScore = newHomeID;
		doNotify();
	}
	
	public void setVisitorID(int newVisitorID) {
		System.out.println("\nThe Visitor Team, The Calgary Flames '" + newVisitorID + "'");
		homeScore = newVisitorID;
		doNotify();
	}
	
	public void setHomeScore(int newHomeScore) {
		System.out.println("\nThe Home Team Score " + newHomeScore);
		homeScore = newHomeScore;
		doNotify();
	}
	
	public void setVisitorScore(int newVisitorScore) {
		System.out.println("\nThe Visitor Team Score " + newVisitorScore);
		homeScore = newVisitorScore;
		doNotify();
	}
	
	public void setCurrentPeriod(int newCurrentPeriod) {
		System.out.println("\nCurrent Period is " + newCurrentPeriod);
		homeScore = newCurrentPeriod;
		doNotify();
	}
	
	
}
	
	
