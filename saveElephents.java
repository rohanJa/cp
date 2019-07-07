/**
   Author is Rohan Jain 
   Created at 07/07/2019, 16:50:48
**/

import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;
import java.util.StringTokenizer; 
class saveElephents{
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
            int size = s.nextInt() ;
            char []str = (s.nextLine()).toCharArray();
            int count=0;
            if(str[0]=='0'&&str[1]!='1')
                count++;
            if(str[size-1]=='0'&&str[size-2]!='1')
                count++;       
            for(int i=1;i<size-1;i++){
                if(str[i-1]=='0'&&str[i]=='0'&&str[i+1]=='0'){
                    count++;
                }
            }
            sb.append(count+"\n");
        }
        System.out.println(sb);
    }
}