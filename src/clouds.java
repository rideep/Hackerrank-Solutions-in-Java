import java.util.Scanner;


public class clouds {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int E=100;
        int c[] = new int[n];
        for(int i=0; i < n; i++){
            c[i] = in.nextInt();
        }
       
       for(int i=0;i<n;i=(i+k)%n) {
    	   
    	   if((i+k)%n==0)
    	   {
    		   break;
    	   }
    	   else if(c[i]==1)
    		   E-=3;
    	   else if(c[i]==0)
    		   E-=1;
    		   
		}
       if(c[0]==0)
    	   System.out.println(E-1);
       else
    	   System.out.println(E-2);
	}

}
