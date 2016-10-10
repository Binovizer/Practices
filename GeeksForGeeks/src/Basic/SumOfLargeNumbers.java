package Basic;

import java.util.Scanner;

/**
 * @author Mohd Nadeem(mohd.nadeem3464@gmail.com)
 *
 */
public class SumOfLargeNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		scan.nextLine();
		while(t-->0){
			StringBuilder n1 = new StringBuilder(scan.nextLine());
			StringBuilder n2 = new StringBuilder(scan.nextLine());
			if(n1.length()>n2.length()){
				int l1 = n1.length();
				int l2 = n2.length();
				for(int i=0;i<l1-l2;i++){
					n2.insert(0,"0");
				}
			}else if(n2.length()>n1.length()){
				int l1 = n1.length();
				int l2 = n2.length();
				for(int i=0;i<l2-l1;i++){
					n1.insert(0,"0");
				}
			}
			StringBuilder res = new StringBuilder();
			int carry = 0;
			for(int i=n1.length()-1;i>=0;i--){
				int x = Integer.parseInt(""+n1.charAt(i));
				int y = Integer.parseInt(""+n2.charAt(i));
				int no = x+y+carry;
				int digit = no % 10;
				res.insert(0, ""+digit);
				carry = no / 10;
				if(i==0 && carry>0){
					res.insert(0, ""+carry);
				}
			}
			System.out.println(res.toString());
		}
		scan.close();
	}

}
