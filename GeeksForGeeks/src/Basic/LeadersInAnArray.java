package Basic;

import java.util.Scanner;

/**
 * @author Mohd Nadeem(mohd.nadeem3464@gmail.com)
 *
 */
public class LeadersInAnArray {
	private static void printLeaders(int arr[]){
		StringBuilder sb = new StringBuilder();
		int max = arr[arr.length-1];
		sb.insert(0, max+" ");
		for(int i=arr.length-2;i>=0;i--){
			if(max < arr[i]){
				max = arr[i];
				sb.insert(0, max+" ");
			}
		}
		System.out.print(sb.toString());
		System.out.println();
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
			printLeaders(arr);
		}
		scan.close();
	}
}
