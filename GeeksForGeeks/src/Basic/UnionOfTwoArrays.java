package Basic;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Mohd Nadeem(mohd.nadeem3464@gmail.com)
 *
 */
public class UnionOfTwoArrays {
	private static boolean search(int arr[], int key){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==key){
				return true;
			}
		}
		return false;
	}
	private static void printUnion(int arr1[],int arr2[]){
		int union[] = new int[arr1.length+arr2.length];
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int count = 0;
		for(int i=0;i<arr1.length;i++){
			union[count++] = arr1[i];
		}
		for(int i=0;i<arr2.length;i++){
			if(!search(union,arr2[i])){
				union[count++] = arr2[i];
			}
		}
		Arrays.sort(union);
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<arr1.length+arr2.length;i++){
			if(union[i]!=0){
				sb.append(union[i]+" ");
			}
		}
		System.out.println(sb.toString());
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int m = scan.nextInt();
			int n = scan.nextInt();
			int arr1[] = new int[m];
			int arr2[] = new int[n];
			for(int i=0;i<m;i++){
				arr1[i] = scan.nextInt();
			}
			for(int i=0;i<n;i++){
				arr2[i] = scan.nextInt();
			}
			printUnion(arr1,arr2);
		}
		scan.close();
	}
}
