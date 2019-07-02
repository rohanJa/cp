/* package codechef; // don't place package name! */

import java.util.*;
import java.util.regex.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc= new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t>0){
	        int n=sc.nextInt();
	        
	        ArrayList<Integer> arr= new ArrayList<Integer>(n);
	        for(int i=0;i<n;i++){
	            int b=sc.nextInt();
	            arr.add(b);
	            
	        }
	        int k=sc.nextInt();
	        int x= sc.nextInt();
	        //int max=o;
	        //System.out.println(x);
	        long sum=0;
	        long sum1=0;
	        ArrayList<Integer> a= new ArrayList<Integer>();
	        int z=0;
	        int min=2000000000;
	        int ec=-2000000000;
	        for(int i=0;i<n;i++){
	            a.add((arr.get(i)^x)-arr.get(i));
	            if(a.get(i)>0){
	                z++;
	                if(a.get(i)<min){
	                    min=a.get(i);
	                }
	            }
	            else{
	                if(a.get(i)>ec){
	                    ec=a.get(i);
	                }
	            }
	        }
	        //System.out.println(a);
	        for(int i=0;i<n;i++)
	                sum=sum+arr.get(i);
	        if(x==0){
	            
	            
	                System.out.println(sum);
	            
	        }
	        
	        else if(k==n){
	            for(int i=0;i<n;i++){
	                sum1=sum1+arr.get(i)+a.get(i);
	            }
	            
	            System.out.println(Math.max(sum,sum1));
	        }
	        
	        else{
	            long max1=0;
	            long max=0;
	            if(k%2!=0){
	                //System.out.println(z+" "+min);
	                for(int i=0;i<n;i++){
	                    if(a.get(i)>0){
	                        max=max+arr.get(i)+a.get(i);
	                    }
	                    else{
	                        max=max+arr.get(i);
	                    }
	                }
	            }
	            else{
	                //System.out.println(z+" "+min);
	                if(z%2==0){
	                    for(int i=0;i<n;i++){
	                    if(a.get(i)>0){
	                        max=max+arr.get(i)+a.get(i);
	                    }
	                    else{
	                        
	                        max=max+arr.get(i);
	                    }
	                }
	                }
	                else{
	                    
	                    if(z!=n){
	                        for(int i=0;i<n;i++){
	                    if(a.get(i)>0){
	                        max1=max1+arr.get(i)+a.get(i);
	                    }
	                    else{
	                        
	                        max1=max1+arr.get(i);
	                    }
	                }
	                max1=max1+ec;
	                    }
	                    //System.out.println(a);
	                    for(int i=0;i<n;i++){
	                    if((a.get(i)>0&&a.get(i)!=min)||(a.get(i)>0&&z%2==0)){
	                        max=max+arr.get(i)+a.get(i);
	                        //System.out.println("ok");
	                    }
	                    else{
	                        if(a.get(i)>0){
	                        z--;
	                            
	                        }
	                        max=max+arr.get(i);
	                    }
	                }
	                }
	            }
	            System.out.println(Math.max(max,max1));
	        
	    }
	   t--;
	    }
	    	// your code goes here
	}
}

