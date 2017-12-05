import java.util.Scanner;
import java.util.Stack;


public class HackerrankInString {

	public static String IsPresent(String Input)
	{
		String tobeMatch="hackerrank";
		if(tobeMatch.length()>Input.length())
			return "NO";
		int j=0;
		for (int i = 0; i < Input.length(); i++) {
			if(j<tobeMatch.length() && Input.charAt(i)==tobeMatch.charAt(j))
			{
				j++;
			}
		}
		if(j==tobeMatch.length())
			return "YES";
		else
			return "NO";
		
	}
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for (int i = 0; i < n; i++) {
			String Input=in.next();
			System.out.println(IsPresent(Input));
			
		}
		
	}

}
