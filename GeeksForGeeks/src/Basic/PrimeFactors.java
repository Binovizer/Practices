package Basic;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * @author Mohd Nadeem(mohd.nadeem3464@gmail.com)
 *
 */
public class PrimeFactors {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int n = scan.nextInt();
			TreeSet<Integer> factors =  new TreeSet<>();
			while(n%2==0){
				factors.add(2);
				n /= 2;
			}
			for(int i=3;i<=Math.sqrt(n);i+=2){
				while(n%i==0){
					factors.add(i);
					n /= i;
				}
			}
			if(n>2){
				factors.add(n);
			}
			for(int i : factors){
				System.out.print(i+" ");
			}
			System.out.println();
		}
		scan.close();
	}
}
