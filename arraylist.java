/**
   Author is Rohan Jain 
   Created at 08/07/2019, 13:21:31
**/

import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer; 
class arraylist{
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
        // ArrayList <Integer> one = new ArrayList<>();
        ArrayList <ArrayList<Integer>> second = new ArrayList<>();
        int n= s.nextInt(),m=s.nextInt();
        int [][]arr = new int[n][m];
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                arr[i][j] = s.nextInt();
                int temp=100;
        for(int i=0;i<n;i++){
            temp=100;
            ArrayList <Integer> one = new ArrayList<>();
            for(int j=0;j<m;j++){
                if(temp>arr[i][j]){
                    temp=arr[i][j];
                    one.clear();
                    one.add(j);
                    one.add(i);
                }
            }
            second.add(one);
        }
        // System.out.println(one);
        System.out.println("second "+second);    
    }
}