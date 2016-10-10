package Basic;

import java.util.Scanner;

public class GenerateBinaryNumbers {
	private static void generateBinNumbers(int n){
		for(int i=1;i<=n;i++){
			System.out.print(Integer.toBinaryString(i)+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int n = scan.nextInt();
			generateBinNumbers(n);
		}
		scan.close();
	}
}
