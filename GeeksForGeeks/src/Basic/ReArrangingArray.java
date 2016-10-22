package Basic;

import java.util.Arrays;
import java.util.Scanner;

public class ReArrangingArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int l =  scan.nextInt();
			int list[] = new int[l];
			for(int i=0;i<l;i++){
				list[i] = scan.nextInt();
			}
			Arrays.sort(list);
			int i = 1;
			for(int z=1;z<(l+1)/2;z++){
				int temp = list[l-1];
				for(int k=l-2;k>=i;k--){
					list[k+1] = list[k];
				}
				list[i] = temp;
				i+=2; 
			}
			for(int c=0;c<l;c++){
				System.out.print(list[c]+" ");
			}
			System.out.println();
		}
		scan.close();
	}
}
