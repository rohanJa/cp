// June EATTWice cookoff
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
// import java.util.Scanner; 
import java.util.StringTokenizer; 
class tastyOptima{
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
            HashMap <Integer,Long> hm = new HashMap<Integer,Long>();
            int n =s.nextInt() , day = s.nextInt();
            int dayAvialable ;
            for(int i=0;i<n;i++){
                dayAvialable = s.nextInt();
                if(hm.containsKey(dayAvialable))
                    hm.put(dayAvialable,Math.max(hm.get(dayAvialable),s.nextLong()));
                else
                    hm.put(dayAvialable,s.nextLong());
            }
            long maxOne=0,maxTwo=0;
            for(long value:hm.values()){
                if(maxOne<value){
                    maxTwo = maxOne;
                    maxOne = value;
                    // sb.append("maxOne "+maxOne+ " maxTwo "+maxTwo);
                }
                else if(value>maxTwo){
                    maxTwo = value;
                    // sb.append("maxOne "+maxOne+ " maxTwo "+maxTwo);
                }
            }
        // System.out.println(sb);

            sb.append((maxOne+maxTwo)+"\n");
        }
        System.out.println(sb);


    }
}