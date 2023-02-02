package Assignments;
import java.util.Random;
import java.util.Scanner;


public class LadderAndSnake {
	

	private int numOfPlayers;
	private static int[][] board = new int[10][10];
	private int playerPos[] = new int[2];//constructor make in there
	private static int[] player = new int[2];
	private Player[] players;
	private int[] ladders = {1,4,9,21,28,36,51,71,80};
	private int[] snakes = {16,48,64,79,93,95,97,98};
	private Random dice = new Random();
	protected Scanner input = new Scanner(System.in);
	
	
	public int getNumOfPlayers() {//take off after
		return numOfPlayers;
	}


	public Player[] getPlayers() {
		return players;
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
	
	
	public void play() {
		Order();
		players = new Player[2];
		for (int i = 0; i < numOfPlayers; i++) {
			
			Player ply = new Player(player[i]);
			players[i] = ply;
			
		}
		
		
		while (true) {
			for(int i = 0; i<numOfPlayers;i++) {
				int diceValue = flipDice();
				players[i].updatePos(diceValue);
				
			}
			// the game plays
		}
		
		
		
		
		
		
			
	}
}
				
				
				
				
			
		



	
    
