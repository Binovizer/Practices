package Basic;

import java.util.Arrays;
import java.util.Scanner;

public class MinSum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int n = scan.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++){
				arr[i] = scan.nextInt();
			}
			Arrays.sort(arr);
			StringBuilder sb1 = new StringBuilder();
			StringBuilder sb2 = new StringBuilder();
			for(int i=0;i<n;i++){
				if(i%2==0){
					sb1.append(arr[i]);
				}else{
					sb2.append(arr[i]);
				}
			}
			long sum = 0;
			if(!sb1.toString().trim().equals("") && !sb1.toString().trim().equals("")){
				sum = Long.parseLong(sb1.toString().trim()) + Long.parseLong(sb2.toString().trim());
			}else if(sb1.toString().trim().equals("")){
				sum = Long.parseLong(sb2.toString().trim());
			}else if(sb2.toString().trim().equals("")){
				sum = Long.parseLong(sb1.toString().trim());
			}
			System.out.println(sum);
		}
		scan.close();
	}
}
