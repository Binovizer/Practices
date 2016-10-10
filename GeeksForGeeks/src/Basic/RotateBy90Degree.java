package Basic;

import java.util.Scanner;

public class RotateBy90Degree {
	// With Extra Space
	private static int[][] rotate(int[][] mat){
		int des[][] =  new int[mat.length][mat[0].length];
		for(int r=0;r<mat.length;r++)
		{
		   for(int c=0;c<mat[0].length;c++)
		   {
		       des[mat.length-c-1][r] = mat[r][c];
		   }
		}
		return des;
	}
	private static int[][] rotate_without_extra_space(int[][] mat){
		int l = mat.length;
		for(int i=0;i<l/2;i++){
			for(int j=i;j<l-i-1;j++){
				int temp = mat[i][j];
				mat[i][j] = mat[j][l-i-1];
				mat[j][l-i-1] = mat[l-i-1][l-j-1];
				mat[l-i-1][l-j-1] = mat[l-j-1][i];
				mat[l-j-1][i] = temp;
			}
		}
		return mat;
	}
	private static void display(int[][] mat){
		System.out.println();
		for(int i=0;i<mat.length;i++){
			for(int j=0;j<mat[0].length;j++){
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int n = scan.nextInt();
			int[][] mat = new int[n][n];
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					mat[i][j] = scan.nextInt();
				}
			}
			rotate_without_extra_space(mat);
			display(mat);
			System.out.println();
		}
		scan.close();
	}
}
