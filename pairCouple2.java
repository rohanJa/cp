/**
   Author is Rohan Jain 
   Created at 30/06/2019, 16:46:51
**/

import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;
import java.util.StringTokenizer; 
class pairCouple2{
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
        StringBuilder sb = new StringBuilder("");
        while(testcase-->0){
            int size = s.nextInt();
            int []arrOne = new int[size];
            int []arrTwo = new int[size];
            long sum=0;
            int evenOne=0,evenTwo=0;
            for(int i=0;i<size;i++){
                arrOne[i] = s.nextInt();
                sum += arrOne[i];
                if(arrOne[i]%2 == 0)
                    evenOne++;
            }
            for(int i=0;i<size;i++){
                arrTwo[i] = s.nextInt();
                sum += arrTwo[i];
                if(arrTwo[i]%2 == 0)
                    evenTwo++;
            }
            sum = sum/2 - Math.abs((evenOne-evenTwo)/2);
            sb.append(sum+"\n");
        }
        System.out.println(sb);
    
    
    }



}