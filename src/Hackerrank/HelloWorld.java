package Hackerrank;
import java.util.*;
import java.util.Formatter;
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n=678;
        String time = in.next();
        int  hh=Integer.parseInt(time.substring(0,2));
        int mm=Integer.parseInt(time.substring(3,5));
        int ss=Integer.parseInt(time.substring(6,8));
        if(Objects.equals(time.substring(8,10), "AM") && hh==0)
        {
        	hh=0;
        }
        else if(Objects.equals(time.substring(8,10), "PM") && hh<12)
        {
        	hh+=12;
        }
         
	}

}
