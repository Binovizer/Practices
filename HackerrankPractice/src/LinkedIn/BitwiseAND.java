package LinkedIn;

import java.util.Scanner;

/**
 * @author Mohd Nadeem(mohd.nadeem3464@gmail.com)
 *
 */
public class BitwiseAND {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int n = scan.nextInt();
			int k = scan.nextInt();
			int set[] = new int[n];
			for(int i=0;i<n;i++){
				set[i] = i+1;
			}
			int max = Integer.MIN_VALUE;
			for(int i=0;i<n-1;i++){
				for(int j=i+1;j<n;j++){
					int x = set[i] & set[j];
					if( x > max && x < k){
						max = x;
					}
				}
			}
			System.out.println(max);
		}
		scan.close();
	}
}
