import java.util.Scanner;


public class BeautifulDay {
	public static int reverse(int n)
	{
		int reverseInt=0;
		while(n!=0)
		{
			
			int last_digit=n%10;
			
			reverseInt=reverseInt*10+last_digit;
			n=n/10;
		}
		return reverseInt;
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int i=in.nextInt();
		int j=in.nextInt();
		int k=in.nextInt();
		int count=0;
		System.out.println(reverse(456789));
		
		for (int k2= i; k2 <= j; k2++) {
			int rev=reverse(k2);
			//System.out.println(rev);
			
			if(Math.abs(k2-rev)%k==0)
				count++;
		}
	System.out.println(count);
	
	}

}
