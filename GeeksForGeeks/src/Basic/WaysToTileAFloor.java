package Basic;

import java.util.Scanner;

public class WaysToTileAFloor {
	private static long fib(int n){
		long fib1 = 0;
		long fib2 = 1;
		long fib = 0;
		for(int i=0;i<n;i++){
			fib = fib1 + fib2;
			fib1 = fib2;
			fib2 = fib;
		}
		return fib;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int n = scan.nextInt();
			System.out.println(fib(n));
		}
		scan.close();
	}
}
