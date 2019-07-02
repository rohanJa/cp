// June EXAM1 cookoff
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
// import java.util.Scanner; 
import java.util.StringTokenizer; 
class songSequence{
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
        int size = s.nextInt();
        int []arr = new int[size];
        for(int i=0;i<size;i++)
            arr[i] = s.nextInt();
        HashSet <Integer> hs =new HashSet<Integer>(); 
        int maximum = Integer.MIN_VALUE;
        int count;
        for(int i=0;i<size;i++){ 
            count=0;
            for(int j=i;j<size;j++){
                if(hs.contains(arr[j]))
                    j=size;
                else
                    count++;
                    maximum = Math.max(maximum,count);
                    hs.add(arr[j]);       
            }
            hs.clear();
        }
        System.out.println(maximum);
    }
}