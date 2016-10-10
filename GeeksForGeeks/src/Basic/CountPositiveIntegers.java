package Basic;

import java.util.Scanner;

/**
 * @author Mohd Nadeem(mohd.nadeem3464@gmail.com)
 *
 */
public class CountPositiveIntegers {
	static long findCountUpto(int d)
	{
	    // Sum of two GP series
	    long GP1_Sum = 9*(((long)Math.pow(10,d)-1)/9);
	    long GP2_Sum = 9*(((long)Math.pow(9,d)-1)/8);
	 
	    return GP1_Sum - GP2_Sum;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int d = scan.nextInt();
			System.out.println(findCountUpto(d));
		}
		scan.close();
	}
}
