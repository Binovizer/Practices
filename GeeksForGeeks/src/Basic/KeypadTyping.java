package Basic;

import java.util.Scanner;

public class KeypadTyping {
	private static String generateKeypad(String str){
		StringBuilder sb = new StringBuilder();
		for(char c : str.toUpperCase().toCharArray()){
			switch (c) {
			case 'A':
			case 'B':
			case 'C':
				sb.append(2);
				break;
			case 'D':
			case 'E':
			case 'F':
				sb.append(3);
				break;
			case 'G':
			case 'H':
			case 'I':
				sb.append(4);
				break;
			case 'J':
			case 'K':
			case 'L':
				sb.append(5);
				break;
			case 'M':
			case 'N':
			case 'O':
				sb.append(6);
				break;
			case 'P':
			case 'Q':
			case 'R':
			case 'S':
				sb.append(7);
				break;
			case 'T':
			case 'U':
			case 'V':
				sb.append(8);
				break;
			case 'W':
			case 'X':
			case 'Y':
			case 'Z':
				sb.append(9);
				break;
			default:
				sb.append(c);
				break;
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
			System.out.println(generateKeypad(str));
		}
		scan.close();
	}
}
