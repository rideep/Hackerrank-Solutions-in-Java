import java.util.Arrays;
import java.util.Scanner;


public class Sequence {

	
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		Integer n= in.nextInt();
		int a[]=new int[n+1];
		
		for(int i=1;i<=n;i++)
		{
			int px=in.nextInt();
			a[px]=i;
		}
		
		for (int i = 1; i <=n; i++) {
			System.out.println(a[a[i]]);
		}
		
		
	}

}
