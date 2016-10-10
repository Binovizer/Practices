package Basic;

import java.util.Scanner;

public class SumOfDigitsMultiple {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t =scan.nextInt();
		while(t-->0){
			int n = scan.nextInt();
			int temp = n;
			int sum = 0;
			while(temp>0){
				int digit = temp%10;
				temp = temp/10;
				sum += digit;
			}
			if(n%sum==0){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}
		scan.close();
	}
}
