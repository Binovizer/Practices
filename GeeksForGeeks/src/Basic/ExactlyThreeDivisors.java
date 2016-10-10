package Basic;

import java.util.Scanner;

// Only Square of Prime Numbers are answers
public class ExactlyThreeDivisors {
	private static boolean isPrime(int n){
		if(n==1){
			return false;
		}
		for(int i=2;i<=n/2;i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int count = 0;
			int n = scan.nextInt();
			for(int i=2;i<=Math.sqrt(n);i++){
				if(isPrime(i)&& Math.pow(i, 2)<=n){
					count++;
				}
			}
			System.out.println(count);
		}
		scan.close();
	}
	
	
	/*private static boolean hasThreeDivisors(int x){
		int count = 0;
		for(int i=2;i<=x/2;i++){
			if(x%i==0){
				count++;
			}
			if(count+2>3){
				return false;
			}
		}
		if(count+2==3){
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int count = 0;
			int n = scan.nextInt();
			for(int i=1;i<=n;i++){
				if(hasThreeDivisors(i)){
					count++;
				}
			}
			System.out.println(count);
		}
		scan.close();
	}*/
}
