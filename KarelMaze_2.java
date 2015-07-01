import stanford.karel.SuperKarel;

public class KarelMaze_2 extends SuperKarel{
	public void run (){
		move ();
		pickBeeper ();
		turnLeft ();
		move();
		
	while (rightIsBlocked ()){
		move ();
	}
	moveBackward ();
	putBeeper ();
	turnLeft ();
	move ();
	turnLeft ();
	
	while(frontIsClear()){
    	move();
    	}
	turnLeft ();
   
	}
	private void moveBackward() {
		turnAround();
		move();
		turnAround();
	}
	
	
}
