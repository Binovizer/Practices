package Basic;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Mohd Nadeem(mohd.nadeem3464@gmail.com)
 *
 */
public class FindMinDifference {
	private static int findMinDif(int arr[]){
		Arrays.sort(arr);
		int diff = Integer.MAX_VALUE;
		for(int i=0;i<arr.length-1;i++){
			if(arr[i+1]-arr[i] < diff){
				diff = arr[i+1]-arr[i];
			}
		}
		return diff;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int n = scan.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++){
				arr[i] = scan.nextInt();
			}
			System.out.println(findMinDif(arr));
		}
		scan.close();
	}
}
