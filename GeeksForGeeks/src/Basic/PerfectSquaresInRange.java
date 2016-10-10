package Basic;

import java.util.Scanner;

/**
 * @author Mohd Nadeem(mohd.nadeem3464@gmail.com)
 *
 */
public class PerfectSquaresInRange {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int a = scan.nextInt();
			int b = scan.nextInt();
			double count = Math.floor(Math.sqrt(b))- Math.ceil(Math.sqrt(a))+1;
			System.out.println((int)count);
		}
		scan.close();
	}
}
