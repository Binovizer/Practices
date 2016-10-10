package Basic;

import java.util.Scanner;

/**
 * @author Mohd Nadeem(mohd.nadeem3464@gmail.com)
 *
 */
public class BitDifference {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int a = scan.nextInt();
			int b = scan.nextInt();
			/*StringBuilder sb1 = new StringBuilder(Integer.toBinaryString(a));
			StringBuilder sb2 = new StringBuilder(Integer.toBinaryString(b));
			if(sb1.length()>sb2.length()){
				int temp = sb1.length()-sb2.length();
				for(int i=0;i<temp;i++){
					sb2.insert(0,'0');
				}
			}else{
				int temp = sb2.length() - sb1.length();
				for(int i=0;i<temp;i++){
					sb1.insert(0,'0');
				}
			}
			int count = 0;
			for(int i=0;i<sb1.length();i++){
				if(sb1.charAt(i)!=sb2.charAt(i)){
					count++;
				}
			}*/
			int x = a ^ b;
			int count = SetBits.countSetBits(x);
			System.out.println(count);
		}
		scan.close();
	}
}
