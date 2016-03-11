import javax.swing.JOptionPane;

public class Battleship 
{
    static space[][] board = new space[11][11];
	
	public static void printboard()
	{
		for(int x=0; x<board.length; x++)
		{
			for(int y=0; y<board[x].length; y++)
			{
				System.out.print(" "+board[x][y]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
    
    public static void initialize()
	{
		for(int x=0; x<board.length; x++)
		{
			for(int y=0; y<board[x].length; y++)
			{
				board[x][y] = new space();
			}
		}
		
		/*for(int x=0; x==0; x++)
		{
			for(int y=1; y<board[x].length; y++)
			{
				board[x][y] = new space();
			}
		}*/
	}
	
	public static void setup()
	{
		// 1 length 5
		// 4 length 3
		// 2 length 4
		
		board[1][1].ship();
				board[2][1].ship();
						board[3][1].ship();
								board[4][1].ship();
										board[5][1].ship();
		
		board[7][5].ship();
				board[7][6].ship();
						board[7][7].ship();
								board[7][8].ship();		
		board[6][2].ship();
				board[7][2].ship();
						board[8][2].ship();
								board[9][2].ship();
								
		board[1][6].ship();
				board[2][6].ship();
						board[3][6].ship();
		board[10][8].ship();
				board[10][9].ship();
						board[10][10].ship();
		board[4][2].ship();
				board[3][3].ship();
						board[2][4].ship();
		board[4][8].ship();
				board[4][9].ship();
						board[4][10].ship();
										
		board[0][0].number((char)48);
		board[1][0].number((char)49);
		board[2][0].number((char)50);
		board[3][0].number((char)51);
		board[4][0].number((char)52);
		board[5][0].number((char)53);
		board[6][0].number((char)54);
		board[7][0].number((char)55);
		board[8][0].number((char)56);
		board[9][0].number((char)57);
		board[10][0].number('X');
		
		board[0][1].number((char)49);
		board[0][2].number((char)50);
		board[0][3].number((char)51);
		board[0][4].number((char)52);
		board[0][5].number((char)53);
		board[0][6].number((char)54);
		board[0][7].number((char)55);
		board[0][8].number((char)56);
		board[0][9].number((char)57);
		board[0][10].number('X');
		
		printboard();
	}
	
	public static String play()
	{
		JOptionPane.showMessageDialog( null, "Welcome to Battleship!\nHow to Play - Choose the coordinates you want to hit with a torpedo.\n(Hints: Rows then Columns.  Capitol X is 10)\nDon't get too excited, because you have a limited number of shots.\nMost of All: Enjoy!");	
		JOptionPane.showMessageDialog( null, (char)215 + " Is a Hit.\n" + (char)79 +" Is a Miss.\n" + (char)126 + " Is Water.\n" + (char)167 + " Is a Sunken Ship.");	
		
		int shots = 47;
		do
		{
			
			int x = Integer.parseInt ( JOptionPane.showInputDialog("Pick a Row"));
			int y = Integer.parseInt ( JOptionPane.showInputDialog("Pick a Column"));
			
			board[x][y].shot();
			shots--;
			
			printboard();
			
			if(win()==true)
			{
				return "You Win!";
			}
			
			printboard();
			System.out.println("Shots Left: "+shots);
		}
		while(shots != 0);
		
		return "You Lose...";
		
	}
	
	public static boolean win()
	{
		int temp = 0;
		
		if(board[1][1].getCondition()==215 && board[2][1].getCondition()==215 && board[3][1].getCondition()==215 && board[4][1].getCondition()==215 && board[5][1].getCondition()==215)
		{
			board[1][1].sunk();
			board[2][1].sunk();
			board[3][1].sunk();
			board[4][1].sunk();
			board[5][1].sunk();
			JOptionPane.showMessageDialog( null, "You Sunk a Ship!");
		}
		
		if(board[1][1].getCondition()==167 && board[2][1].getCondition()==167 && board[3][1].getCondition()==167 && board[4][1].getCondition()==167 && board[5][1].getCondition()==167)
		{
			temp++;
		}
		
		if(board[7][5].getCondition()==215 && board[7][6].getCondition()==215 && board[7][7].getCondition()==215 && board[7][8].getCondition()==215)
		{
			JOptionPane.showMessageDialog( null, "You Sunk a Ship!");
			board[7][5].sunk();
			board[7][6].sunk();
			board[7][7].sunk();
			board[7][8].sunk();
		}
		
		if(board[7][5].getCondition()==167 && board[7][6].getCondition()==167 && board[7][7].getCondition()==167 && board[7][8].getCondition()==167)
		{
			temp++;
		}
		
		if(board[6][2].getCondition()==215 && board[7][2].getCondition()==215 && board[8][2].getCondition()==215 && board[9][2].getCondition()==215)
		{
			JOptionPane.showMessageDialog( null, "You Sunk a Ship!");
			board[6][2].sunk();
			board[7][2].sunk();
			board[8][2].sunk();
			board[9][2].sunk();
		}
		
		if(board[6][2].getCondition()==167 && board[7][2].getCondition()==167 && board[8][2].getCondition()==167 && board[9][2].getCondition()==167)
		{
			temp++;
		}
		
		if(board[1][6].getCondition()==215 && board[2][6].getCondition()==215 && board[3][6].getCondition()==215)
		{
			JOptionPane.showMessageDialog( null, "You Sunk a Ship!");
			board[1][6].sunk();
			board[2][6].sunk();
			board[3][6].sunk();
		}
		
		if(board[1][6].getCondition()==167 && board[2][6].getCondition()==167 && board[3][6].getCondition()==167)
		{
			temp++;
		}
		
		if(board[4][8].getCondition()==215 && board[4][9].getCondition()==215 && board[4][10].getCondition()==215)
		{
			JOptionPane.showMessageDialog( null, "You Sunk a Ship!");
			board[4][8].sunk();
			board[4][9].sunk();
			board[4][10].sunk();
		}
		
		if(board[4][8].getCondition()==167 && board[4][9].getCondition()==167 && board[4][10].getCondition()==167)
		{
			temp++;
		}
		
		if(board[4][2].getCondition()==215 && board[3][3].getCondition()==215 && board[2][4].getCondition()==215)
		{
			JOptionPane.showMessageDialog( null, "You Sunk a Ship!");
			board[4][2].sunk();
			board[3][3].sunk();
			board[2][4].sunk();
		}
		
		if(board[4][2].getCondition()==167 && board[3][3].getCondition()==167 && board[2][4].getCondition()==167)
		{
			temp++;
		}
		
		if(board[10][8].getCondition()==215 && board[10][9].getCondition()==215 && board[10][10].getCondition()==215)
		{
			JOptionPane.showMessageDialog( null, "You Sunk a Ship!");
			board[10][8].sunk();
			board[10][9].sunk();
			board[10][10].sunk();
		}
		
		if(board[10][8].getCondition()==167 && board[10][9].getCondition()==167 && board[10][10].getCondition()==167)
		{
			temp++;
		}
		
		System.out.println("Ships Sunk: "+temp);
		
		if(temp == 7)
			return true;
		else
			return false;
		
		
	}
	
	public static void main(String[] args) 
	{
		initialize();
		setup();
		
		System.out.println(play());

	}

}
