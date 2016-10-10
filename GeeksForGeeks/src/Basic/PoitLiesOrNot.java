package Basic;

import java.util.Scanner;

/**
 * @author Mohd Nadeem(mohd.nadeem3464@gmail.com)
 *
 */
public class PoitLiesOrNot {
	private static double area(int x1,int y1,int x2,int y2,int x3,int y3){
		return Math.abs((x1*(y2-y3) + x2*(y3-y1)+ x3*(y1-y2))/2.0);
	}
	private static String checkPoint(int x1,int y1,int x2,int y2,int x3,int y3,int xc,int yc){
		double a = area(x1, y1, x2, y2, x3, y3);
		double a1 = area(xc, yc, x2, y2, x3, y3);
		double a2 = area(x1, y1, xc, yc, x3, y3);
		double a3 = area(x1, y1, x2, y2, xc, yc);
		return (a==a1+a2+a3) ? "Yes" : "No";
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int x1 = scan.nextInt();
			int y1 = scan.nextInt();
			int x2 = scan.nextInt();
			int y2 = scan.nextInt();
			int x3 = scan.nextInt();
			int y3 = scan.nextInt();
			int x = scan.nextInt();
			int y = scan.nextInt();
			System.out.println(checkPoint(x1,y1,x2,y2,x3,y3,x,y));
		}
		scan.close();
	}
}
