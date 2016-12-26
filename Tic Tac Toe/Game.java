import java.util.*;

public class Game {

	public static void main(String[] args) {
		Board obj = new Board();
		//obj.print();
		Scanner inp = new Scanner(System.in);
		int command = inp.nextInt();
		
		if(command == 1){
			//System.out.println("Hi");
			//System.out.println("State is: "+obj.checkState());
			while(obj.checkState() != 3){
				int x1_loc = inp.nextInt();
				int y1_loc = inp.nextInt();
				while(x1_loc > 2 || x1_loc<0 || y1_loc > 2 || y1_loc<0){
					System.out.println("Invalid coordinates. Please enter again");
					x1_loc = inp.nextInt();
					y1_loc = inp.nextInt();
					}
				if(obj.put(x1_loc,y1_loc,'X') == 0){
					obj.print();
					if(obj.checkState() == 1){
						System.out.println("X wins!");
						System.exit(0);
					}
				}
				else{
					while(obj.put(x1_loc, y1_loc, 'X') != 0){
					System.out.println("Invalid coordinates. Please enter again");
					x1_loc = inp.nextInt();
					y1_loc = inp.nextInt();
					}
					//if(obj.put(x1_loc,y1_loc,'X') == 0){
						obj.print();
						if(obj.checkState() == 1){
							System.out.println("X wins!");
							System.exit(0);
						
					}
				}
				if(obj.checkState() == 3){
					break;
				}
				int x2_loc = inp.nextInt();
				int y2_loc = inp.nextInt();
				while(x2_loc > 2 || x2_loc<0 || y2_loc > 2 || y2_loc<0){
					System.out.println("Invalid coordinates. Please enter again");
					x2_loc = inp.nextInt();
					y2_loc = inp.nextInt();
					}
				
				if(obj.put(x2_loc, y2_loc, 'O') == 0){
					obj.print();
					if(obj.checkState() == 2){
						System.out.println("O Wins!");
						System.exit(0);
					}
					
				}
				else{
					while(obj.put(x2_loc, y2_loc, 'O') !=0){
					System.out.println("Invalid coordinates. Please enter again");
					x2_loc = inp.nextInt();
					y2_loc = inp.nextInt();
					}
					//if(obj.put(x2_loc, y2_loc, 'O') == 0){
						obj.print();
						if(obj.checkState() == 2){
							System.out.println("O Wins!");
							System.exit(0);
						
					}
				}
				obj.checkState();
				
			}
			System.out.println("Tie");
			System.exit(0);
		}
		else if(command == 2){
			
			while(obj.checkState() != 3){
				char[][] copy = new char[3][3];
				copy = obj.get();
				Random Randomgenerator  = new Random();
				int [][]zero_pos=new int[9][2];
				//int value;
				//int temp=Randomgenerator.nextInt();
				int count1 = 0;
				int i,j,temp1,temp2;
				for(i=0;i<3;i++){
					for(j=0;j<3;j++){
						if(copy[i][j] == '-'){
						
							zero_pos[count1][0]=i;
							zero_pos[count1][1]=j;
							count1++;
						}
					}
				}
				int temp=Randomgenerator.nextInt(count1);
				int x1_loc = zero_pos[temp][0];
				int y1_loc = zero_pos[temp][1];

				if(obj.put(x1_loc,y1_loc,'X') == 0){
					obj.print();
					if(obj.checkState() == 1){
						System.out.println("Computer wins!");
						System.exit(0);
					}
				}
				/*else{
					while(obj.put(x1_loc, y1_loc, 'X') != 0){
					System.out.println("Invalid coordinates. Please enter again");
					x1_loc = inp.nextInt();
					y1_loc = inp.nextInt();
					}
					//if(obj.put(x1_loc,y1_loc,'X') == 0){
						obj.print();
						if(obj.checkState() == 1){
							System.out.println("Computer wins!");
							System.exit(0);
						
					}
				}*/
				if(obj.checkState() == 3){
					break;
				}
				int x2_loc = inp.nextInt();
				int y2_loc = inp.nextInt();
				while(x2_loc > 2 || x2_loc<0 || y2_loc > 2 || y2_loc<0){
					System.out.println("Invalid coordinates. Please enter again");
					x2_loc = inp.nextInt();
					y2_loc = inp.nextInt();
					}
				
				if(obj.put(x2_loc, y2_loc, 'O') == 0){
					obj.print();
					if(obj.checkState() == 2){
						System.out.println("You Wins!");
						System.exit(0);
					}
					
				}
				else{
					while(obj.put(x2_loc, y2_loc, 'O') !=0){
					System.out.println("Invalid coordinates. Please enter again");
					x2_loc = inp.nextInt();
					y2_loc = inp.nextInt();
					}
					//if(obj.put(x2_loc, y2_loc, 'O') == 0){
						obj.print();
						if(obj.checkState() == 2){
							System.out.println("You Wins!");
							System.exit(0);
						
					}
				}
				obj.checkState();
				
			}
			System.out.println("Tie");
			System.exit(0);
			
		}
		else if(command == 3){
			while(obj.checkState() != 3){
				char[][] copy = new char[3][3];
				copy = obj.get();
				Random Randomgenerator  = new Random();
				int [][]zero_pos=new int[9][2];
				//int value;
				//int temp=Randomgenerator.nextInt();
				int count1 = 0;
				int i,j,temp1,temp2;
				for(i=0;i<3;i++){
					for(j=0;j<3;j++){
						if(copy[i][j] == '-'){
						
							zero_pos[count1][0]=i;
							zero_pos[count1][1]=j;
							count1++;
						}
					}
				}
				int temp=Randomgenerator.nextInt(count1);
				int x1_loc = zero_pos[temp][0];
				int y1_loc = zero_pos[temp][1];

				if(obj.put(x1_loc,y1_loc,'X') == 0){
					obj.print();
					if(obj.checkState() == 1){
						System.out.println("Computer wins!");
						System.exit(0);
					}
				}
				
				obj.AI();
				obj.print();
				if(obj.checkState()==2){
					System.out.println("AI wins!");
					System.exit(0);
				}
		}
		System.out.println("Tie");
		System.exit(0);
		}
		else if(command == 4){
			while(obj.checkState() != 3){
				int x1_loc = inp.nextInt();
				int y1_loc = inp.nextInt();
				while(x1_loc > 2 || x1_loc<0 || y1_loc > 2 || y1_loc<0){
					System.out.println("Invalid coordinates. Please enter again");
					x1_loc = inp.nextInt();
					y1_loc = inp.nextInt();
					}
				if(obj.put(x1_loc,y1_loc,'X') == 0){
					obj.print();
					if(obj.checkState() == 1){
						System.out.println("X wins!");
						System.exit(0);
					}
				}
				else{
					while(obj.put(x1_loc, y1_loc, 'X') != 0){
					System.out.println("Invalid coordinates. Please enter again");
					x1_loc = inp.nextInt();
					y1_loc = inp.nextInt();
					}
					//if(obj.put(x1_loc,y1_loc,'X') == 0){
						obj.print();
						if(obj.checkState() == 1){
							System.out.println("X wins!");
							System.exit(0);
						
					}
				}
				if(obj.checkState() == 3){
					break;
				}
				obj.AI();
				obj.print();
				if(obj.checkState()==2){
					System.out.println("AI wins!");
					System.exit(0);}
			}
			System.out.println("Tie");
			System.exit(0);
				
		}

	}
}

