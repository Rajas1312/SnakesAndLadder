package snakeAndLadder;

public class SnakeAndLadder {

	static int NUMBER_OF_PLAYER=2;
	static int INITIAL_POSITION=0;
	static int WINNING_POSITION=100;
	int position1=0;
	int position2=0;
	int numberOfRolls=0;
	int flag=0;
	
	public boolean winningCondition() {
		
		if(this.position1==WINNING_POSITION||this.position2==WINNING_POSITION) {
			return true;
		}
		else {
			return false;
		}
	}
	public static int getRoll() {
		
	int roll=(int)(Math.random()*10%6+1);
	return roll;
	}
	
public  void checkOption() {
		
		
		System.out.println("Selecting the option of play randomly");
		while(!winningCondition()) {
		this.numberOfRolls++;	
		int option=(int)(Math.random()*10%3+1);
		switch(option) {
		
		case 1:
			System.out.println("No play");
			this.position1=this.position1+INITIAL_POSITION;
			if(this.position1>=0 && this.position1<=WINNING_POSITION && this.flag==0) {
			System.out.println("The position of player 1 is "+this.position1);
			System.out.println("The position of player 2 is "+this.position2);
			this.flag=1;
			break;
			}
			else if(this.position1<=0){
				this.position1=INITIAL_POSITION;
			}

			if(this.position2>=0&&this.flag==1) {
			System.out.println("The position of player 1 is "+this.position1 );
			System.out.println("The position of player 2 is "+this.position2);
			this.flag=0;
			break;
			}
			else if(this.position2<=0){
				this.position2=INITIAL_POSITION;
			}
			
			break;
			
			
		case 2:
			System.out.println("ladder encountered");
			int ladder=INITIAL_POSITION+getRoll();
			this.position1=this.position1+ladder;
			if(this.position1>=0 && this.position1<=WINNING_POSITION && flag==0) {
				System.out.println("The position of player 1 is "+this.position1);
				
				this.flag=0;
				break;
			}
			else if(this.position1>WINNING_POSITION){
				this.position1=this.position1-ladder;
				System.out.println("The position of player 1 is "+this.position1);
								
			}
			this.position2=this.position2+ladder;
			if(this.position2>=INITIAL_POSITION&&this.position2<=WINNING_POSITION &&flag==1) {
				
				System.out.println("The position of player 2 is "+this.position2);
				this.flag=1;	
				break;
			}
			else if(this.position2>WINNING_POSITION){
				this.position2=this.position2-ladder;
				System.out.println("The position of player 2 is "+this.position2);
				
			}
			break;
			
		case 3:
			System.out.println("Snake encountred");
			int snake=INITIAL_POSITION-getRoll();
			this.position1=this.position1 +snake;
			if (this.position1>=INITIAL_POSITION &&flag==0) {
				System.out.println("The position of player 1 is "+this.position1);
				this.flag=1;
				break;
			}

			this.position2=this.position2 +snake;
			
			if(this.position2>=0 && flag==1) {
				
				System.out.println("The position of player 2 is "+this.position2);
				this.flag=0;
				break;
			}			
			break;
			
			}
		}
			
		System.out.println("Number of dice rolls is " +this.numberOfRolls);
			
	}
	
	public void getWinner() {
		
		if(this.position1==WINNING_POSITION) {
			System.out.println("Player 1 is a Winner");
			}
		if(this.position2==WINNING_POSITION) {
			System.out.println("Player 2 is a Winner");
			}
	}
	
	
	
	public static void main(String[] args) {
		
	System.out.println("welcome to snake and ladder");
	SnakeAndLadder snakeAndLadder=new SnakeAndLadder();
	snakeAndLadder.checkOption();
	snakeAndLadder.getWinner();
	
	}
	
}
