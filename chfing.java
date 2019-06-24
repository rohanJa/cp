import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
// import java.util.Scanner; 
import java.util.StringTokenizer; 
class chfing{
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

    public static void main (String [] args){
        FastReader s = new FastReader();
        StringBuilder sb =new StringBuilder("");
        int testcase = s.nextInt();
        long num,answer,n,k;
        while(testcase-->0){
            n = s.nextLong();
            k = s.nextLong();
            num =(long)Math.ceil((k-1)/(n-1));   
            if((k-1)%(n-1)>0)
                num++;
            answer = num*k-((num*(num-1)*n)/2)+(((num-2)*(num-1))/2)-1; 
            sb.append(answer+"\n");
        }
        System.out.println(sb);
    }
}