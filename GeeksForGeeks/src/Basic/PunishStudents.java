package Basic;

import java.util.Scanner;

public class PunishStudents {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int n = scan.nextInt();
			double avg = scan.nextDouble();
			int rn[] = new int[n];
			int marks[] = new int[n];
			for(int i=0;i<n;i++){
				rn[i] = scan.nextInt();
			}
			int marks_sum = 0;
			for(int i=0;i<n;i++){
				marks[i] = scan.nextInt();
				marks_sum += marks[i];
			}
			int count = 0;
			for(int i=0;i<n;i++){
				for(int j=0;j<n-i-1;j++){
					if(rn[j]>rn[j+1]){
						count++;
						int temp = rn[j];
						rn[j] = rn[j+1];
						rn[j+1] = temp;
					}
				}
			}
			double avg_after = (marks_sum-count)/(n*1.0);
			if(avg<avg_after){
				System.out.println(1);
			}else{
				System.out.println(0);
			}
		}
		scan.close();
	}
}
