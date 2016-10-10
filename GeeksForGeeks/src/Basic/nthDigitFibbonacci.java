package Basic;

import java.util.Scanner;

/**
 * @author Mohd Nadeem(mohd.nadeem3464@gmail.com)
 *
 */
public class nthDigitFibbonacci {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		StringBuilder sb = new StringBuilder();
		int a = 1,b = 1;
		sb.append(a);
		sb.append(b);
		while(sb.length()<=100){
			sb.append(a+b);
			int temp  = b;
			b = a+b;
			a = temp;
		}
		while(t-->0){
			int n =  scan.nextInt();
			System.out.println(sb.charAt(n-1));
		}
		scan.close();
	}

}
