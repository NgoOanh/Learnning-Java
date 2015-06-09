import java.util.Scanner;


public class bai14 {

	private static Scanner s;

	/**
	 * @param args
	 */
	public static void nhap(int[][] array, int m, int n){
		System.out.println("Enter the elements matrix");
	    for (int i = 0; i < m; i++) {
	    	for (int j = 0; j < n; j++) {
	    		array[i][j] = s.nextInt();
	        }
	    }
	}
	public static void xuat(int[][] array, int m, int n){
	    for (int i = 0; i < m; i++) {
	    	for (int j = 0; j < n; j++) {
	    		System.out.print(array[i][j] + "\t");
	        }
	    	System.out.print("\n");
	    }
	}
	public static void main(String[] args) {
		int rows;
		int cols;
		s = new Scanner(System.in);
		System.out.print("Enten number of row: ");
		rows = s.nextInt();
		System.out.print("Enter number of column: ");
		cols = s.nextInt();
		int a[][] = new int[rows][cols];
		int b[][] = new int[rows][cols];
		int sum[][] = new int[rows][cols];
		int sub[][] = new int[rows][cols];
		nhap(a, rows, cols);
		nhap(b, rows, cols);
	    for (int i = 0; i < rows; i++) {
	    	for (int j = 0; j < cols; j++) {
	    		sum[i][j] = a[i][j] + b[i][j];
	        }
	    }
	    for (int i = 0; i < rows; i++) {
	    	for (int j = 0; j < cols; j++) {
	    		sub[i][j] = a[i][j] - b[i][j];
	        }
	    }
		System.out.print("Sum of two matrixs:\n");
		xuat(sum, rows, cols);
		System.out.print("\nSubtract of two matrixs:\n");
		xuat(sub, rows, cols);
	}

}
