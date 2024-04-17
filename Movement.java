package mytestGame;

import java.util.Random;
import java.util.Scanner;

public class Movement {

	public static void main(String[] args) {
		// The enemy  move randomly
		Random random = new Random();
		Character bomb = new Character("The bomb is on the field");
		Character hero = new Character(20,10);
		Scanner scan = new Scanner(System.in);
		String userInput = "";
		int whBomb = 0;
		System.out.println("to start game, move your hero using letters \"W, S, A and D\"");
		//Starting hero journey
		while(!userInput.equals("exit")) {
			whBomb = random.nextInt(4)+1;
			userInput = scan.nextLine().toLowerCase();
			switch(userInput) {
			case "w":
				hero.moveUP();
				break;
			case "s":
				hero.moveDown();
				break;
			case "a":
				hero.moveLeft();
				break;
			case "d":
				hero.moveRight();
				break;
	
			default:
				if(userInput.equals("exit")) {
					System.out.println("Game over. Thanks for playing !\nyour last point was: x = "+hero.getPosition()[0]+" y = "+hero.getPosition()[1]);
				}
				else {
					System.out.println("You are typed the wrong input we only accept \"W, S, A and D\"\n in the case would you like to finish this type \"EXIT\"");
				}
				break;
			
			}// ending switch
			//System.out.println("This is the bomb number = "+whBomb);
			switch (whBomb) {
			case 1:
				bomb.moveUP();
				break;
			case 2:
				bomb.moveDown();
				break;
			case 3:
				bomb.moveLeft();
				break;
			case 4:
				bomb.moveRight();
				break;
			}//Ending second switch
			//when two object meet each other.
			if(hero.getPosition()[0]==bomb.getPosition()[0] && hero.getPosition()[1]==bomb.getPosition()[1] ) {
				System.out.println("You have found a Bomb game over!");
				break;
			}
		}
		
	}

}
interface Move{
	
	void moveUP();//move up
	void moveDown();//move down	
	void moveLeft(); //move left
	void moveRight(); // move right
}
class Character implements Move{
	private int x = 10;
	private int y = 20;
	private final int myMove =5;
	
	public Character(String name) {
		System.out.println(name);
	}
	public Character(int x, int y) {
		this("Your journey has started");
		this.x = x;
		this.y = y;
		}
	//All methods implementation increase or reduce  the value in 5 either x or y
	// Implementing methods of interface 
	
	
	@Override
	public void moveUP() {
		this.y += myMove;
		System.out.println("you have moved UP");
		System.out.println("you are located at x = "+getPosition()[0]+" y = "+ getPosition()[1]);//Showing where is the character right now.
	}
	@Override
	public void moveDown() {
		
		this.y -= myMove;
		System.out.println("you have moved Down");
		System.out.println("you are located at x = "+getPosition()[0]+" y = "+ getPosition()[1]);
	}
	@Override
	public void moveLeft() {
		
		this.x -= myMove;
		System.out.println("you have moved Left");
		System.out.println("you are located at x = "+getPosition()[0]+" y = "+ getPosition()[1]);
	}
	@Override
	public void moveRight() {
		
		this.x += myMove;
		System.out.println("you have moved Right");
		System.out.println("you are located at x = "+getPosition()[0]+" y = "+ getPosition()[1]);
	}
	//creating a getter
	public int [] getPosition() {
		int [] values = new int[2];
		values[0] = this.x;
		values[1] = this.y;
		return values;
	}
	

	
}