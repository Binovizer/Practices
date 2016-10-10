package Basic;

import java.util.Scanner;

public class MatchStickGame {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t= scan.nextInt();
		while(t-->0){
			int n = scan.nextInt();
			if(n%5==0){
				System.out.println("-1");
			}else{
				System.out.println(n%5);
			}
		}
		scan.close();
	}
}
