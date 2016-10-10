package Basic;

import java.util.Scanner;

/**
 * @author Mohd Nadeem(mohd.nadeem3464@gmail.com)
 *
 */
public class PallindromicSubsequence {
	private static int findSequences(String str){
		StringBuilder sb = new StringBuilder(str);
		if(sb.reverse().toString().equals(str)){
			return 1;
		}else{
			return 2;
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			scan.nextInt();
			scan.nextLine();
			String str = scan.nextLine();
			System.out.println(findSequences(str));
		}
		scan.close();
	}
}
