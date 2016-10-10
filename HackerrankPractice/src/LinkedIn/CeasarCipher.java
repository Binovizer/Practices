package LinkedIn;

import java.util.Scanner;

/**
 * @author Mohd Nadeem(mohd.nadeem3464@gmail.com)
 *
 */
public class CeasarCipher {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.nextInt();
		scan.nextLine();
		String str = scan.nextLine();
		int k = scan.nextInt();
		StringBuilder sb = new StringBuilder();
		for(char c : str.toCharArray()){
			int ch = c;
			if(ch>64 && ch<91){
				int temp = ch - 65;
				temp = (temp+k)%26;
				sb.append((char)(temp+65));
			}
			else if(ch>96 && ch<123){
				int temp = ch - 97;
				temp = (temp+k)%26;
				sb.append((char)(temp+97));
			}else{
				sb.append(c);
			}
		}
		System.out.println(sb.toString());
		scan.close();
	}
}
