
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Pick {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i=0; i < n; i++){
            a[i] = in.nextInt();
        }
        int[] count=new int[n];
        int max=0;
        Arrays.sort(a);
        //System.out.println(Arrays.toString(a));
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                   if(Math.abs(a[i]-a[j])<=1)
                        count[i]++;
            }
        }
        Arrays.sort(count);
        System.out.println(count[n-1]+1);
    }
}
