import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
// import java.util.Scanner; 
import java.util.StringTokenizer; 
class drinks{
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
    // static int demand (StringBuilder sb,ArrayList<Integer> arr,int d,int f,int b){
    //     int val;
    //     if(arr.get(d-1)!=0){
    //         val=arr.get(d-1)-1;
    //         arr.remove(d-1);
    //         arr.add(d-1,val);
    //         sb.append(d+" ");
    //         System.out.println(arr);

    //     return f;
    //     }
    //     else{
    //         val= Collections.max(arr);
    //         int index = arr.indexOf(val);
    //         // arr.remove(index);
    //         // arr.add(index,val-1);
    //         sb.append((index+1)+" ");
    //         arr.add(index,arr.get(index)-1);
    //         System.out.println(arr.size()+" "+index);
    //         return b;
    //     }
    // }
    public static void  main(String[] args) {
        FastReader s =new FastReader();
        int testcase = s.nextInt();
        StringBuilder sbnew = new StringBuilder("");
        while(testcase-->0){
            StringBuilder sb = new StringBuilder("");
            int n = s.nextInt(),m= s.nextInt(),k;
            long totalMoney=0;
            int []drinkQuantity = new int[m];
            int []countDrinks = new int [m];
            int [][]customer = new int[n][3];
            Queue <Integer> a= new LinkedList<>();
            
            for(int i=0;i<m;i++)
                drinkQuantity[i] = s.nextInt();
            
            for(int i= 0;i<n;i++){
                customer[i][0] = s.nextInt()-1;
                customer[i][1] = s.nextInt();
                customer[i][2] = s.nextInt();
                countDrinks[customer[i][0]]++;
            }

            for(int i=0;i<m;i++)
                if(drinkQuantity[i]>countDrinks[i])
                    a.offer(i);   //better than add as it return false if the queue is full mo need to take care of the exception 
        
            for(int i=0;i<n;i++){
                if(drinkQuantity[customer[i][0]]>0){
                    drinkQuantity[customer[i][0]]--;
                    totalMoney+=customer[i][1];
                    sb.append((customer[i][0]+1)+" ");
                    countDrinks[customer[i][0]]--;
                }
                else{   //when drinks are not available
                    k = a.peek();
                    drinkQuantity[k]--;
                    totalMoney+=customer[i][2];
                    if(drinkQuantity[k]==countDrinks[k])
                        a.poll();
                    sb.append((k+1)+" ");   
                }
            }
            sbnew.append(totalMoney+"\n"+sb+"\n");

            // int n = s.nextInt(),m= s.nextInt();
            // ArrayList <Integer> arr = new ArrayList<Integer>();
            // StringBuilder sb =new StringBuilder("");
            // for(int i=0;i<m;i++){
            //     arr.add(s.nextInt());
            // }
            // int sum=0,d,f,b;
            // for(int i=0;i<n;i++){
            //     d=s.nextInt();
            //     f=s.nextInt();
            //     b=s.nextInt();
            //     sum+=demand(sb,arr,d,f,b);
            // }
            // sbnew.append(sum+"\n"+sb+"\n");
        }
        System.out.println(sbnew);
    }
}