package Basic;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Mohd Nadeem(mohd.nadeem3464@gmail.com)
 *
 */
public class IntersectionOfTwoArrays {
	private static void printIntersection(int arr1[],int arr2[]){
		boolean flag = false;
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int i =0,j=0;
		int m = arr1.length;
		int n = arr2.length;
		while(i<m && j<n){
			if(arr1[i]<arr2[j]){
				i++;
			}else if(arr1[i]>arr2[j]){
				j++;
			}else{
				flag = true;
				System.out.print(arr1[i]+" ");
				i++;
				j++;
			}
		}
		if(!flag){
			System.out.print("Zero");
		}
		System.out.println();
	}
	
	private static void printUnion(int arr1[],int arr2[]){
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int i =0,j=0;
		int m = arr1.length;
		int n = arr2.length;
		while(i<m && j<n){
			if(arr1[i]<arr2[j]){
				System.out.print(arr1[i]+" ");
				i++;
			}else if(arr1[i]>arr2[j]){
				System.out.print(arr2[j]+" ");
				j++;
			}else{
				System.out.print(arr1[i]+" ");
				i++;
				j++;
			}
		}
		while(i < m)
		   System.out.print(arr1[i++]+" ");
		while(j < n)
		   System.out.print(arr2[j++]+" ");
		System.out.println();
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
			//printIntersection(arr1,arr2);
			printUnion(arr1, arr2);
		}
		scan.close();
	}
}
