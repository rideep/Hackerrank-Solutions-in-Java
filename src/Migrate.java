
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Migrate {

    static int migratoryBirds(int n, int[] ar) {
        // Complete this function
        //int[] a={1,2,3,4,5};
        int[] c={0,0,0,0,0};
        for(int i=0;i<n;i++)
        {
            if(ar[i]==1)
            	c[0]++;
            else if(ar[i]==2)
            	c[1]++;
            else if(ar[i]==3)
            	c[2]++;
            else if(ar[i]==4)
            	c[3]++;
            else if(ar[i]==5)
            	c[4]++;
        }
        int max=0;
        for(int i=0;i<5;i++)
        {
        	if(c[i]>max)
        		max=c[i];
        }
        
        if(max==c[0])
        	return 1;
        if(max==c[1])
        	return 2;
        if(max==c[2])
        	return 3;
        if(max==c[3])
        	return 4;
        else 
        	return 5;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}
