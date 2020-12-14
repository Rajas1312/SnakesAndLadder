package snakeAndLadder;

public class SnakeAndLadder {

	static int NUMBER_OF_PLAYER=1;
	static int INITIAL_POSITION=0;
	
	public static int getRoll() {
		
	int roll=(int)(Math.random()*10%6+1);
	return roll;
	}
	public void checkOption() {
		
		System.out.println("Selecting the option of play randomly");
		int option=(int)(Math.random()*10%3+1);
		switch(option) {
		
		case 1:
			System.out.println("No play");
			System.out.println(INITIAL_POSITION);
			
			break;
		case 2:
			System.out.println("ladder encountered");
			int ladder=INITIAL_POSITION+getRoll();
			System.out.println(ladder);
			break;
			
		case 3:
			System.out.println("Snake encountred");
			int snake=INITIAL_POSITION-getRoll();
			System.out.println(snake);
			break;
		}
	}
	
	public static void main(String[] args) {
		
	System.out.println("welcome to snake and ladder");
	SnakeAndLadder snakeAndLadder=new SnakeAndLadder();
	snakeAndLadder.checkOption();
	}
	
}
