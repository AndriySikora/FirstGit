

import stanford.karel.SuperKarel;


public class KarelCleaner extends SuperKarel{
	public void run (){
		cleanRow ();
		moveBack();
		findExit();
		while (leftIsClear()){
			upStair ();
			moveBack();
			cleanRow ();
			moveBack();
			findExit();
		}
	}
		
		
	
	private void cleanRow (){
		if (beepersPresent()){
			pickBeeper ();}
	while (frontIsClear()){
		move ();
		if (beepersPresent()){
			pickBeeper ();}
	}
		}
	private void upStair (){
		if (leftIsClear()){
			turnLeft ();
			move ();
			turnRight ();
		}	
	}
	private void moveBack (){
		turnAround();
		while(frontIsClear())
			move();
		turnAround();
	}
	
	private void findExit (){
		while ((leftIsBlocked())&&(frontIsClear())){
			move ();
			
		}
	}
	}

