package Basic;

import java.util.Arrays;
import java.util.Scanner;

public class MegaSale {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int l = scan.nextInt();
			int m = scan.nextInt();
			int arr[] = new int[l];
			for(int i=0;i<l;i++){
				arr[i] = scan.nextInt();
			}
			Arrays.sort(arr);
			int sum = 0;
			for(int i=0;i<m;i++){
				if(arr[i]<=0){
					sum-=arr[i];
				}
			}
			sum = (sum>0)?sum:-sum;
			System.out.println(sum);
		}
		scan.close();
	}
}
