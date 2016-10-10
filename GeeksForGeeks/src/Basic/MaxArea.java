package Basic;

import java.util.Scanner;

public class MaxArea {
	public static double sqrt(int number) {
		double t;
	 
		double squareRoot = number / 2;
	 
		do {
			t = squareRoot;
			squareRoot = (t + (number / t)) / 2;
		} while ((t - squareRoot) != 0);
	 
		return squareRoot;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			double n = scan.nextDouble();
			int h = (int) Math.floor(2*Math.sqrt(n));
			System.out.println(h);
		}
		scan.close();
	}
}
