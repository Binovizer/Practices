package Basic;

import java.util.Scanner;

/**
 * @author Mohd Nadeem(mohd.nadeem3464@gmail.com)
 *
 */
public class RemoveRecurringDigits {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		scan.nextLine();
		while(t-->0){
			String str = scan.nextLine();
			StringBuilder sb = new StringBuilder();
			char pre = str.charAt(0);
			sb.append(pre);
			for(int i=1;i<str.length();i++){
				if(str.charAt(i)==pre);
				else{
					sb.append(str.charAt(i));
					pre = str.charAt(i);
				}
			}
			System.out.println(sb.toString());
		}
		scan.close();
	}
}
