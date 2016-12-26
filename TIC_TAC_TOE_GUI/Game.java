import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.*;
import java.awt.GridLayout;
import java.util.*;
import javax.swing.Timer;

public class Game {
	private JFrame frame;
	private JLabel label1;
	private JPanel panel;
	private JTextField out;
	private Grid grid;
	private String u1;
	private String u2;
	private int mode;
	private Timer timer;
	
	public static void main(String[] args){
		//System.out.println("YOOOOO");
		Game gui = new Game();
		gui.go();
	}
	class Grid extends JPanel implements ActionListener{
		private JButton buttons[][] = new JButton[3][3];
		private Board board;
		private boolean play_X;
		
		Grid(){
			board = new Board();
			play_X = true;
			this.setLayout(new GridLayout(3,3));
			int i,j;
			for(i=0;i<3;i++){
				for(j=0;j<3;j++){
				buttons[i][j] = new JButton();
				buttons[i][j].setFocusable(false);
				buttons[i][j].setFont(buttons[i][j].getFont().deriveFont(20.0f));
				buttons[i][j].setOpaque(true);
				//buttons
				this.add(buttons[i][j]);
				buttons[i][j].addActionListener(this);
				}
			}
		}
		
		public boolean getPlayerX(){
			return play_X;
		}
		
		public void actionPerformed(ActionEvent ev){
			int i = 0,j=0;
			
			for(i=0;i<3;i++){
				for(j=0;j<3;j++){
				if(ev.getSource() == buttons[i][j]){
					//if(mode==4){
						//tileClickedAI(i,j);
						//moveMade(play_X);
						//break;
					//}
					//else{
						tileClicked(i,j);
						moveMade(play_X);
						break;
					//}
					
				}
			}
		}
		}
		
		public void tileClicked(int i,int j){
			
			if(play_X){
				board.put(i,j,'X');
				out.setText(u2 + "'s turn");
			}
			if(!play_X){
				board.put(i,j,'O');
				out.setText(u1 + "'s turn");
			}
			
			setTileValues();
			buttons[i][j].setEnabled(false);
			
			if(board.checkState()!=0){
				gameOver();
				
				
				
				setDisableGrid();
				
				
			}
			play_X = !play_X;
		}
//		public void tileClickedAI(int i,int j){
//			if(play_X){
//				board.put(i,j,'X');
//			}
//			if(!play_X){
//				board.put(i,j,'O');
//			}
//			setTileValues();
//			buttons[i][j].setEnabled(false);
//			if(board.checkState()!=0){
//				gameOver();
//				//colour();
//				setDisableGrid();
//				
//				
//			}
//		}
		public void colour(){
			if(getBoard().get()[0][0] == 'X' && getBoard().get()[1][1] == 'X' && getBoard().get()[2][2] == 'X'){
				//System.out.println("Colored Diagnol");
				//buttons[0][0].setContentAreaFilled(false);
				//buttons[0][0].setOpaque(true);
				buttons[0][0].setBackground(Color.CYAN);
				//buttons[1][1].setOpaque(true);
				buttons[1][1].setBackground(Color.CYAN);
				//buttons[2][2].setOpaque(true);
				buttons[2][2].setBackground(Color.CYAN);
			}
			else if(getBoard().get()[0][2] == 'X' && getBoard().get()[1][1] == 'X' && getBoard().get()[2][0] == 'X'){
				buttons[0][2].setBackground(Color.CYAN);
				buttons[1][1].setBackground(Color.CYAN);
				buttons[2][0].setBackground(Color.CYAN);
			}
			else if(getBoard().get()[0][0] == 'X' && getBoard().get()[0][1] == 'X' && getBoard().get()[0][2] == 'X'){
				buttons[0][0].setBackground(Color.CYAN);
				buttons[0][1].setBackground(Color.CYAN);
				buttons[0][2].setBackground(Color.CYAN);
			}
			else if(getBoard().get()[1][0] == 'X' && getBoard().get()[1][1] == 'X' && getBoard().get()[1][2] == 'X'){
				buttons[1][0].setBackground(Color.CYAN);
				buttons[1][1].setBackground(Color.CYAN);
				buttons[1][2].setBackground(Color.CYAN);
			}
			else if(getBoard().get()[2][0] == 'X' && getBoard().get()[2][1] == 'X' && getBoard().get()[2][2] == 'X'){
				buttons[2][0].setBackground(Color.CYAN);
				buttons[2][1].setBackground(Color.CYAN);
				buttons[2][2].setBackground(Color.CYAN);
			}
			else if(getBoard().get()[0][0] == 'X' && getBoard().get()[1][0] == 'X' && getBoard().get()[2][0] == 'X'){
				buttons[0][0].setBackground(Color.CYAN);
				buttons[1][0].setBackground(Color.CYAN);
				buttons[2][0].setBackground(Color.CYAN);
			}
			else if(getBoard().get()[0][1] == 'X' && getBoard().get()[1][1] == 'X' && getBoard().get()[2][1] == 'X'){
				buttons[0][1].setBackground(Color.CYAN);
				buttons[1][1].setBackground(Color.CYAN);
				buttons[2][1].setBackground(Color.CYAN);
			}
			else if(getBoard().get()[0][2] == 'X' && getBoard().get()[1][2] == 'X' && getBoard().get()[2][2] == 'X'){
				buttons[0][2].setBackground(Color.CYAN);
				buttons[1][2].setBackground(Color.CYAN);
				buttons[2][2].setBackground(Color.CYAN);
			}
			else if(getBoard().get()[0][0] == 'O' && getBoard().get()[1][1] == 'O' && getBoard().get()[2][2] == 'O'){
				buttons[0][0].setBackground(Color.CYAN);
				buttons[1][1].setBackground(Color.CYAN);
				buttons[2][2].setBackground(Color.CYAN);
			}
			else if(getBoard().get()[0][2] == 'O' && getBoard().get()[1][1] == 'O' && getBoard().get()[2][0] == 'O'){
				buttons[0][2].setBackground(Color.CYAN);
				buttons[1][1].setBackground(Color.CYAN);
				buttons[2][0].setBackground(Color.CYAN);
			}
			else if(getBoard().get()[0][0] == 'O' && getBoard().get()[0][1] == 'O' && getBoard().get()[0][2] == 'O'){
				buttons[0][0].setBackground(Color.CYAN);
				buttons[0][1].setBackground(Color.CYAN);
				buttons[0][2].setBackground(Color.CYAN);
			}
			else if(getBoard().get()[1][0] == 'O' && getBoard().get()[1][1] == 'O' && getBoard().get()[1][2] == 'O'){
				buttons[1][0].setBackground(Color.CYAN);
				buttons[1][1].setBackground(Color.CYAN);
				buttons[1][2].setBackground(Color.CYAN);
			}
			else if(getBoard().get()[2][0] == 'O' && getBoard().get()[2][1] == 'O' && getBoard().get()[2][2] == 'O'){
				buttons[2][0].setBackground(Color.CYAN);
				buttons[2][1].setBackground(Color.CYAN);
				buttons[2][2].setBackground(Color.CYAN);
			}
			else if(getBoard().get()[0][0] == 'O' && getBoard().get()[1][0] == 'O' && getBoard().get()[2][0] == 'O'){
				buttons[0][0].setBackground(Color.CYAN);
				buttons[1][0].setBackground(Color.CYAN);
				buttons[2][0].setBackground(Color.CYAN);
			}
			else if(getBoard().get()[0][1] == 'O' && getBoard().get()[1][1] == 'O' && getBoard().get()[2][1] == 'O'){
				buttons[0][1].setBackground(Color.CYAN);
				buttons[1][1].setBackground(Color.CYAN);
				buttons[2][1].setBackground(Color.CYAN);
			}
			else if(getBoard().get()[0][2] == 'O' && getBoard().get()[1][2] == 'O' && getBoard().get()[2][2] == 'O'){
				buttons[0][2].setBackground(Color.CYAN);
				buttons[1][2].setBackground(Color.CYAN);
				buttons[2][2].setBackground(Color.CYAN);
			}
		}
		public void setTileValues(){
			//System.out.println("DBJHDJBJ");
			int i,j;
			for(i=0;i<3;i++){
				for(j=0;j<3;j++){
					if(board.get()[i][j]!='-'){
						buttons[i][j].setText("" + board.get()[i][j]);
					}else
						buttons[i][j].setText("");
				}
			}
		}
		public void setDisableGrid(){
			int m,n;
			for(m = 0;m<3;m++){
				for(n = 0 ; n<3 ; n++){
					buttons[m][n].setEnabled(false);
					
				}
			}
		}
		public void setEnableGrid(){
			char a[][] = board.get();
			int m,n;
			for(m = 0;m<3;m++){
				for(n = 0 ; n<3 ; n++){
					buttons[m][n].setEnabled(true);
					buttons[m][n].setBackground(null);
					a[m][n] = '-';
					setTileValues();
					
				}
			}
			play_X = true;
			
			
		}
		public Board getBoard(){
			return board;
		}
		
		

	}
	public Game(){
		mode = 0;
		frame = new JFrame();
		panel = new JPanel();
		grid = new Grid();
		grid.setDisableGrid();
		out = new JTextField();
		frame.getContentPane().add(panel);
		panel.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		
		JButton start_button = new JButton("START GAME");
		start_button.setBackground(Color.CYAN);
		final JPanel panelGame = new JPanel();
		panelGame.setLayout(new BorderLayout());
		JPanel leftPanel = new JPanel();
		panelGame.add(BorderLayout.WEST, leftPanel);
		leftPanel.setLayout(new GridBagLayout());
		GridBagConstraints gbc1 = new GridBagConstraints();
		gbc1.gridwidth = GridBagConstraints.REMAINDER;
		gbc1.fill = GridBagConstraints.HORIZONTAL;
		
		JButton UvsU = new JButton("User 1 vs User 2");
		UvsU.setBackground(Color.ORANGE);
				UvsU.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent ev){
						mode = 1;
						grid.setDisableGrid();
						JPanel dialog=new JPanel();
						dialog.setLayout(new BoxLayout(dialog,BoxLayout.Y_AXIS));
						JTextField user1=new JTextField(10);
						JTextField user2=new JTextField(10);
						dialog.add(new JLabel("User 1:"));
						dialog.add(user1);
						dialog.add(Box.createHorizontalStrut(15));
						dialog.add(new JLabel("User 2:"));
						dialog.add(user2);
						JOptionPane.showConfirmDialog(null, dialog," ",JOptionPane.CLOSED_OPTION);
						u1=user1.getText();
						u2=user2.getText();
						if(!u1.equalsIgnoreCase("") && !u2.equalsIgnoreCase("")){
							grid.setEnableGrid();
							out.setText(u1+"'s turn");
						}
						else{
							   //System.out.println("Invalid Usernames");
							   //dialog.setValue(JOptionPane,"OKay");
							   JOptionPane.showMessageDialog(null,"Invalid Username!");
						}
						
												 
						 
					}
					
				});
				JButton UvsC = new JButton("User vs CPU");
				UvsC.setBackground(Color.ORANGE);
				UvsC.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent ev){
						mode = 2;
						grid.setDisableGrid();
						JPanel dialog=new JPanel();
						JTextField user1=new JTextField(10);
						dialog.add(new JLabel("User 1:"));
						dialog.add(user1);
						JOptionPane.showConfirmDialog(null, dialog," ",JOptionPane.CLOSED_OPTION);
						u1=user1.getText();
						u2="CPU";
						if(!u1.equalsIgnoreCase("")){
							grid.setEnableGrid();
							out.setText(u1+"'s turn");
						}
						else{
							JOptionPane.showMessageDialog(null,"Invalid Username!");
						}
						
						
					}
				});
				
				JButton CvsA = new JButton("CPU vs AI bot");
				CvsA.setBackground(Color.ORANGE);
				CvsA.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent ev){
						mode = 3;
						grid.setDisableGrid();
						
						final boolean AIplaysFirst= (Math.random()>0.5);
						
						if(!AIplaysFirst){
							u1 = "CPU";
							u2 = "AI";
						}
						else{
							u1 = "AI";
							u2 = "CPU";
						}

						grid.setEnableGrid();
						out.setText(u1+"'s turn");
						
						
						
						
						//ActionListener timerListener = ;
						timer = new Timer(1000, new ActionListener(){
							public void actionPerformed(ActionEvent ev){
								
								if(AIplaysFirst==false && grid.getPlayerX()){
									int temp = getCPUmove();
									grid.tileClicked(temp/3, temp%3);
								}else{
									int temp = getAIMove(AIplaysFirst);
									grid.tileClicked(temp/3, temp%3);
								}
								
							} 
					});
						timer.start();
						
					}
				});
				JButton UvsA = new JButton("User vs AI bot");
				UvsA.setBackground(Color.ORANGE);
				UvsA.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent ev){
						mode = 4;
						grid.setDisableGrid();
						JPanel dialog=new JPanel();
						JTextField user1=new JTextField(10);
						dialog.add(new JLabel("User 1:"));
						dialog.add(user1);
						JOptionPane.showConfirmDialog(null, dialog," ",JOptionPane.CLOSED_OPTION);
						u1=user1.getText();
						u2="AI";
						if(!u1.equalsIgnoreCase("")){
							grid.setEnableGrid();
							out.setText(u1+"'s turn");
						}
						else{
							JOptionPane.showMessageDialog(null,"Invalid Username!");
						}
						
						
						
		                
		             }
				});
				JButton exit_but = new JButton("EXIT");
				exit_but.setBackground(Color.RED);
				exit_but.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent ev){
						System.exit(0);
					}
				});
				leftPanel.add(UvsU,gbc1);
				leftPanel.add(new JLabel(" "), gbc1);
				leftPanel.add(UvsC,gbc1);
				leftPanel.add(new JLabel(" "), gbc1);
				leftPanel.add(CvsA,gbc1);
				leftPanel.add(new JLabel(" "), gbc1);
				leftPanel.add(UvsA,gbc1);
				leftPanel.add(new JLabel(" "), gbc1);
				leftPanel.add(new JLabel(" "), gbc1);
				leftPanel.add(new JLabel(" "), gbc1);
				leftPanel.add(exit_but,gbc1);
				
				JPanel rightPanel = new JPanel();
			
				panelGame.add(BorderLayout.CENTER,rightPanel);
				
				
				

				
				rightPanel.setLayout(new BorderLayout());
				//Grid grid = new Grid();
				rightPanel.add(BorderLayout.CENTER, grid);
				/*rightPanel.add(Box.createVerticalGlue());
				rightPanel.add(Box.createHorizontalStrut(15));*/
				//out.setText(" OUTPUT: ");
				rightPanel.add(BorderLayout.SOUTH, out);
				rightPanel.add(BorderLayout.NORTH, new JLabel(" "));
				rightPanel.add(BorderLayout.EAST, new JLabel("   "));
				rightPanel.add(BorderLayout.WEST, new JLabel("   "));
				
		start_button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ev){
				
				frame.setContentPane(panelGame);
				frame.revalidate();
				
			}
		});

		JButton exit_button = new JButton("EXIT");
		exit_button.setBackground(Color.CYAN);
		exit_button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ev){
				System.exit(0);
			}
		});
		
		label1 = new JLabel("    TIC TAC TOE");
		panel.add(label1, gbc);
		panel.add(new JLabel(" "), gbc);
		panel.add(start_button, gbc);
		panel.add(new JLabel(" "), gbc);
		panel.add(exit_button, gbc);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		

		
	}
	
	public void moveMade(boolean play_X){
//		if(grid.getBoard().checkState()==1){
//			out.setText(u1+" wins!");
//		}
//		else if(grid.getBoard().checkState()==2){
//			out.setText(u2 + " wins!");
//		}
//		else if(grid.getBoard().checkState()==3){
//			out.setText("It's a tie!");
//		}
//		else if(play_X){
//			out.setText(u1 + "'s turn");
//		}
//		else{
//			out.setText(u2 + "'s turn");
//		}
		
		if(mode == 2 && grid.getBoard().checkState()==0){
			int temp = getCPUmove();
			grid.tileClicked(temp/3, temp%3);
		}
		else if(mode == 4 && grid.getBoard().checkState()==0){
			int temp = getAIMove(false);
			grid.tileClicked(temp/3, temp%3);
		}
	}
	public int getCPUmove(){
		char[][] copy = new char[3][3];
		copy = grid.getBoard().get();
		Random Randomgenerator  = new Random();
		int [][]zero_pos=new int[9][2];
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
		return(x1_loc*3 + y1_loc);
	}
	
	public int getAIMove(boolean AIisX){
		//System.out.println("Working");
		int i,j,count = 0,k=0;
		char[] temp = new char[3];
		int[][] coord =new int[3][2];
		// row
			for(i=0;i<3;i++){
				for(j=0;j<3;j++){
					if(grid.getBoard().get()[i][j] ==  (AIisX?'X':'O') ){
						count++;
					}
					else{
						temp[k]=grid.getBoard().get()[i][j];
						coord[k][0] = i;
						coord[k][1] = j;
					
						k++;
					}
				}
				
				if(count == 2){
					int l;
					for(l=0;l<3;l++){
						if(temp[l] == '-'){
							//put(coord[l][0],coord[l][1],'O');
							//return;
							return coord[l][0]*3 + coord[l][1];
						}
					}
				}
				//else{
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
			//}
			
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
			count = 0;
			for(j=0;j<3;j++){
				for(i=0;i<3;i++){
					if(grid.getBoard().get()[i][j] == (AIisX?'X':'O') ){
						count++;
					}
					else{
						temp[k]=grid.getBoard().get()[i][j];
						coord[k][0] = i;
						coord[k][1] = j;
					
						k++;
					}
				}
				if(count == 2){
					int l;
					for(l=0;l<3;l++){
						if(temp[l] == '-'){
							//put(coord[l][0],coord[l][1],'O');
							//return;
							return coord[l][0]*3 + coord[l][1];
						}
					}
				}
				//else{
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
				
			//}
			
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
			count = 0;
			for(i=0;i<3;i++){
				if(grid.getBoard().get()[i][i] == (AIisX?'X':'O')){
					count++;
				}
				else{
					temp[k] = grid.getBoard().get()[i][i];
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
						//put(coord[l][0],coord[l][1],'O');
						//return;
						return coord[l][0]*3 + coord[l][1];
					}
				}
			}
			//else{
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
			
		//}
			//diagonal2
			for(m=0;m<3;m++){
				for(n=3;n<2;n++){
					coord[m][n] = 0;
				}
			}
			for(m=0;m<3;m++){
				temp[m]=0;
			}
			k=0;
			count = 0;
				for(i=0,j=2;i<3 && j>=0;i++,j--){
					if(grid.getBoard().get()[i][j] == (AIisX?'X':'O')){
						count++;
					}
					else{
						temp[k]=grid.getBoard().get()[i][j];
						coord[k][0] = i;
						coord[k][1] = j;
					
						k++;
					}
				}
				if(count == 2){
					int l;
					for(l=0;l<3;l++){
						if(temp[l] == '-'){
							//put(coord[l][0],coord[l][1],'O');
							//return;
							return coord[l][0]*3 + coord[l][1];
						}
					}
				}
				//else{
					count=0;
					k = 0;
					//int d,e;
					for(d=0;d<3;d++){
						temp[d]=0;
					}
					for(d=0;d<3;d++){
						for(e=0;e<2;e++){
							coord[d][e]=0;
						}
					}
				
			//}
				
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
				count = 0;
				for(i=0;i<3;i++){
					for(j=0;j<3;j++){
						if(grid.getBoard().get()[i][j] == (AIisX?'O':'X')){
							count++;
						}
						else{
							temp[k]=grid.getBoard().get()[i][j];
							coord[k][0] = i;
							coord[k][1] = j;
						
							k++;
						}
					}
					if(count == 2){
						int l;
						for(l=0;l<3;l++){
							if(temp[l] == '-'){
								//put(coord[l][0],coord[l][1],'O');
								//return;
								return coord[l][0]*3 + coord[l][1];
							}
						}
					}
					//else{
						count=0;
						k = 0;
						//int d,e;
						for(d=0;d<3;d++){
							temp[d]=0;
						}
						for(d=0;d<3;d++){
							for(e=0;e<2;e++){
								coord[d][e]=0;
							}
						}
					
				//}
				
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
				count = 0;
				for(j=0;j<3;j++){
					for(i=0;i<3;i++){
						if(grid.getBoard().get()[i][j] == (AIisX?'O':'X')){
							count++;
						}
						else{
							temp[k]=grid.getBoard().get()[i][j];
							coord[k][0] = i;
							coord[k][1] = j;
						
							k++;
						}
					}
					if(count == 2){
						int l;
						for(l=0;l<3;l++){
							if(temp[l] == '-'){
								//put(coord[l][0],coord[l][1],'O');
								//return;
								return coord[l][0]*3 + coord[l][1];
							}
						}
					}
					//else{
						count=0;
						k = 0;
						//int d,e;
						for(d=0;d<3;d++){
							temp[d]=0;
						}
						for(d=0;d<3;d++){
							for(e=0;e<2;e++){
								coord[d][e]=0;
							}
						}
					
				//}
				
			}
				// diagonal1
				//count
				for(m=0;m<3;m++){
					for(n=0;n<2;n++){
						coord[m][n] = 0;
					}
				}
				for(m=0;m<3;m++){
					temp[m]=0;
				}
				k = 0;
				count = 0;
				for(i=0;i<3;i++){
					if(grid.getBoard().get()[i][i] == (AIisX?'O':'X')){
						count++;
					}
					else{
						temp[k] = grid.getBoard().get()[i][i];
						coord[k][0] = i;
						coord[k][1] = i;
						k++;
					}
				}
				
				if(count == 2){
					//System.out.println("");
					int l;
					for(l=0;l<3;l++){
						if(temp[l] == '-'){
							//put(coord[l][0],coord[l][1],'O');
							//return;
							return coord[l][0]*3 + coord[l][1];
						}
					}
				}
				//else{
					count=0;
					k = 0;
					//int d,e;
					for(d=0;d<3;d++){
						temp[d]=0;
					}
					for(d=0;d<3;d++){
						for(e=0;e<2;e++){
							coord[d][e]=0;
						}
					}
				
			//}
				//diagonal2
					//System.out.println("Diagonal2 opposition check");
				for(m=0;m<3;m++){
					for(n=0;n<2;n++){
						coord[m][n] = 0;
					}
				}
				for(m=0;m<3;m++){
					temp[m]=0;
				}
				k = 0;
				count=0;
					for(i=0,j=2;i<3 && j>=0;i++,j--){
						if(grid.getBoard().get()[i][j] == (AIisX?'O':'X')){
							count++;
						}
						else{
							temp[k]=grid.getBoard().get()[i][j];
							coord[k][0] = i;
							coord[k][1] = j;
						
							k++;
						}
					}
					if(count == 2){
						//System.out.println("Herereer");
						int l;
						for(l=0;l<3;l++){
							if(temp[l] == '-'){
								//put(coord[l][0],coord[l][1],'O');
								//return;
								//System.out.println("dfjdk" +coord[l][0]+":: "+coord[l][1]);
								
								return coord[l][0]*3 + coord[l][1];
							}
						}
					}
					//else{
						count=0;
						k = 0;
						//int d,e;
						for(d=0;d<3;d++){
							temp[d]=0;
						}
						for(d=0;d<3;d++){
							for(e=0;e<2;e++){
								coord[d][e]=0;
							}
						}
					
				//}
			Random Randomgenerator  = new Random();
			int x = Randomgenerator.nextInt(3);
			int y = Randomgenerator.nextInt(3);
			while(x<0 || x>2 || y<0 || y>2 || grid.getBoard().get()[x][y]!='-'){
				x=Randomgenerator.nextInt(3);
				y=Randomgenerator.nextInt(3);
			}	
			//grid.getBoard().get()[x][y]='O';
			return x*3+y;
		
	}
	
	public void gameOver(){
		if(grid.getBoard().checkState() == 1){
			out.setText(u1 + " wins!");
		}
		else if(grid.getBoard().checkState() == 2){
			out.setText(u2 +" wins");
		}
		else if(grid.getBoard().checkState() == 3){
			out.setText("Tie");
		}
		
		grid.colour();
		//System.out.println("Colored");
		if(mode==3 && timer!=null)
			timer.stop();
	}
	
	public void go(){
		frame.setVisible(true);
	}
	
	
}
