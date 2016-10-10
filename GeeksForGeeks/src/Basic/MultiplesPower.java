package Basic;

import java.util.Scanner;

public class MultiplesPower {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int n = scan.nextInt();
			long sum = 0;
			for(int i=0;i<n;i+=3){
				sum += i;
			}
			for(int j=0;j<n;j+=7){
				if(j%3==0);
				else{
					sum += j;
				}
			}
			System.out.println(sum);
		}
		scan.close();
	}
}
