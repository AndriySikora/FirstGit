
import stanford.karel.SuperKarel;


public class KarelInHouse extends SuperKarel{
	public void run (){
		moveToNewspaper ();
		pickNewspaper ();
		comeBackHome ();
		
	}
	private void moveToNewspaper (){
		move ();
		move ();
		turnRight ();
		move ();
		turnLeft ();
		}
	private void pickNewspaper (){
		move ();
		if (beepersPresent()){
			pickBeeper();
		}
		turnAround ();
	}
	private void comeBackHome() {
	
		while (frontIsClear()){
			move ();
		}
		turnRight ();
		move ();
		turnRight ();
		}
	

	}
	


