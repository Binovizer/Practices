package Basic;

import java.util.Arrays;
import java.util.Scanner;

public class AndGate {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int l = scan.nextInt();
			int arr[] =  new int[l];
			for(int i=0;i<l;i++){
				arr[i] = scan.nextInt();
			}
			Arrays.sort(arr);
			
			if(arr[0]==0){
				System.out.println("0");
			}else{
				System.out.println("1");
			}
		}
		scan.close();
	}
}
