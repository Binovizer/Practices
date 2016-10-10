package Basic;

import java.util.Scanner;

public class TowerOfHanoi {
	private static void toh(int n,int s,int d,int a){
		if(n==1){
			System.out.println("Move Disk 1 from rod "+s+" to rod "+d);
			return;
		}
		toh(n-1, s, a, d);
		System.out.println("Move Disk "+n+" from rod "+s+" to rod "+d);
		toh(n-1, a, d, s);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no of disks : ");
		int n = scan.nextInt();
		toh(n, 1,3,2);
		scan.close();
	}
}
