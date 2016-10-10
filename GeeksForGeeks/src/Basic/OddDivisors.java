package Basic;

import java.util.Scanner;

/**
 * @author Mohd Nadeem(mohd.nadeem3464@gmail.com)
 *
 */
public class OddDivisors {
	private static boolean perfectSquare(int n){
		double sqrt = Math.sqrt(n);
		int s = (int) sqrt;
		return Math.pow(sqrt, 2)==Math.pow(s, 2);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int n = scan.nextInt();
			int count = 0;
			for(int i=1;i<=n;i++){
				if(perfectSquare(i)){
					count++;
				}
			}
			System.out.println(count);
		}
		scan.close();
	}
}
