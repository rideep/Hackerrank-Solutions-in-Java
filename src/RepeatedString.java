import java.util.Scanner;


public class RepeatedString {

	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String toRepeat=in.next();
		long count=0;
		long n=in.nextLong();
			for (int i = 0; i < toRepeat.length(); i++) {
				if(toRepeat.charAt(i)=='a')
					count++;
			}
			//str.append("a");
			count=(count*(n/toRepeat.length()));
			for (int i = 0; i < n%toRepeat.length(); i++) {
				if(toRepeat.charAt(i)=='a')
					count++;
			}
		System.out.print(count);
	}

}
