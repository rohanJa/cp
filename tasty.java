import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
// import java.util.Scanner; 
import java.util.StringTokenizer; 
class tasty{
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

        HashMap<Integer,Integer> hm =new HashMap<Integer,Integer>();
        ArrayList<Integer> hmDel =new ArrayList<Integer>();
        // Collections .max(arrayList)
        int n=s.nextInt(),k=s.nextInt();
        int maxValue1=0,maxValue2=0,index=0,max =Integer.MIN_VALUE;
        int a,b;
        for(int i=0;i<n;i++){
            a=s.nextInt();
            hm.put(i+1,a);
            b=s.nextInt();
            hmDel.add(b);
            if(hmDel.get(i)>max){
                max = hmDel.get(i);
                index=i;
                maxValue1 = hm.get(i+1);
            }
        }
        int secondMax = Integer.MIN_VALUE;
        hmDel.remove(index);
        for(int i=0;i<n;i++){
            if(hmDel.get(i)>max && (hm.get(index+1)!=hm.get(i+1))){
                secondMax = hmDel.get(i);
                index=i;
                maxValue2 = hm.get(i+1);
            }
        }    
        System.out.println((maxValue1+maxValue2));
    }
}