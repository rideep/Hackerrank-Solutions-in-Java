import java.util.Scanner;


public class LeaderBoard {

	
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] scores = new int[n];
	        for(int i=0; i < n; i++){
	            scores[i] = in.nextInt();
	        }
	       
	        int m = in.nextInt();
	        int[] alice = new int[m];
	        for(int i=0; i < m; i++){
	            alice[i] = in.nextInt();
	        }
	        
	        int[] rank=new int[n];
	        rank[0]=1;
	        for (int i = 1; i < n; i++) {
	        	if(scores[i-1]==scores[i])
	        		rank[i]=rank[i-1];
	        	else
	        		rank[i]=rank[i-1]+1;
				
			}
	       
	        for(int i=0;i<m;i++)
		       {	
	        	 int last=n-1;
		    	   int alice_rank=rank[last-1]+1;
		    	   while(last>=0 && alice[i]>scores[last])
		    	   {
		    		   last--;
		    	   }
		    	   		
		    	   if(last==-1)
		    		   alice_rank=1;
		    	   else if(alice[i]<scores[last])
		    		   {
		    			   alice_rank=rank[last]+1;
		    		   }
		    		   else if(alice[i]==scores[last])
		    			   alice_rank=rank[last];
		    		   
		    	   System.out.println(alice_rank);  
		    	   }
		    	   
				
		       }
	       
	        
	    }

	


