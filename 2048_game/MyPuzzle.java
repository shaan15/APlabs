// Shaan Chopra 2015090
import java.util.*;


public class MyPuzzle{
	public static int[][] arr = new int[4][4];
	
	public MyPuzzle(){
		int i,j;
		
		for(i=0;i<4;i++){
			for(j=0;j<4;j++){
				arr[i][j] = 0;
			}
		}
	}
	void generateTile(){
		Random Randomgenerator  = new Random();
		//Random Randomgenerator = new Random();
		
		int [][]zero_pos=new int[16][2];
		
		int value;
		int temp=Randomgenerator.nextInt();
		if(temp%2==0)value=2;
		else value=4;
		
		int count=0;
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				if(arr[i][j] == 0){
					zero_pos[count][0]=i;
					zero_pos[count][1]=j;
					count++;
				}
			}
		}
		if(count==0)return;
		int pos=Randomgenerator.nextInt(count);
		arr[zero_pos[pos][0]][zero_pos[pos][1]]=value;
	}
	
	void displayGrid(){
		int i,j;
		for(i= 0;i<4;i++){
			for(j=0;j<4;j++){
			System.out.print(arr[i][j]+" ");
		}
			System.out.println();
	}
		

	}
	void shift_zero_rt(int i,int j){
		int k=j;
		while( k<3 && arr[i][k+1]==0){
			arr[i][k+1] = arr[i][k];
			arr[i][k]=0;
			k++;
		}
	}
	void combine_rt(int i,int j){
		arr[i][j+1] = arr[i][j+1] + arr[i][j];
		arr[i][j]=0;
	}
	void moveRight(){
		int i,j;
		for(i=0;i<4;i++){
			for(j=0;j<4;j++){
				if(j+1<4 && arr[i][j+1] == 0){
					shift_zero_rt(i,j);
				}
				else if(j+1<4 && arr[i][j] == arr[i][j+1]){
					combine_rt(i,j);
					j++;
				}
			}
			for(j=0;j<4;j++){
				if(j+1<4 && arr[i][j+1] == 0){
					shift_zero_rt(i,j);
				}
			}
			for(j=0;j<4;j++){
				if(j+1<4 && arr[i][j+1] == 0){
					shift_zero_rt(i,j);
				}
			}
			for(j=0;j<4;j++){
				if(j+1<4 && arr[i][j+1] == 0){
					shift_zero_rt(i,j);
				}
			}
		}
		
	}
	void shift_zero_lt(int i,int j){
		int k=j;
		while( k-1>=0 && arr[i][k-1]==0){
			arr[i][k-1] = arr[i][k];
			arr[i][k]=0;
			k--;
		}
	}
	void combine_lt(int i,int j){
		arr[i][j-1] = arr[i][j-1] + arr[i][j];
		arr[i][j]=0;
	}
	void moveLeft(){
		int i,j;
		for(i=0;i<4;i++){
			for(j=3;j>=0;j--){
				if(j-1 >=0 && arr[i][j-1] == 0){
					shift_zero_lt(i,j);
				}
				if(j-1 >= 0 && arr[i][j] == arr[i][j-1]){
					combine_lt(i,j);
					j--;
				}
			}
			for(j=3;j>=0;j--){
				if(j-1 >=0 && arr[i][j-1] == 0){
					shift_zero_lt(i,j);
				}
			}
			for(j=3;j>=0;j--){
				if(j-1 >=0 && arr[i][j-1] == 0){
					shift_zero_lt(i,j);
				}
			}
			for(j=3;j>=0;j--){
				if(j-1 >=0 && arr[i][j-1] == 0){
					shift_zero_lt(i,j);
				}
			}
		}
		
	}
	void shift_zero_down(int i,int j){
		int k=i;
		while( k+1<4 && arr[k+1][j]==0){
			arr[k+1][j] = arr[k][j];
			arr[k][j]=0;
			k++;
		}
	}
	void combine_down(int i,int j){
		arr[i+1][j] = arr[i+1][j] + arr[i][j];
		arr[i][j]=0;
	}
	void moveDown(){
		int i,j;
		for(j=0;j<4;j++){
			for(i=0;i<4;i++){
				if(i+1<4 && arr[i+1][j] == 0){
					shift_zero_down(i,j);
				}
				else if(i+1<4 && arr[i][j] == arr[i+1][j]){
					combine_down(i,j);
					i++;
				}
			}
			for(i=0;i<4;i++){
				if(i+1<4 && arr[i+1][j] == 0){
					shift_zero_down(i,j);
				}
			}
			for(i=0;i<4;i++){
				if(i+1<4 && arr[i+1][j] == 0){
					shift_zero_down(i,j);
				}
			}
			for(i=0;i<4;i++){
				if(i+1<4 && arr[i+1][j] == 0){
					shift_zero_down(i,j);
				}
			}
		}
		
	}
	
	void shift_zero_up(int i,int j){
		int k=i;
		while( k-1>=0 && arr[k-1][j]==0){
			arr[k-1][j] = arr[k][j];
			arr[k][j]=0;
			k--;
		}
	}
	void combine_up(int i,int j){
		arr[i-1][j] = arr[i-1][j] + arr[i][j];
		arr[i][j]=0;
	}
	void moveUp(){
		int i,j;
		for(j=0;j<4;j++){
			for(i=3;i>=0;i--){
				if(i-1 >=0 && arr[i-1][j] == 0){
					shift_zero_up(i,j);
				}
				else if(i-1 >= 0 && arr[i][j] == arr[i-1][j]){
					combine_up(i,j);
					i--;
				}
			}
			for(i=3;i>=0;i--){
				if(i-1 >=0 && arr[i-1][j] == 0){
					shift_zero_up(i,j);
				}
			}
			for(i=3;i>=0;i--){
				if(i-1 >=0 && arr[i-1][j] == 0){
					shift_zero_up(i,j);
				}
			}
			for(i=3;i>=0;i--){
				if(i-1 >=0 && arr[i-1][j] == 0){
					shift_zero_up(i,j);
				}
			}
		}
		
	}

	int isOver(){
		int i,j;
		for(i=0;i<4;i++){
			for(j=0;j<4;j++){
				if(arr[i][j] == 0){
					return 0;
					
				}
				else if(i-1>=0 && arr[i-1][j] == arr[i][j]){
					return 0;
				}
				else if(i+1<4 && arr[i+1][j] == arr[i][j]){
					return 0;
				}
				else if(j-1>=0 && arr[i][j-1] == arr[i][j]){
					return 0;
				}
				else if(j+1<4 && arr[i][j+1] == arr[i][j]){
					return 0;
				}
			}
		}
		return 1;
	}

	
	void hasWon(){
		int i,j;
		for(i=0;i<4;i++){
			for(j=0;j<4;j++){
				if(arr[i][j] == 2048){
					System.out.println("You win!");
				}
			}
		}

	}
	
}


