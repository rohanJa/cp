/**
   Author is Rohan Jain 
   Created at 06/07/2019, 17:46:19
**/

import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer; 
class hitCoconut{
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
    public static void  main(String[] args) {
        FastReader s =new FastReader();
        int testcase = s.nextInt();
        StringBuilder sb=new StringBuilder("");
        while(testcase-->0){
            int size = s.nextInt();
            int []arr = new int[size];
            int breakCoconut=s.nextInt();
            int minHit = Integer.MAX_VALUE; 
            for(int i=0;i<size;i++){
                arr[i] = s.nextInt();
            }
            Arrays.sort(arr);
            for(int i=0;i<size;i++){
                if(minHit>arr[i]*(size-i))
                    minHit = arr[i]*(size-i);
            }     
            sb.append(minHit+"\n");
        }
        System.out.println(sb);
    }
}