package tr.org.linux.kamp.array;

//sout kısaltılmış -->  System.out.println();
public class BoardWalker {
	
	public static void main(String[] args) {
		
		int[][] board=new int[4][3];
		
		int counter=0;
		
		for(int k=0;k<board.length;k++) {
			for(int j=0;j<board[k].length;j++) {
				board[k][j]=counter;
				counter++;
			}
		}
		for(int j=0;j<board.length;j++) {
			for(int k=0;k<board[j].length;k++) {
				System.out.print(board[j][k]+" ");
				counter++;
			}
			System.out.println();
		}
	}
}
