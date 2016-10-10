package Basic;

import java.util.Arrays;
import java.util.Scanner;

public class ShortestDirection {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		scan.nextLine();
		while(t-->0){
			String str= scan.nextLine();
			StringBuilder sb = new StringBuilder();
			int n,e,w,s=0;
			n = e = w = s;
			for(int i=0;i<str.length();i++){
				if(str.charAt(i)=='S'){
					s++;
				}else if(str.charAt(i)=='N'){
					n++;
				}if(str.charAt(i)=='W'){
					w++;
				}else if(str.charAt(i)=='E'){
					e++;
				}
			}
			if(e>w){
				for(int i=0;i<e-w;i++){
					sb.append("E");
				}
			}
			if(n>s){
				for(int i=0;i<n-s;i++){
					sb.append("N");
				}
			}
			if(s>n){
				for(int i=0;i<s-n;i++){
					sb.append("S");
				}
			}
			if(w>e){
				for(int i=0;i<w-e;i++){
					sb.append("W");
				}
			}
			System.out.println(sb.toString());
		}
		scan.close();
	}
}
