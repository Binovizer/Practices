package Basic;

import java.util.Scanner;

/**
 * @author Mohd Nadeem(mohd.nadeem3464@gmail.com)
 *
 */
public class FindPositionOfSetBits {
	private static boolean isPowerOfTwo(int n){
		if(n==0){
			return false;
		}else{
			return (n&(n-1))==0;
		}
	}
	private static int findPosition(int n){
		if(!isPowerOfTwo(n)){
			return -1;
		}
		int i=1,index=1;
		while((n&i)==0){
			i = i << 1;
			++index;
		}
		return index;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int n = scan.nextInt();
			//System.out.println(findPosition(n));
			double d = Math.log(n)/Math.log(2);
			int i = (int) d;
			if(i==d){
				System.out.println(i+1);
			}else{
				System.out.println(-1);
			}
			
		}
		scan.close();
	}
}
