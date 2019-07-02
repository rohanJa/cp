// June EXAM1 cookoff
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
// import java.util.Scanner; 
import java.util.StringTokenizer; 
class allotingMarks{
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
        StringBuilder sb = new StringBuilder("");
        int testcase = s.nextInt();
        while(testcase-->0){
            int n = s.nextInt();
            char []str = (s.nextLine()).toCharArray();
            char []str2 = (s.nextLine()).toCharArray();
            int count=0;
            if(String.valueOf(str).equals(String.valueOf(str2))){
                sb.append(str.length+"\n");
            }
            else{
                for(int i=0;i<str.length;i++){
                    if(str[i]==str2[i])
                        count++;  
                    else if(str2[i]!='N')
                            i++;
                }
                sb.append(count+"\n");
            }
        }
        System.out.println(sb);
    }
}