package Assignments;

public class Player extends LadderAndSnake{
	
	private int position_player;
	private int playerNum;
	
	 
	public int getPosition_player() {
		return position_player;
	}

	
	public void setPosition_player(int position_player) {
		this.position_player = position_player;
	}

	public Player(int playerNum) {
		this.playerNum = playerNum;
		
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
			return -11;
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
				 return -11;
		 }
	 }
	 

	public void updatePos(int diceNum) {
		int positionGo;
		
		if(this.position_player+diceNum == 100) {
			System.out.println("Player"+this.playerNum+"has won!");
			System.exit(0);
		}
		
		if(this.position_player+diceNum>100) {
			positionGo = 100-(this.position_player+diceNum-100);
			System.out.println("Player "+this.playerNum+" fell back to"+ positionGo);
		}
		//quicks dudde off
		Player[] plys = super.getPlayers();
		for (int i = 0 ; i<plys.length;i++) {
			plys[i].getPosition_player();
			if(plys[i].getPosition_player()== this.position_player+diceNum) {
				this.position_player+=diceNum;
				plys[i].setPosition_player(0);
			}
		}
		
		positionGo = TopLadder(diceNum + this.position_player);
		
		//checks if hits a snake, if not then update
		if (positionGo == -11) {
			positionGo = tailSnake(diceNum + this.position_player);
		}
		
		//checks if hits a ladder, if not then update
		if (positionGo==-11) {
			this.position_player+=diceNum;
			return;
		}
		
		// prints out that dude went down
		if (this.position_player < positionGo) {
			System.out.println("Player " + (this.playerNum) + " got caught by a snake. Go to "+positionGo);
			
			//prints out dude whent up
		} else {
			System.out.println("Player " + (this.playerNum) + " climbs a ladder. Go to " +positionGo);

		}
		
		
		//update position
		this.position_player=positionGo;
				
//		
//		
	}
	
}
