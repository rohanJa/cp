//package June19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

public class Main {
static class FastReader 
	
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 
	static long mod = (long)Math.pow(10,9)+7;
	
	public static long power(long a, long n) {
		if(n==0) {
			return 1;
		}
		if(n%2==0) {
			return power((a*a)%mod,n/2);
		}
		else {
			return (a%mod*power((a*a)%mod,n/2)%mod)%mod;
		}
	}
	
	public static long gcd(long a, long b) {
		if(b==0) {
			return a;
		}
		else {
			return gcd(b,a%b);
		}
	}
	
	public static void main(String[] args) {
		FastReader s = new FastReader();
		long T = s.nextLong();
		for(long t=0;t<T;t++) {
			int N = s.nextInt();
			long sum=0;
			Long[] arr = new Long[N];
			for(int i=0;i<N;i++) {
				arr[i]=s.nextLong();
				sum+=arr[i];
			}
			//System.out.println(sum);
			long K = s.nextLong();
			long X = s.nextLong();
			Long[] modDiff = new Long[N];
			for(int i=0;i<N;i++) {
				long xor = X^arr[i];
				modDiff[i]= xor- arr[i];
			}
			Arrays.sort(modDiff,Collections.reverseOrder());
//			for(int i=0;i<N;i++) {
//				System.out.print(modDiff[i]+" ");
//			}
//			System.out.println();
			if(N==1) {
				long ans = arr[0]^X;
				if(ans>arr[0]) {
					System.out.println(ans);
					continue;
				}else {
					System.out.println(arr[0]);
					continue;
				}
			}
			if(K==N) {
				long sum3=0;
				int k=0;
				while(k<N){
//					System.out.println(i);
					sum3+=modDiff[k];
					k++;
				}
				if(sum3>0) {
					System.out.println(sum+sum3);
					continue;
				}else {
					System.out.println(sum);
					continue;
				}
				
			}
			long sum2=0;
			int i=0;
			while(i<N && (modDiff[i]+sum2)>sum2){
//				System.out.println(i);
				sum2+=modDiff[i];
				i++;
				
			}
			
			long[] diff = new long[N];
			diff[0]=modDiff[0];
//			System.out.println("sum2: "+sum2);
//			System.out.println("i: "+i);
			if(K%2==0) {
				for(int j=1;j<N;j++) {
					diff[j]=modDiff[j]+diff[j-1];
				}
				long finalAns = sum;
				long tempAns = 0;
				for(int j=1;j<N;j+=2) {
					tempAns=sum+diff[j];
					if(tempAns>finalAns) {
						finalAns=tempAns;
					}
				}
				System.out.println(finalAns);
				continue;
			}else {
				sum+=sum2;
			}
			
			System.out.println(sum);
			
		}
	}
}
