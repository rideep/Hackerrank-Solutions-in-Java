

import java.util.*;



public class TimeConvert {

    static void timeConversion(String s) {
        //StringBuilder si=new StringBuilder(s);
        int hh = 0;
        if((s.substring(8)).equals("PM") && !s.substring(0,2).equals("12"))
        {
        	hh=Integer.parseInt(s.substring(0, 2))+12;
        	System.out.println(Integer.toString(hh)+s.substring(2,8));
        }
        else if(s.substring(8).equals("AM") && s.substring(0, 2).equals("12"))
        {
        	
        	System.out.println("00"+s.substring(2,8));
        }
        
        else if((s.substring(8)).equals("AM") && !s.substring(0,2).equals("12"))
        	System.out.println(s.substring(0,8));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
       timeConversion(s);
        
    }
}
