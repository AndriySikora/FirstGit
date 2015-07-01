import stanford.karel.SuperKarel;


public class KarelMaze extends SuperKarel {
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
	move ();
	turnRight();
	move ();
	
	while (rightIsBlocked()){
		move ();
	}
	turnRight ();
	move ();
	
	while (rightIsBlocked()){
		move ();
	}
	turnRight ();
	move ();
	turnRight ();
	move ();

	while (frontIsClear()){
		move();
	}
	turnLeft ();
	move ();
	
	while (leftIsBlocked()){
		move ();
	}
	turnLeft ();
	
	while (frontIsClear ()){
		move ();
	}
	/*turnRight ();
	move ();
	move ();
	turnAround ();*/
	
	turnRight ();
	
	while (frontIsClear()){
		move ();
	}
	turnAround ();
	
		
	
	
	

	}
	
	private void moveBackward() {
		turnAround();
		move();
		turnAround();
	}
}
	
