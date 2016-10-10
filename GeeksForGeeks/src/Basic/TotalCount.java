package Basic;

import java.util.Scanner;

public class TotalCount {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){ //test Cases
			int l = scan.nextInt();
			int arr[] = new int[l];
			int k = scan.nextInt();
			for(int i=0;i<l;i++){
				arr[i] = scan.nextInt(); //Storing arrays elements
			}
			int count = 0;
			for(int i=0;i<l;i++){ //Traversing Array Elements
				int temp = arr[i]/k; // No of times k required
				if(arr[i]%k==0){
					count += temp;
				}else{
					count += (temp+1); // +1 for the remainder part
				}
			}
			System.out.println(count);
		}
		scan.close();
	}
}
