import java.util.*;

public class Board {
	private char[][] arr = new char[3][3];
	public Board(){
		int i,j;
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
				arr[i][j] = '-';
			}
		}
	}
	
	public int put(int x ,int  y ,char val){

		if(arr[x][y] == '-'){
			arr[x][y] = val;
			return 0;
		}
		return 1;
	}
	
	public int checkState(){
		int i,j,count = 0;
		//while(count != 3){
			for(i=0;i<3;i++){
				for(j=0;j<3;j++){
					if(arr[i][j] == 'X'){
						count++;
					}
					else{
						break;
					}
				}
				if(count == 3){
					return 1;
				}
				else{
					count=0;
				
			}
			
		}
	
		//while(count != 3){
			for(j=0;j<3;j++){
				for(i=0;i<3;i++){
					if(arr[i][j] == 'X'){
						count++;
					}
					else{
						break;
					}
				}
				if(count == 3){
					return 1;
				}
				else{
					count =0;
				}
			}
		
		
		if(arr[0][0] == 'X' && arr[1][1] == 'X' && arr[2][2] == 'X'){
			return 1;
		}
		if(arr[0][2] == 'X' && arr[1][1] == 'X' && arr[2][0] == 'X'){
			return 1;
		}
		//while(count != 3){
			for(i=0;i<3;i++){
				for(j=0;j<3;j++){
					if(arr[i][j] == 'O'){
						count++;
					}
					else{
						break;
					}
				}
				if(count == 3){
					return 2;
				}
				else{
					count =0;
				}
			}
			
		
		//while(count != 3){
			for(j=0;j<3;j++){
				for(i=0;i<3;i++){
					if(arr[i][j] == 'O'){
						count++;
					}
					else{
						break;
					}
				}
				if(count == 3){
					return 2;
				}
				else{
					count =0;
				}
			}
		
		
		if(arr[0][0] == 'O' && arr[1][1] == 'O' && arr[2][2] == 'O'){
			return 2;
		}
		if(arr[0][2]== 'O' && arr[1][1] == 'O' && arr[2][0] == 'O'){
			return 2;
		}
		
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
				if(arr[i][j] == '-'){
					count = 0;
					return 0;
				}
			}
		}
		
		return 3;
		
	}
	
	/*public void AI(){
		int i,j,count = 0,k=0;
		char[] temp = new char[3];
		int[][] coord =new int[3][2];
		// row
			for(i=0;i<3;i++){
				for(j=0;j<3;j++){
					if(arr[i][j] == 'O'){
						count++;
					}
					else{
						temp[k]=arr[i][j];
						coord[k][0] = i;
						coord[k][1] = j;
					
						k++;
					}
				}
				if(count == 2){
					int l;
					for(l=0;l<3;l++){
						if(temp[l] == '-'){
							put(coord[l][0],coord[l][1],'O');
							return;
						}
					}
				}
				else{
					count=0;
					k = 0;
					int d,e;
					for(d=0;d<3;d++){
						temp[d]=0;
					}
					for(d=0;d<3;d++){
						for(e=0;e<2;e++){
							coord[d][e]=0;
						}
					}
			}
			
		}
			//column
			int m,n;
			for(m=0;m<3;m++){
				for(n=0;n<2;n++){
					coord[m][n] = 0;
				}
			}
			for(m=0;m<3;m++){
				temp[m]=0;
			}
			k=0;
			for(j=0;j<3;j++){
				for(i=0;i<3;i++){
					if(arr[i][j] == 'O'){
						count++;
					}
					else{
						temp[k]=arr[i][j];
						coord[k][0] = i;
						coord[k][1] = j;
					
						k++;
					}
				}
				if(count == 2){
					int l;
					for(l=0;l<9;l++){
						if(temp[l] == '-'){
							put(coord[l][0],coord[l][1],'O');
							return;
						}
					}
				}
				else{
					count=0;
					k = 0;
					int d,e;
					for(d=0;d<3;d++){
						temp[d]=0;
					}
					for(d=0;d<3;d++){
						for(e=0;e<2;e++){
							coord[d][e]=0;
						}
					}
				
			}
			
		}
		// diagonal1
			for(m=0;m<3;m++){
				for(n=0;n<2;n++){
					coord[m][n] = 0;
				}
			}
			for(m=0;m<3;m++){
				temp[m]=0;
			}
			k = 0;
			for(i=0;i<3;i++){
				if(arr[i][i] == 'X'){
					count++;
				}
				else{
					temp[k] = arr[i][i];
					coord[k][0] = i;
					coord[k][1] = i;
					k++;
				}
			}
			if(count == 2){
				int l;
				for(l=0;l<3;l++){
					if(temp[l] == '-'){
						//System.out.println(coord[l][0]);
						//System.out.println(coord[l][1]);
						put(coord[l][0],coord[l][1],'O');
						return;
					}
				}
			}
			else{
				count=0;
				k = 0;
				int d,e;
				for(d=0;d<3;d++){
					temp[d]=0;
				}
				for(d=0;d<3;d++){
					for(e=0;e<2;e++){
						coord[d][e]=0;
					}
				}
			
		}
			//diagonal2
			for(m=0;m<9;m++){
				for(n=3;n<2;n++){
					coord[m][n] = 0;
				}
			}
			for(m=0;m<3;m++){
				temp[m]=0;
			}
			k=0;
				for(i=0,j=2;i<3 && j>0;i++,j--){
					if(arr[i][j] == 'O'){
						count++;
					}
					else{
						temp[k]=arr[i][j];
						coord[k][0] = i;
						coord[k][1] = j;
					
						k++;
					}
				}
				if(count == 2){
					int l;
					for(l=0;l<3;l++){
						if(temp[l] == '-'){
							put(coord[l][0],coord[l][1],'O');
							return;
						}
					}
				}
				else{
					count=0;
					k = 0;
					int d,e;
					for(d=0;d<3;d++){
						temp[d]=0;
					}
					for(d=0;d<3;d++){
						for(e=0;e<2;e++){
							coord[d][e]=0;
						}
					}
				
			}
				
				//OPPOSITION CHECK
				// Row
				for(m=0;m<3;m++){
					for(n=0;n<2;n++){
						coord[m][n] = 0;
					}
				}
				for(m=0;m<3;m++){
					temp[m]=0;
				}
				k=0;
				for(i=0;i<3;i++){
					for(j=0;j<3;j++){
						if(arr[i][j] == 'X'){
							count++;
						}
						else{
							temp[k]=arr[i][j];
							coord[k][0] = i;
							coord[k][1] = j;
						
							k++;
						}
					}
					if(count == 2){
						int l;
						for(l=0;l<3;l++){
							if(temp[l] == '-'){
								put(coord[l][0],coord[l][1],'O');
								return;
							}
						}
					}
					else{
						count=0;
						k = 0;
						int d,e;
						for(d=0;d<3;d++){
							temp[d]=0;
						}
						for(d=0;d<3;d++){
							for(e=0;e<2;e++){
								coord[d][e]=0;
							}
						}
					
				}
				
			}
				// Column
		
				for(m=0;m<3;m++){
					for(n=0;n<2;n++){
						coord[m][n] = 0;
					}
				}
				for(m=0;m<3;m++){
					temp[m]=0;
				}
				k=0;
				for(j=0;j<3;j++){
					for(i=0;i<3;i++){
						if(arr[i][j] == 'X'){
							count++;
						}
						else{
							temp[k]=arr[i][j];
							coord[k][0] = i;
							coord[k][1] = j;
						
							k++;
						}
					}
					if(count == 2){
						int l;
						for(l=0;l<3;l++){
							if(temp[l] == '-'){
								put(coord[l][0],coord[l][1],'O');
								return;
							}
						}
					}
					else{
						count=0;
						k = 0;
						int d,e;
						for(d=0;d<3;d++){
							temp[d]=0;
						}
						for(d=0;d<3;d++){
							for(e=0;e<2;e++){
								coord[d][e]=0;
							}
						}
					
				}
				
			}
				// diagonal1
				for(m=0;m<3;m++){
					for(n=0;n<2;n++){
						coord[m][n] = 0;
					}
				}
				for(m=0;m<3;m++){
					temp[m]=0;
				}
				k = 0;
				for(i=0;i<3;i++){
					if(arr[i][i] == 'X'){
						count++;
					}
					else{
						temp[k] = arr[i][i];
						coord[k][0] = i;
						coord[k][1] = i;
						k++;
					}
				}
				if(count == 2){
					int l;
					for(l=0;l<3;l++){
						if(temp[l] == '-'){
							put(coord[l][0],coord[l][1],'O');
							return;
						}
					}
				}
				else{
					count=0;
					k = 0;
					int d,e;
					for(d=0;d<3;d++){
						temp[d]=0;
					}
					for(d=0;d<3;d++){
						for(e=0;e<2;e++){
							coord[d][e]=0;
						}
					}
				
			}
				//diagonal2
				for(m=0;m<3;m++){
					for(n=0;n<2;n++){
						coord[m][n] = 0;
					}
				}
				for(m=0;m<3;m++){
					temp[m]=0;
				}
				
					for(i=0,j=2;i<3 && j>0;i++,j--){
						if(arr[i][j] == 'X'){
							count++;
						}
						else{
							temp[k]=arr[i][j];
							coord[k][0] = i;
							coord[k][1] = j;
						
							k++;
						}
					}
					if(count == 2){
						int l;
						for(l=0;l<3;l++){
							if(temp[l] == '-'){
								put(coord[l][0],coord[l][1],'O');
								return;
							}
						}
					}
					else{
						count=0;
						k = 0;
						int d,e;
						for(d=0;d<3;d++){
							temp[d]=0;
						}
						for(d=0;d<3;d++){
							for(e=0;e<2;e++){
								coord[d][e]=0;
							}
						}
					
				}
			Random Randomgenerator  = new Random();
			int x = Randomgenerator.nextInt(3);
			int y = Randomgenerator.nextInt(3);
			while(x<0 || x>2 || y<0 || y>2 || arr[x][y]!='-'){
				x=Randomgenerator.nextInt(3);
				y=Randomgenerator.nextInt(3);
			}	
			arr[x][y]='O';
		
	}*/
	
	
	public char[][] get(){
		return arr;
	}
	 
	
	public void print(){
		int i,j;
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	
}
