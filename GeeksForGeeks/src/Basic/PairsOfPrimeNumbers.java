package Basic;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Mohd Nadeem(mohd.nadeem3464@gmail.com)
 *
 */
public class PairsOfPrimeNumbers {
	private static ArrayList<Integer> primes;
	
	private static void printPairs(int n){
		for(int i=0;i<primes.size();i++){
			for(int j=0;j<primes.size();j++){
				if(primes.get(i) * primes.get(j)<=n){
					System.out.print(primes.get(i)+" "+primes.get(j)+" ");
				}
			}
		}
		System.out.println();
	}
	private static boolean isPrime(int n){
		if(n<1){
			return false;
		}
		for(int i=2;i<=n/2;i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int n = scan.nextInt();
			primes = new ArrayList<>();
			for(int i=2;i<=n/2;i++){
				if(isPrime(i)){
					primes.add(i);
				}
			}
			printPairs(n);
		}
		scan.close();
	}
}
