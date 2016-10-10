package Basic;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Mohd Nadeem(mohd.nadeem3464@gmail.com)
 *
 */
public class kLargestElements {
	private static void printNumbers(int arr[],int k){
		Arrays.sort(arr);
		for(int i=arr.length-1;i>arr.length-k-1;i--){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int n =  scan.nextInt();
			int k =  scan.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++){
				arr[i] = scan.nextInt();
			}
			printNumbers(arr,k);
		}
		scan.close();
	}
}
