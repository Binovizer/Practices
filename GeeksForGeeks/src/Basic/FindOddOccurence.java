package Basic;

import java.util.Scanner;

/**
 * @author Mohd Nadeem(mohd.nadeem3464@gmail.com)
 *
 */
public class FindOddOccurence {
	private static int findOdd(int arr[]){
		int odd = arr[0];
		for(int i=1;i<arr.length;i++){
			odd = odd ^ arr[i];
		}
		return odd;
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
			System.out.println(findOdd(arr));
		}
		scan.close();
	}
}
