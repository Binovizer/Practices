package Basic;

import java.util.Arrays;
import java.util.Scanner;

public class ExtractionOfSecretMessage {
	private static String extract(String str){
		StringBuilder sb = new StringBuilder();
		char c[] = new char[str.length()+3];
		c[str.length()] = 'L';
		c[str.length()+1] = 'I';
		c[str.length()+2] = 'E';
		for(int i=0;i<str.length();i++){
			c[i] = str.charAt(i);
		}
		for(int i=0;i<c.length;i++){
			if(c[i]=='L' && c[i+1]=='I' && c[i+2]=='E'){
				i += 2;
			}else{
				sb.append(c[i]);
				if(c[i+1]=='L' && c[i+2]=='I' && c[i+3]=='E'){
					sb.append(" ");
				}
			}
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		scan.nextLine();
		while(t-->0){
			String str = scan.nextLine();
			System.out.println(extract(str));
		}
		scan.close();
	}
}
