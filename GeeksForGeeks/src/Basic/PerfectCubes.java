package Basic;

import java.util.Scanner;

/**
 * @author Mohd Nadeem(mohd.nadeem3464@gmail.com)
 *
 */
public class PerfectCubes {
	private static void printCubes(int a,int b){
		boolean flag = false;
		for(int i=1;i<25;i++){
			int cube = i*i*i;
			if(cube<=b && cube>=a){
				flag = true;
				System.out.print(cube+" ");
			}else if(cube>b){
				break;
			}
		}
		if(!flag){
			System.out.print("No");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int a = scan.nextInt();
			int b = scan.nextInt();
			printCubes(a,b);
		}
		scan.close();
	}
}
