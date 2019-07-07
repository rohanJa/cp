/**
   Author is Rohan Jain 
   Created at 07/07/2019, 15:13:26
**/

import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;
import java.util.StringTokenizer; 
class buyBooks{
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
            int max = Integer.MIN_VALUE;
            int pageRequired = s.nextInt();
            int pageLeft = s.nextInt();
            int money = s.nextInt();
            int size = s.nextInt();            
            int []page = new int[size];
            int []price = new int[size];
            for(int i=0;i<size;i++){
                page[i] = s.nextInt();
                price[i] = s.nextInt();
            }
            
            int flag=0;    
            if(pageRequired-pageLeft>0){
                for(int i=0;i<size;i++){
                    if(money>=price[i]&&page[i]>=pageRequired-pageLeft){
                        flag=1;
                        break;
                    }
                }
            }
            else
                sb.append("UnluckyChef");

            if(flag==1)
                sb.append("LuckyChef");
            else    
                sb.append("UnluckyChef");
        }    
        System.out.println(sb);
    }
}