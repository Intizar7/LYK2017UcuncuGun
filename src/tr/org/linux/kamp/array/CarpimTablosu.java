package tr.org.linux.kamp.array;

public class CarpimTablosu {
	
	public static int[][] initialize(int n, int m){
		int[][] matrices = new int[n][m];
		
		for(int j=0; j<matrices.length; j++) {
			for(int k = 0; k<matrices[j].length; k++) {
				matrices[j][k] = (j+1)*(k+1);
				System.out.print(matrices[j][k] + "\t");

			}
			System.out.println();

		}
		
		return matrices;
	}
	
	public static void arrayToPrint(int[][] matrices) {
		for(int j=0; j<matrices.length; j++) {
			for(int k=0; k<matrices[j].length; k++) {
			}
		}
	}
	public static void main(String[] args) {
		arrayToPrint(initialize(5,6));
	}
}