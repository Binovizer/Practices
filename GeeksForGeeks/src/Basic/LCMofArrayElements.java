package Basic;

import java.util.Scanner;

public class LCMofArrayElements {
	private static int gcd(int a,int b){
		if(b==0){
			return a;
		}
		return gcd(b, a%b);
	}
	public static int lcm(int a[],int n){
		int ans = a[0];
		for(int i=1;i<n;i++){
			ans = (a[i]*ans)/(gcd(a[i], ans));
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int n = scan.nextInt();
			int a[] = new int[n];
			for(int i=0;i<n;i++){
				a[i] = scan.nextInt();
			}
			System.out.println(lcm(a,n));
		}
		scan.close();
	}
}
