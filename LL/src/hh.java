/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class hh
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s= new Scanner(System.in);
		int t= s.nextInt();
		while(t>0){
		    t--;
		    int n=s.nextInt();
		    int[] x= new int[n+1];
		    int[] xor = new int[n+1];
		    for(int i=1;i<=n;i++){
		        x[i]=s.nextInt();
		        xor[i]=xor[i-1]^x[i];
		    }
		    long count=0;
		    
		   // xor[0]=x[0];
		    for(int i=1;i<n;i++){
		        xor[i]=(xor[i-1]^x[i]);
		    }
		 
		    HashMap<Integer,Integer> h = new HashMap<>();
		    h.put(0,0);
		    long a[]= new long[n+1];
		    HashMap<Integer,Integer> xorpre= new HashMap<>();
		    xorpre.put(0,1);
		    for(int i=1;i<=n;i++){
		        if(h.containsKey(xor[i])){
		            int nak=h.get(xor[i]);
		            int min=1;
		            if(xorpre.containsKey(xor[i]))
		            {
		                min=xorpre.get(xor[i]);
		            }
		            long fans=i-nak-1;
		            if(min>0){
		                fans=fans+a[nak]+((min-1)*(fans+1));
		            }
		            a[i]=fans;
		            count+=fans;
		        }
		        
		        h.put(xor[i],i);
		        if(xorpre.containsKey(xor[i])){
		            xorpre.put(xor[i],xorpre.get(xor[i])+1);
		            
		        }
		        else {
		            xorpre.put(xor[i],1);
		        }
		    }
		    System.out.println(count);
		}
	}
}
