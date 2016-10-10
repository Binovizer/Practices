package Basic;

import java.util.Scanner;

/**
 * @author Mohd Nadeem(mohd.nadeem3464@gmail.com)
 *
 */
public class RepeatedSumOfDigits {
	int digSum(int n)
	{
	    return (n % 9 == 0) ? 9 : (n % 9);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int n = scan.nextInt();
			int sum;
			int temp = n;
			do{
				sum = 0;
				while(temp>0){
					int digit = temp % 10;
					sum += digit; 
					temp = temp / 10;
				}
				temp = sum;
			}while(sum>=10);
			System.out.println(sum);
		}
		scan.close();
	}
}
