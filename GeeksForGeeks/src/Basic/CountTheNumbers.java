package Basic;

import java.util.Scanner;

/**
 * @author Mohd Nadeem(mohd.nadeem3464@gmail.com)
 *
 */
public class CountTheNumbers {
	private static int countNumbers(int n){
		int count = 0;
		for(int i=1;i<=n;i++){
			boolean flag = true;
			int temp = i;
			while(temp>0){
				int digit = temp%10;
				if(digit>5||digit==0){
					flag = false;
					break;
				}
				temp /= 10;
			}
			if(flag){
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int n = scan.nextInt();
			System.out.println(countNumbers(n));
		}
		scan.close();
	}
}
