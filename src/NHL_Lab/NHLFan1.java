package NHL_Lab;

public class NHLFan1 implements GameObserver {

	@Override
	public void doUpdate(int homeGameID, int visitorGameID, int homeScore, int visitorScore, int currentPeriod) {
		// TODO Auto-generated method stub
				System.out.println("NHL Fan 1 just found out the home score " 
				         + homeScore + " and the visitor score " + visitorScore + " in " + currentPeriod + "th period.");
			}
}