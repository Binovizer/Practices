package Basic;

import java.util.Scanner;

public class SetBits {
	public static int countOne(int number){
		int count = 0; 
		for(int i =0; i<32; i++){ 
			if( (number&1) == 1) {
				count++; 
			} 
			number = number >>> 1; 
		} 
		return count; 
	} 
	//Brian Kernighan’s Algorith	
	public static int countSetBits(long number){ 
		int count = 0; 
		while(number>0){ 
			++count; 
			number &= number-1; 
		} 
		return count; 
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int count = 0;
			int n = scan.nextInt();
			int count1 = Integer.bitCount(n);
			System.out.println(count1);
			String str = Integer.toBinaryString(n);
			for(char c : str.toCharArray()){
				if(c=='1'){
					count++;
				}
			}
			System.out.println(count);
		}
		scan.close();
	}
}
