package Basic;

public class OddOrEven {
	public static String oddoreven(int n){
		if((n&1)==0){
			return "Even";
		}else{
			return "Odd";
		}
	}
	public static void main(String[] args) {
		System.out.println(oddoreven(10));
		System.out.println(oddoreven(11));
	}
}
