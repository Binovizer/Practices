package Basic;

import java.util.Scanner;

public class HelpTheOldMan {
	private static int count = 0;
	private static void toh(int n,int s,int d,int a){
		if(n==1){
			if(--count==0){
				System.out.println(s+" "+d);
			}
			return;
		}
		toh(n-1, s, a, d);
		if(--count==0){
			System.out.println(s+" "+d);
			return;
		}
		toh(n-1, a, d, s);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int n = scan.nextInt();
			count = scan.nextInt();
			toh(n, 1,3,2);
		}
		scan.close();
	}
}
