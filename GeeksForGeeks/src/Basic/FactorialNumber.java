package Basic;

import java.util.Scanner;

/**
 * @author Mohd Nadeem(mohd.nadeem3464@gmail.com)
 *
 */
public class FactorialNumber {
	private static int checkFactorial(int n){
		int flag = 0;
		int fact = 1;
		int i = 1;
		while(true){
			fact = fact * i++;
			if(fact==n){
				flag = 1;
				break;
			}
			if(fact>n){
				break;
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int n = scan.nextInt();
			System.out.println(checkFactorial(n));
		}
		scan.close();
	}
}
