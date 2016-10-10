package Basic;

import java.util.Scanner;

public class SurpasserCount {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int l = scan.nextInt();
			int arr[] = new int[l];
			for(int i=0;i<l;i++){
				arr[i] = scan.nextInt();
			}
			for(int i=0;i<l;i++){
				int count = 0;
				for(int j=i;j<l;j++){
					if(arr[j]>arr[i]){
						count++;
					}
				}
				System.out.print(count+" ");
			}
			System.out.println();
		}
		scan.close();
	}
}
