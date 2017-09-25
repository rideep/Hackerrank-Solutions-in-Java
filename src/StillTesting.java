import java.util.Scanner;
public class StillTesting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		boolean flag=true;
		int c1=0;
		int c2=0;
		while(flag)
		{	
			
			String s1=in.next();
			if(!s1.equals("P1"))
			{
				System.out.println("Please enter a valid input");
				flag=false;
			}
			else
			{
				if(s1.equals("P1"))
					c1++;
				else if(s1.equals("P2"))
					c2++;
			}
			if(c1>=4)
			{
				
						System.out.println("P1 wins");
						flag =false;
					
			}
		}
			
			
	}

}
