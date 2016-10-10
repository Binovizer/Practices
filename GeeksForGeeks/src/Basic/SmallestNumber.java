package Basic;

import java.util.Scanner;

/**
 * @author Mohd Nadeem(mohd.nadeem3464@gmail.com)
 *
 */
public class SmallestNumber {
	
	private static int findNumber(int s,int d){
		if(s==0){
			if(d==1){
				return 0;
			}else{
				return -1;
			}
		}
		if(s>9*d){
			return -1;
		}
		s -= 1;
		int res[] = new int[d];
		for(int i=d-1;i>0;i--){
			if(s>9){
				res[i] = 9;
				s -= 9;
			}else{
				res[i] = s;
				s = 0;
			}
		}
		res[0] = s+1;
		StringBuilder sb = new StringBuilder();
		for(int i: res){
			sb.append(""+i);
		}
		return Integer.parseInt(sb.toString());
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int s = scan.nextInt();
			int d = scan.nextInt();
			System.out.println(findNumber(s,d));
		}
		scan.close();
	}
}
