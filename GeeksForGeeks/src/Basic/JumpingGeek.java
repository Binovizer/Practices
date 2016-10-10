package Basic;

import java.util.Scanner;

/**
 * @author Mohd Nadeem(mohd.nadeem3464@gmail.com)
 *
 */
public class JumpingGeek {
	private static String yesOrNo(int n){
		if(n==0||n==1){
			return "yes";
		}
		if(n%6==0||n%3==0||n%6==1){
			return "yes";
		}
		return "no";
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int n = scan.nextInt();
			System.out.println(yesOrNo(n));
		}
		scan.close();
	}

}
