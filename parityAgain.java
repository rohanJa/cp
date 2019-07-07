/**
   Author is Rohan Jain 
   Created at 06/07/2019, 19:38:59
**/

import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;
import java.util.StringTokenizer; 
class parityAgain{
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
        int size =s.nextInt();
        // =8,b=4;
        int []arr = new int[size];
        for(int i=0;i<size;i++)
            arr[i] = s.nextInt();

        System.out.println(7^4);
        int numberBits;
        int i=0;
        while(++i<size){
            if(i>0)
                
            
            
            
            System.out.println(i);
            // numberBits=a>>1;
            // System.out.println("numberBits "+numberBits);
            // System.out.println("a "+a);
            // System.out.println("And operation "+(a&1));    
            // a>>=1;
            
        
        }


    }
}