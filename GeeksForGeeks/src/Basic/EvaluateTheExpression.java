package Basic;

import java.util.Scanner;

/**
 * @author Mohd Nadeem(mohd.nadeem3464@gmail.com)
 *
 */
public class EvaluateTheExpression {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		scan.nextLine();
		while(t-->0){
			String str = scan.nextLine();
			String s[] = str.split("[+,=]");
			int i = Integer.parseInt(s[1].trim());
			int j = Integer.parseInt(s[2].trim());
			System.out.println(j-i);
		}
		scan.close();
	}
}
