package Basic;

import java.util.Scanner;

public class HowManyPizzas {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int count = 0;
			int stack1[] = new int[10];
			int stack2[] = new int[10];
			for(int i=0;i<10;i++){
				stack1[i] = scan.nextInt();
			}
			for(int i=0;i<10;i++){
				stack2[i] = scan.nextInt();
			}
			int f = 0;
			for(int i=0;i<10;i++){
				for(int j=0;j<10;j++){
					if(stack1[i]==stack2[j]){
						if(j>=f){ //Proper Order
							count++;
							f = j;
						}
					}
				}
			}
			System.out.println(count);
		}
		scan.close();
	}
}	
