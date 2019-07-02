/**
   Author is Rohan Jain 
   Created at 29/06/2019, 20:39:11
**/

import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer; 
class pairCouple{
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
            ArrayList <Integer> odd = new ArrayList<>();
            ArrayList <Integer> even = new ArrayList<>();
            ArrayList <Integer> odd1 = new ArrayList<>();
            ArrayList <Integer> even1 = new ArrayList<>();
            int size = s.nextInt();
            int []arr = new int[size];
            int []arr2 = new int[size]; 
            for(int i=0;i<size;i++){
                arr[i] = s.nextInt();               
                if(arr[i]%2==0)
                    even.add(arr[i]);
                else
                    odd.add(arr[i]);
            }
            for(int i=0;i<size;i++){
                arr2[i] = s.nextInt();               
                if(arr2[i]%2==0)
                    even1.add(arr2[i]);
                else
                    odd1.add(arr2[i]);
            }
            Collections.sort(even);
            Collections.sort(odd);
            int sum = 0;

            int oddSize = Math.min(even.size(),even1.size());
            int evenSize = Math.min(even.size(),even1.size());
            // if()
            for(int i=0;i<Math.max(oddSize,evenSize);i++){
                if(Math.min(even.size(),even1.size())>i)
                    sum+=(even.get(i)+even1.get(i))/2;
                if(Math.min(odd.size(),odd1.size())>i)
                    sum+=odd.get(i)+odd1.get(i);
                else if(i<Math.max(even.size(),even1.size())){
                    if(even.size()>even1.size()){
                        if(odd1.size()>odd.size())
                            sum+=(even.get(i)+odd1.get(i))/2;
                        else    
                            sum+=(even.get(i)+odd.get(i))/2;
                    }
                    else {
                        if(odd1.size()>odd.size())
                            sum+=even.get(i)+odd1.get(i);
                        else    
                            sum+=even.get(i)+odd.get(i);
                    }
                }
                else if (i<(Math.max(odd.size(),odd1.size())))  {
                    if(odd.size()>odd1.size()){
                        if(even.size()>even1.size())
                            sum+=(odd.get(i)+even.get(i))/2;
                        else    
                            sum+=(odd.get(i)+even1.get(i))/2;
                    }
                    else {
                        if(even.size()>even1.size())
                            sum+=(odd1.get(i)+even.get(i))/2;
                        else    
                            sum+=(odd1.get(i)+even1.get(i))/2;
                    }
                }
            }
            sb.append(sum+"\n");
        }
        System.out.println(sb);
    }
}
