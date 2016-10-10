package Basic;

import java.util.Scanner;

/**
 * @author Mohd Nadeem(mohd.nadeem3464@gmail.com)
 *
 */
public class nthFibNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int n = scan.nextInt();
			long a = 0,b = 1;
			long fib = 0;
			if(n==1){
				fib = 0;
			}
			else if(n==2){
				fib = 1;
			}
			else{
				for(int i=3;i<=n;i++){
					fib = (a + b)%1000000007;
					a = b;
					b = fib;
				}
			}
			System.out.println(fib);
		}
		scan.close();
	}

}
