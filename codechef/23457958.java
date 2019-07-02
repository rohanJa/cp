/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{

    public long gcd(long a, long b){
        if(b == 0) return a;
        return gcd(b, a%b);
    }
    public String getResult(long numT, long a, long b, long k){
        long count = 0;
        if(numT < k) return "Lose";
        long lcm = a * (b / gcd(a,b));
        count = numT/a + numT/b - 2*(numT/lcm);
        return count < k ? "Lose" : "Win";
    }
	public static void main (String[] args) throws java.lang.Exception
	{   
		// your code goes here
		try {
		  Scanner in=new Scanner(System.in);
		  Codechef obj = new Codechef();
		  int numInputs=in.nextInt();
		  while(numInputs-->0)
		  {
		      System.out.println(obj.getResult(in.nextLong(),in.nextLong(),in.nextLong(),in.nextLong()));
		  }
		} catch(Exception e) {
		} 
		
	}
}
