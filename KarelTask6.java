
import stanford.karel.SuperKarel;


public class KarelTask6 extends SuperKarel{
	public void run (){
		firstStep ();
		findExit();
		while (leftIsClear()){
			upStair ();
			moveBack();
			cleanRow ();
			moveBack();
			findExit();
		}
	}
		
		
	private void firstStep (){
		turnLeft ();
		while (frontIsClear()){
			move ();}
		turnAround ();
		
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

