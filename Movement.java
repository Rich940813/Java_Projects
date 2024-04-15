package mytestGame;

import java.util.Scanner;

public class Movement {

	public static void main(String[] args) {
		Hero h1 = new Hero(20,10);
		Scanner scan = new Scanner(System.in);
		String userInput = "";
		//Starting hero journey
		while(!userInput.equals("exit")) {
			userInput = scan.nextLine().toLowerCase();
			switch(userInput) {
			case "w":
				h1.moveUP();
				break;
			case "s":
				h1.moveDown();
				break;
			case "a":
				h1.moveLeft();
				break;
			case "d":
				h1.moveRight();
				break;
	
			default:
				if(userInput.equals("exit")) {
					System.out.println("Game over. Thanks for playing !\nyour last point was: x = "+h1.getPosition()[0]+" y = "+h1.getPosition()[1]);
				}
				else {
					System.out.println("You are typed the wrong input we only accept \"W, S, A and D\"\n in the case would you like to finish this type \"EXIT\"");
				}
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
class Hero implements Move{
	private int x = 10;
	private int y = 20;
	private final int myMove =5;
	
	public Hero() {
		System.out.println("Your journey has started");
	}
	public Hero(int x, int y) {
		this();
		this.x = x;
		this.y = y;
		}
	//All methods implementation increase or reduce  the value in 5 either x or y
	// Implementing methods of interface 
	
	
	@Override
	public void moveUP() {
		this.y += myMove;
		System.out.println("you have moved UP");
		System.out.println("you are located at x = "+getPosition()[0]+" y = "+ getPosition()[1]);//Showing where is the hero right now.
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
	//creating a setter
	public int [] getPosition() {
		int [] values = new int[2];
		values[0] = this.x;
		values[1] = this.y;
		return values;
	}
	
}