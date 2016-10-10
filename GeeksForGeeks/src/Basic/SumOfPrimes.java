package Basic;

import java.util.Scanner;

public class SumOfPrimes {
	public static boolean isPrime(int n){
		if(n==1){
			return false;
		}else{
			for(int i=2;i<=n/2;i++){
				if(n%i==0){
					return false;
				}
			}
		}
		return true;
	}
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
				if(isPrime(digit)){
					sum += digit;
				}
			}
			System.out.println(sum);
		}
		scan.close();
	}
}
