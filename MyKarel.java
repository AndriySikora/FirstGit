import stanford.karel.SuperKarel;


public class MyKarel extends SuperKarel{
	public void run(){
		
		move ();
		pickBeeper ();
		turnLeft ();
		while(frontIsClear ()){
			move ();
		}
		
		turnRight ();
		
		
		while(frontIsClear ()){
			move ();
		}
		turnAround();
		putBeeper ();
		
	    while(frontIsClear()){
	    	move();
	    }
	    turnLeft();
	    while(frontIsClear()){
	    	move();
	    }
	    turnLeft();
		}
			
		}
		

			
		
			
		
				
			
		


		
			
			
		
		
		
		
			
		
			
			
			
		
		/*while (frontIsClear ()) {
			move ();
		if (beepersPresent()) {
			pickBeeper ();
			turnLeft ();}
		if (rightIsClear ()) {
			turnRight ();}
		
		}
		

		/*move ();
		pickBeeper ();
		turnLeft();
		while (frontIsClear()){
			move ();{
		if (rightIsClear()){
				turnRight ();
				move ();
			}
		if (frontIsBlocked()){
			turnAround();
		} else {
			frontIsClear ();*/
		  			
	


		
	
	

		
		
		
			
			
	


