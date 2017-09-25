import java.util.Scanner;


public class JustTesting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		//int b[]=new int[n/2];
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		if(n%2!=0)
		{
			for(int i=0;i<(n/2)+1;i++)
			{
				a[i]+=a[n-i-1];
				
			}
			a[n/2+1]=2*a[n/2+1];
			for (int i = 0; i <(a.length/2)+1; i++) {
				System.out.println(a[i]);
			}
		}
		else
		{
			for(int i=0;i<n/2;i++)
			{
				a[i]+=a[n-i-1];
			}
			for (int i = 0; i <a.length/2; i++) {
				System.out.println(a[i]);
			}
		}
		
	}

}
