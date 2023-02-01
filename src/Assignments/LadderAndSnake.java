package Assignments;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;


public class LadderAndSnake {
	

	private int numOfPlayers;
	private static int[][] board = new int[10][10];
	private int playerPos = 0;
	private static int[] player = new int[2];
	private int[] ladders = {1,4,9,21,28,36,51,71,80};
	private int[] snakes = {16,48,64,79,93,95,97,98};
	private Random dice = new Random();
	protected Scanner input = new Scanner(System.in);
	//private HashMap user = new HashMap<>();
	
	
	public int getNumOfPlayers() {//take off after
		return numOfPlayers;
	}
	

	
	public int getPlayerPos() {
		return playerPos;
	}




	/**
	 * setting the number of players
	 * @param numOfPlayers
	 */
	
	public LadderAndSnake() {
		
		System.out.println("How many players would like to play?");
		if(input.hasNextInt()) {
			numOfPlayers = input.nextInt();
			}else {
				System.out.println("not an integer, number of players set to 2.");
				numOfPlayers = 2;
			}
				
		if(numOfPlayers<2) {
			System.out.println("Error: Cannot create game with less than 2 player. Exiting Game!");
			System.exit(0);
		}
		else if(numOfPlayers>2) {
			System.out.println("You have chosen "+numOfPlayers+" numbers of players. Unfortunetely, this program can only have 2 players. Value will be set to 2.");
			this.numOfPlayers = 2;
		}
		else this.numOfPlayers=2;
		
		}
		
	public int flipDice() {
			return dice.nextInt(6)+1;		
	}
		
	
	int firstPlayer;
	int secondPlayer;
	int counter = 0;
	
	public void Order(){
		int attempts=1;
		int player1=flipDice();
		int player2=flipDice();
		System.out.println("- Now deciding which player will start playing:");
		System.out.println("- Player 1 got a dice value of "+player1);
		System.out.println("- Player 2 got a dice value of "+player2);
			
		while(player1==player2) {
			System.out.println("- A tie was acheived between Player 1 and Player 2. Attempting to break the tie");
			attempts++;
			player1=flipDice();
			player2=flipDice();
			System.out.println("- Player 1 got a dice value of "+player1);
			System.out.println("- Player 2 got a dice value of "+player2);
		}
		if(player1>player2) {
			firstPlayer=0;
			secondPlayer=1;
			player[0]=1;
			player[1]=2;
		}
		else {
			firstPlayer=1;
			secondPlayer=0;
			player[0]=2;
			player[1]=1;
			}
			System.out.println("Reached final decision on order of playing: Player " + player[0] + " then Player " + player[1] + " It took "+attempts+" attempts before a decision could be made");	
		}
	private int tailSnake(int head) {
		switch(head) {
		case 16:
			return 6;
		case 48:
			return 30;
		case 64:
			return 60;
		case 79:
			return 19;
		case 93:
			return 68;
		case 95:
			return 24;
		case 97:
			return 76;
		case 98:
			return 78;
		default:
			return head;
		}
	}
		
	 private int TopLadder(int bottom) {
		 switch(bottom) {
		 case 1:
			 return 38;
		 case 4:
			 return 14;
		 case 9:
			 return 31;
		 case 21:
			 return 42;
		 case 28:
			 return 84;
		 case 36:
			 return 44;
		 case 51:
			 return 67;
		 case 71:
			 return 91;
		 case 80:
			 return 100;
			 default:
				 return bottom;
		 }
	 }
	
	public void play() {
		Order();
		do {
			if(counter % 2 == 0 && firstPlayer == 0) {
				int diceValue = flipDice();
				System.out.print(" Player "+ player[0]+" got a dice value of "+ diceValue);
				playerPos+=diceValue;
			}	
			else if	(counter % 2 == 0 && secondPlayer == 0) {
			
				
				
			}
			else if (counter % 2!=0 && firstPlayer == 1){
				//player 1 will change here if hes not first
			}
				
			else {
				//player 2 changed whens he is not first
			}
				
			
			
			
			counter++;
			
		}while(playerPos<100 && playerPos<100);
		
		
		
		
		
	}
}
				
				
				
				
			
		



	
    
