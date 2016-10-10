package Basic;

import java.util.Scanner;

/**
 * @author Mohd Nadeem(mohd.nadeem3464@gmail.com)
 *
 */
public class RemoveCharacter {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		scan.nextLine();
		while(t-->0){
			String fstr = scan.nextLine();
			String lstr = scan.nextLine();
			for(char c : lstr.toCharArray()){
				if(fstr.contains(c+"")){
					fstr = fstr.replaceAll(c+"", "");
				}
			}
			System.out.println(fstr);
		}
		scan.close();
	}
}
