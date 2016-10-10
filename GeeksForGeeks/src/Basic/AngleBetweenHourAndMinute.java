package Basic;

import java.util.Scanner;

/**
 * @author Mohd Nadeem(mohd.nadeem3464@gmail.com)
 *
 */
public class AngleBetweenHourAndMinute {
	private static int calculateAngle(double h,double m){
		if(h<0||m<0||h>12||m>60){
			return -1;
		}
		if(h==12) h=0;
		if(m==60) m=0;
		double hour_angle = (h*60+m)*0.5;
		double min_angle = m*6;
		double angle = Math.abs((hour_angle-min_angle));
		angle = ( (int)angle > (int)(360-angle) ) ? (int)(360-angle) : (int)angle;
		return (int)angle;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		scan.nextLine();
		while(t-->0){
			String str = scan.nextLine();
			String s[] = str.split(" ");
			double h = Double.valueOf(s[0]);
			double m = Double.valueOf(s[1]);
			System.out.println(calculateAngle(h,m));
		}
		scan.close();
	}
}
