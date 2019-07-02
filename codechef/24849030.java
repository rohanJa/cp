
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

 class one {
	static long[] Array;
	static ArrayList<Long> XOROUT;
	static long MINN=Integer.MIN_VALUE;
	public static void main(String[] args) throws IOException {
		Sc.init(System.in);
		int i,j; i=j=0;
		int Testcases=(short) Sc.nextInt();
		while(Testcases!=0) {
			Testcases--;
			int N=Sc.nextInt(); Array=new long[N]; XOROUT=new ArrayList<Long>();
			while(j!=N) Array[j++]=Sc.nextInt(); 
			long K=Sc.nextInt(); 
			long X=Sc.nextInt();
			
			if(K==N) {
				j=0;
				long sum1=0;
				long sum2=0;
				while(j!=N) {
					sum1=sum1+(Array[j]^X);
					sum2=sum2+Array[j];
					//System.out.println((Array[j]^X)+" "+Array[j]);
					j++;
				}
				if(sum1>sum2) {
					System.out.println(sum1);
				}
				else {
					System.out.println(sum2);
				}
			}
			else {
			
			for(i=0;i<N;i++) {
				if((Array[i]^X)>Array[i]) {
					XOROUT.add((Array[i]^X)-Array[i]);
				}
				else {
					XOROUT.add((Array[i]^X)-Array[i]);
					if(XOROUT.get(i)>MINN) {
						MINN=XOROUT.get(i);
					}
				}
				
			}
			
			//Arrays.sort(XOROUT);
			long sum=Solver(N,K,X);
			System.out.println(sum);
			
			}
			MINN=Integer.MIN_VALUE;
			j=i=0;
		}
	}
	private static long Solver(int n, long k, long x) { 
		
		int j=0; long sum=0; long prevsum=0;
		// TODO Auto-generated method stub
		if((k%2==0)) {
			
			//Collections.sort(xkcdd,Collections.reverseOrder());
			Collections.sort(XOROUT,Collections.reverseOrder());
			if(!(n>=4)) {
				
				 if(n==2) {
					if(XOROUT.get(0)>0 && XOROUT.get(1)>0) {
						sum=sum+XOROUT.get(0)+XOROUT.get(1)+Array[0]+Array[1];
					}
					else if(XOROUT.get(0)>0 && XOROUT.get(1)<0) {
						sum=sum+Array[0]+Array[1];
						
					}
					//return sum;
					
				}
				else if(n==3) {
					if(XOROUT.get(0)<0) {
						sum=sum+Array[0]+Array[1]+Array[2];
					}
					else if(XOROUT.get(1)<0) {
						
						sum=sum+Array[0]+Array[1]+Array[2];
					}
					else if(XOROUT.get(2)<0) {
						sum=sum+XOROUT.get(0)+XOROUT.get(1)+Array[0]+Array[1]+Array[2];
					}
					//return sum;
					
				}
				 return sum;
			}
			else {
				boolean flag=false;
				while(j+1<(n)) {
					//System.out.println(XOROUT.get(j)+" "+XOROUT.get(j+1)+" XXXX!");
					sum=sum+XOROUT.get(j)+XOROUT.get(j+1);
					if(prevsum>sum) {
						flag=true;
						break;
					}
					prevsum=sum;
					j=j+2;
				}
				j=0;
				while(j<n) {
					//System.out.println(Array[j]+" ");
					prevsum=prevsum+Array[j]; j++;
				}
				return prevsum;
			}
			
		}
		else {
			
			while(j!=n) {
				if(XOROUT.get(j)>0) {
					sum=sum+XOROUT.get(j)+Array[j];
				}
				else {
					sum=sum+Array[j];
				}
				j++;
			}
			return sum;
		}
		
	}

}

class Sc
{
	static BufferedReader reader;
	static StringTokenizer tokenizer;
	
	/** call this method to initialise reader for InputStream */
	static void init(InputStream input)
	{
		reader = new BufferedReader(new InputStreamReader(input));
		tokenizer = new StringTokenizer("");
	}
	
	/** get next word */
	static String next() throws IOException
	{
		while (!tokenizer.hasMoreTokens())
		{
			// TODO add check for eof if necessary
			tokenizer = new StringTokenizer(reader.readLine());
		}
		return tokenizer.nextToken();
	}
	
	static int nextInt() throws IOException
	{
		return Integer.parseInt(next());
	}
	
	
	static long nextLong() throws IOException{
		return Long.parseLong(next());
	}
	
	static double nextDouble() throws IOException
	{ return Double.parseDouble(next());
	}
}