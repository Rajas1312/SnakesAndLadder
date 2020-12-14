package snakeAndLadder;

public class SnakeAndLadder {

	static int NUMBER_OF_PLAYER=1;
	static int INITIAL_POSITION=0;
	static int WINNING_POSITION=100;
	int position=0;
	
	public static int getRoll() {
		
	int roll=(int)(Math.random()*10%6+1);
	return roll;
	}
	
public  void checkOption() {
		
		
		System.out.println("Selecting the option of play randomly");
		while(this.position!=WINNING_POSITION) {
		int option=(int)(Math.random()*10%3+1);
		switch(option) {
		
		case 1:
			System.out.println("No play");
			this.position=this.position+INITIAL_POSITION;
			if(this.position>=0) {
			System.out.println(this.position);
			}
			else {
				this.position=INITIAL_POSITION;
			}
			break;
		case 2:
			System.out.println("ladder encountered");
			int ladder=INITIAL_POSITION+getRoll();
			this.position=this.position+ladder;
			if(this.position>=0 && this.position<=100) {
				System.out.println(this.position);
			}
			else {
				this.position=INITIAL_POSITION;
				System.out.println(INITIAL_POSITION);
			}
			break;
		case 3:
			System.out.println("Snake encountred");
			int snake=INITIAL_POSITION-getRoll();
			this.position=this.position +snake;
			if (this.position>=0) {
				System.out.println(this.position);
			}
			else {
				this.position=INITIAL_POSITION;
				System.out.println(INITIAL_POSITION);
			}
			break;
			}
			
		}
			
	}
	
	
	public static void main(String[] args) {
		
	System.out.println("welcome to snake and ladder");
	SnakeAndLadder snakeAndLadder=new SnakeAndLadder();
	snakeAndLadder.checkOption();
	}
	
}
