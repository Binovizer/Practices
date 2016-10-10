package LinkedIn;

import java.util.Scanner;

/**
 * @author Mohd Nadeem(mohd.nadeem3464@gmail.com)
 *
 */
public class Consecutive1s {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String str =  Integer.toBinaryString(n);
		int max = Integer.MIN_VALUE;
		for(int i=0;i<str.length();){
			if(str.charAt(i)=='1'){
				int count = 0;
				while(i < str.length() && str.charAt(i)=='1'){
					count++;
					i++;
				}
				if(max<count){
					max = count;
				}
			}
			i++;
		}
		System.out.println(max);
		scan.close();
	}

}
