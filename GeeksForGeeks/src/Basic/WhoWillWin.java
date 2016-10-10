package Basic;

import java.util.Scanner;

public class WhoWillWin {
	public static long linear_search(int pos,int time_per_o){
		return time_per_o * pos;
	}
	public static long binary_search(int n,int pos,int time_per_o){
		double time = 0;
		
		return (long)time;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int n = scan.nextInt();
			int pos = scan.nextInt();
			int g = scan.nextInt();
			int s = scan.nextInt();
			long time1 = linear_search(pos, g);
			long time2 = binary_search(n, pos, s);
			System.out.println(time1);
			System.out.println(time2);
			if(time1<time2){
				System.out.println(1);
			}else{
				System.out.println(2);
			}
		}
		scan.close();
	}
}
