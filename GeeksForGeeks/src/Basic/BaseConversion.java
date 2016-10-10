package Basic;

import java.util.Scanner;

public class BaseConversion {
	public static String decimal_to_binary(int n){
		StringBuffer sb = new StringBuffer();
		int temp = n;
		while(temp>0){
			int digit = temp%2;
			sb.append(digit);
			temp = temp/2;
		}
		return sb.reverse().toString();
	}
	public static String decimal_to_Hexadecimal(int n){
		StringBuffer sb = new StringBuffer();
		int temp = n;
		while(temp>0){
			char s[] = new char[]{'1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
			int digit = temp%16;
			sb.append(s[digit-1]);
			temp = temp/16;
		}
		return sb.reverse().toString();
	}
	public static int binary_to_decimal(String str){
		int d = 0;
		int pow = 0;
		for(int i=str.length()-1;i>=0;i--){
			int x = Integer.parseInt(str.charAt(i)+"");
			d += (x*Math.pow(2, pow));
			pow++;
		}
		return d;
	}
	public static int hexa_to_decimal(String str){
		int d = 0;
		int pow = 0;
		for(int i=str.length()-1;i>=0;i--){
			char s[] = new char[]{'1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
			int k;
			for(k=0;k<s.length;k++){
				if(str.charAt(i)==s[k]){
					break;
				}
			}
			d += ((k+1)*Math.pow(16, pow));
			pow++;
		}
		return d;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int d_to_b = scan.nextInt();
			String b_to_d = scan.next();
			int d_to_h = scan.nextInt();
			String h_to_d = scan.next();
			System.out.print(Integer.toString(d_to_b, 2)+" ");
			System.out.print(Integer.parseInt(b_to_d,2)+" ");
			System.out.print(Integer.toString(d_to_h, 16).toUpperCase()+" ");
			System.out.print(Integer.parseInt(h_to_d,16));
			System.out.println();
		}
		scan.close();
	}
}
