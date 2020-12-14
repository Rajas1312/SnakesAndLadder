package snakeAndLadder;

public class SnakeAndLadder {

	static int NUMBER_OF_PLAYER=1;
	static int INITIAL_POSITION=0;
	
	public static int getRoll() {
		
	int roll=(int)(Math.random()*10%6+1);
	return roll;
	}
	
	public static void main(String[] args) {
		
	System.out.println("welcome to snake and ladder");

	}
	
}
