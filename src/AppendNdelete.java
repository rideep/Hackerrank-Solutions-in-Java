import java.util.Scanner;
public class AppendNdelete {
		public static boolean isDesired(int k,String s1,String s2) {
			int n1=s1.length();
			int n2=s2.length();
			int i;
			for (i = 0; i < Math.min(n1, n2); i++) {
				if(s1.charAt(i)==s2.charAt(i))
					continue;
				else
					break;
			}
			//System.out.print(i);
			int x=s1.length()+s2.length()-2*i;
			if(x%2==k%2)
				return true;
			else if(s1.length()+s2.length()-k<0)
				return true;
			else 
				return false;
		}
	
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		String s1=in.next();
		String s2=in.next();
		int k=in.nextInt();
		if(isDesired(k, s1, s2))
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
