package Basic;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @author Mohd Nadeem(mohd.nadeem3464@gmail.com)
 *
 */
public class SumOfDistinctElements {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int n = scan.nextInt();
			HashSet<Integer> set = new HashSet<>();
			int sum = 0;
			for(int i=0;i<n;i++){
				int temp  = scan.nextInt();
				if(set.contains(temp));
				else{
					set.add(temp);
					sum += temp;
				}
			}
			System.out.println(sum);
		}
		scan.close();
	}
}	
