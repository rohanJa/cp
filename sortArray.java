/**
   Author is Rohan Jain 
   Created at 29/06/2019, 22:01:46
**/

import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;
import java.util.StringTokenizer; 
class sortArray{
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
         
            
        // int temp;
        // for(int i=0;i<size;i++){
        //     if(arr[i]>arr[i+1]&&(Math.abs(arr[i]-arr[i+1])==2)){
        //         temp = arr[i];
        //         arr[i]=arr[i+1];
        //         arr[i+1] = temp;
        //     }
        // }    
        System.out.println(Math.abs((3-2)/2));        


    }
}