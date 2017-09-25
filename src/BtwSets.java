import java.util.Scanner;


public class BtwSets {
	public static int gcd(int a,int b)
	{

		if(b==0)
			return a;
		else
			return gcd(b,a%b);
	}
	public static int gcdOfarray(int[] a)
	{
		int ans=a[0];
		for (int i = 1; i < a.length; i++) {
			if(a[i]==0)
				return ans;
			ans= gcd(a[i],ans%a[i]);
		}
		return ans;
	}
	public static int lcm(int a,int b)
	{
		return (a*b)/gcd(a,b);
	}
	public static int lcmOfarray(int[] a)
	{
		int ans=a[0];
		for (int i = 1; i < a.length; i++) {
			
			ans= lcm(ans,a[i]);
		}
		return ans;
	}
	

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		int[] a=new int[n];
		int[] b=new int[m];
		int count =0;
		for (int i = 0; i < a.length; i++) {
			 a[i]=in.nextInt();
		}
		for (int j = 0; j < b.length; j++) {
			b[j]=in.nextInt();
		}
		int l=lcmOfarray(a);
		int g=gcdOfarray(b);
		for(int i=l,j=2;i<=g;i=l*j,j++)
		{
			if(g%i==0)
				count++;
		}
		System.out.println(count);
	}

}
