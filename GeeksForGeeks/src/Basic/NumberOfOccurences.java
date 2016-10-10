package Basic;

import java.util.Scanner;

/**
 * @author Mohd Nadeem(mohd.nadeem3464@gmail.com)
 *
 */
public class NumberOfOccurences {
	private static int countOccurences(int arr[],int k){
		int count = 0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==k){
				count++;
			}
		}
		if(count==0){
			return -1;
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int n = scan.nextInt();
			int k = scan.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++){
				arr[i] = scan.nextInt();
			}
			System.out.println(countOccurences(arr,k));
		}
		scan.close();
	}
}
