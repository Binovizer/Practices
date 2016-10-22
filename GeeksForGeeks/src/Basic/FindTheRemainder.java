package Basic;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Mohd Nadeem(mohd.nadeem3464@gmail.com)
 *
 */
public class FindTheRemainder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		scan.nextLine();
		while(t-->0){
			int d = 7;
			String str = scan.nextLine();
			int arr[] = new int[str.length()];
			arr[0] = 1;
			for(int i=1;i<str.length();i++){
				arr[i] = (arr[i-1]*10) % d;
			}
			int rem = 0;
			for(int i = str.length()-1;i>=0;i--){
				rem = ( rem + Integer.parseInt(str.charAt(i)+"") * arr[str.length()-i-1] ) % d;
			}
			System.out.println(rem);
		}
		scan.close();

	}

}
