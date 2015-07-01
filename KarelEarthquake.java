import stanford.karel.SuperKarel;


public class KarelEarthquake extends SuperKarel{
	public void run (){
		repairColumn ();
	for (int i=0; i<13;i++){
		repairColumn();
	}
			
	}
		
	
	private void repairColumn () {
		if (noBeepersPresent()){
				putBeeper();
			}
			while (frontIsClear()){
				move();
				}
		}
	}

		
	
				
		
	
	

	

