package Basic;

import java.util.Arrays;
import java.util.Scanner;

public class MissingRangeOfNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			StringBuilder sb = new StringBuilder("[ ");
			int n = scan.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++){
				arr[i] = scan.nextInt();
			}
			Arrays.sort(arr);
			
		}
	}
}
