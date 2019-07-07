/**
   Author is Rohan Jain 
   Created at 06/07/2019, 21:12:16
**/

import java.util.ArrayList;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class circleMerge{
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
        int sum=0,index=3;
        ArrayList <Integer> list = new ArrayList<Integer>();
        // for(int i=0;i<size;i++){
            
        // }    
        for(int j=0;j<size-1;j++){
            list.add(arr[j]+arr[j+1]);        
        }
        System.out.println(list);
    
    }
}