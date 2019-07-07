/**
   Author is Rohan Jain 
   Created at 05/07/2019, 15:55:32
**/

import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer; 
class chefMean{
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
            ArrayList<Long> al = new ArrayList<>();
            long sum = 0;
            for(int i=0;i<size;i++){
                al.add(s.nextLong());
                sum += al.get(i);    
            }
            float  mean =(float)sum/size;
            if(al.indexOf((long)mean)!=-1){
                if(mean>(int)mean)
                    sb.append("Impossible\n"); 
                else    
                    sb.append((al.indexOf((long)mean)+1)+"\n");
            }
            else    
                sb.append("Impossible\n");
        }
        System.out.println(sb);
    }
}
