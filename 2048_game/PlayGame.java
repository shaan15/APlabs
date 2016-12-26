// Shaan Chopra 2015090
import java.util.Scanner;

	public class PlayGame{
		public static void main(String[] args){
				
			
			MyPuzzle obj = new MyPuzzle();
			Scanner inp = new Scanner(System.in);
			
			obj.generateTile();
			obj.displayGrid();
			char command = inp.next().charAt(0);
			while(command != 'q'){
				if(command == 'r'){
					obj.moveRight();
					obj.hasWon();
					int x = obj.isOver();
					if(x == 1){
						System.out.println("You lose!");
						System.exit(0);
					}
					obj.generateTile();
					obj.displayGrid();
				}
				else if(command == 'l'){
					obj.moveLeft();
					obj.hasWon();
					int x = obj.isOver();
					if(x == 1){
						System.out.println("You lose!");
						System.exit(0);
				} obj.generateTile();
					obj.displayGrid();
			}
				else if(command == 'u'){
					obj.moveUp();
					obj.hasWon();
					int y = obj.isOver();
					if(y == 1){
						System.out.println("You lose!");
						System.exit(0);
				}	obj.generateTile();
					obj.displayGrid();
					}
				else if(command == 'd'){
					obj.moveDown();
					obj.hasWon();
					int z = obj.isOver();
					if(z == 1){
						System.out.println("You lose!");
						System.exit(0);
				}	obj.generateTile();
					obj.displayGrid();
					}
				command = inp.next().charAt(0);
			}
			System.out.println("Good Bye!");
		}
	
}

