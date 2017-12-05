import java.util.Scanner;


public class gcd {
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(gcd(3,13));
	}

}
