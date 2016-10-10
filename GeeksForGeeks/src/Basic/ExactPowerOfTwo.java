package Basic;

public class ExactPowerOfTwo {
	public static boolean isPowerOfTwo(int n){
		 return (n > 0) && ((n & (n - 1)) == 0);
	}
	public static void main(String[] args) {
		System.out.println(isPowerOfTwo(0));
		System.out.println(isPowerOfTwo(1024));
		System.out.println(isPowerOfTwo(2255));
		System.out.println(isPowerOfTwo(256));
		System.out.println(isPowerOfTwo(16));
		System.out.println(isPowerOfTwo(24));
		
	}
}
