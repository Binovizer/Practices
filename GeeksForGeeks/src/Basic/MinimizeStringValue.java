package Basic;

import java.util.Scanner;

public class MinimizeStringValue {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		scan.nextLine();
		while(t>0)
		{
			int a[] = new int[26];
			int sum=0;
			String str = scan.nextLine();
			int k = scan.nextInt();
			scan.nextLine();
			for(char c : str.toCharArray())
			{
				int p = c;
				++a[p-97];
			}
			while(k>0)
			{
				int max=a[0];
				int index=0;
				for(int i=0;i<26;i++)
				{
					if(max<a[i])
					{
						max=a[i];
						index=i;
					}
				}
				if(a[index]>0)
					--a[index];
				k--;
			}

			for(int i=0;i<26;i++)
			{
				sum=sum+(a[i]*a[i]);
			}
			System.out.println(sum);
			t--;
		}
		scan.close();
	}
}