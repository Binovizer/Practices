package Basic;

import java.util.Scanner;

/**
 * @author Mohd Nadeem(mohd.nadeem3464@gmail.com)
 *
 */
public class ReverseSubArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int n = scan.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++){
				arr[i] = scan.nextInt();
			}
			int l = scan.nextInt();
			int r = scan.nextInt();
			int i = l-1;
			int j = r-1;
			while(i<j){
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
			for(int k=0;k<n;k++){
				System.out.print(arr[k]+" ");
			}
			System.out.println();
		}
		scan.close();
	}
}
