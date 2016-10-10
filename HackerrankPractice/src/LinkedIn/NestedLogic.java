package LinkedIn;

import java.util.Scanner;

/**
 * @author Mohd Nadeem(mohd.nadeem3464@gmail.com)
 *
 */
public class NestedLogic {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int d2 = scan.nextInt();
		int m2 = scan.nextInt();
		int y2 = scan.nextInt();
		int d1 = scan.nextInt();
		int m1 = scan.nextInt();
		int y1 = scan.nextInt();
		int fine = 0;
		if(y1==y2){
			if(m1==m2){
				if(d1==d2);
				else if(d1>d2){
					
				}else{
					fine = 15*(d2-d1);
				}
			}else if(m1>m2){
				
			}else{
				fine = 500*(m2-m1);
			}
		}else if(y1>y2){
			
		}else{
			fine = 10000;
		}
		System.out.println(fine);
		scan.close();
	}
}
