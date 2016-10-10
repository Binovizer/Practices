package LinkedIn;

import java.util.Scanner;
import java.util.TreeMap;

/**
 * @author Mohd Nadeem(mohd.nadeem3464@gmail.com)
 *
 */
public class DictionariesAndMaps {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		TreeMap<String, String> dict = new TreeMap<>();
		for(int i=0;i<n;i++){
			dict.put(scan.next(), scan.next());
		}
		scan.nextLine();
		for(int i=0;i<n;i++){
			String key = scan.nextLine();
			if(dict.containsKey(key)){
				System.out.println(key+"="+dict.get(key));
			}else{
				System.out.println("Not found");
			}
		}
		scan.close();
	}

}
