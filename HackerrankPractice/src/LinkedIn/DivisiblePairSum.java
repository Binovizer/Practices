package LinkedIn;

import java.util.Scanner;

/**
 * @author Mohd Nadeem(mohd.nadeem3464@gmail.com)
 *
 */
public class DivisiblePairSum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = scan.nextInt();
		}
		int count = 0;
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				if((arr[i]+arr[j])%k==0){
					count++;
				}
			}
		}
		System.out.println(count);
		scan.close();
	}
}
