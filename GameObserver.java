//GameObserver.java

package NHL_Lab;


public interface GameObserver {

	public void doUpdate(int homeGameID, int visitorGameID, int homeScore, int visitorScore, int currentPeriod);
}
