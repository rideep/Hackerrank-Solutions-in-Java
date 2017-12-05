import java.util.Scanner;


public class Libraryfine {

	
	public static void main(String[] args) {
		
		        Scanner in = new Scanner(System.in);
		        int d1 = in.nextInt();
		        int m1 = in.nextInt();
		        int y1 = in.nextInt();
		        int d2 = in.nextInt();
		        int m2 = in.nextInt();
		        int y2 = in.nextInt();
		        int fine;
		        if(y1!=y2)
		        {
		        	if(y2>y1)
		        		fine=0;
		        	else
		        		fine=10000;
		        }
		        	
		        else if(m1!=m2)
		        	fine=(m1-m2)*500;
		        else if(d1!=d2)
		        	fine=(d1-d2)*15;
		        else
		        	fine=0;
		        System.out.println(fine);
		    }
	}


