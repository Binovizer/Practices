package Basic;

import java.util.Scanner;

public class GoodString {
	private static boolean isDistanceOne(char cur,char pre){
		if((cur=='a'&&pre=='z')||((cur=='z'&&pre=='a'))){
			return true;
		}
		int d = cur-pre;
		if(Math.abs(d)==1){
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		scan.nextLine();
		while(t-->0){
			String str = scan.nextLine();
			char pre = str.charAt(0);
			boolean flag = true;
			for(int i=1;i<str.length();i++){
				if(!isDistanceOne(str.charAt(i),pre)){
					flag = false;
					break;
				}
				pre = str.charAt(i);
			}
			if(flag){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
		scan.close();
	}
}
