package LinkedIn;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Mohd Nadeem(mohd.nadeem3464@gmail.com)
 *
 */
public class LeftRotateArray {
	private static void leftRotate(int arr[]){
		int temp = arr[0];
		for(int i=1;i<arr.length;i++){
			arr[i-1] = arr[i];
		}
		arr[arr.length-1] = temp;
	}
	public static int[] rotateArray(int[] arr, int d){
	    // Because the constraints state d < n, we need not concern ourselves with shifting > n units.
	    int n = arr.length;

	    // Create new array for rotated elements:
	    int[] rotated = new int[n]; 

	    // Copy segments of shifted elements to rotated array:
	    System.arraycopy(arr, d, rotated, 0, n - d);
	    System.arraycopy(arr, 0, rotated, n - d, d);

	    return rotated;
	}
	public static int[] rotateArray1(int[] arr, int d){
        // Because the constraints state d < n, we need not concern ourselves with shifting > n units.
        int n = arr.length;
        
        // Create a temporary d-element array to store elements shifted to the left of index 0:
        int[] temp_arr = Arrays.copyOfRange(arr, 0, d);
        
        // Shift elements from indices d through n to indices 0 through d - 1:
        for(int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }
        
        // Copy the d shifted elements from the temporary array back to the original array:
        for(int i = n - d; i < n; i++) {
            arr[i] = temp_arr[i-n+d];
        }
        
        return arr;
    }
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int t = scan.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = scan.nextInt();
		}
		while(t-->0){
			leftRotate(arr);
		}
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		scan.close();
	}
}
