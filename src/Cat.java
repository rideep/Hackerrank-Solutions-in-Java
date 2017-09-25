

import java.util.*;


public class Cat {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        int[] x=new int[q];
        int[] y=new int[q];
        int[] z=new int[q];
        for(int a0 = 0; a0 < q; a0++){
            x[a0] = in.nextInt();
            y[a0] = in.nextInt();
            z[a0] = in.nextInt();           	
        }
        for (int i = 0; i < q; i++) {
			if(Math.abs(z[i]-x[i])>Math.abs(z[i]-y[i]))
				System.out.println("Cat B");
			else if(Math.abs(z[i]-x[i])==Math.abs(z[i]-y[i]))
				System.out.println("Mouse C");
			else
				System.out.println("Cat A");
		}
        
    }
}
