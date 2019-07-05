/**
   Author is Rohan Jain 
   Created at 03/07/2019, 23:34:08
**/

import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;
import java.util.StringTokenizer; 
class segmentTree{
    static int st[];
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
    int queryRange(int n,int qs, int qe){
        if(qs < 0 || qe > n-1 || qs > qe)
            return -1;
        return sumQuery(st,0, n-1, qs, qe, 0); 
    }

    int sumQuery(int []st,int ss,int se,int qs,int qe,int si){

        if(qs<=ss&&qe>=se)
            return st[si];
        if(qs>se||qe<ss)
            return 0;
        int mid = (ss+se)/2;
        return sumQuery(st,ss, mid, qs, qe, (2*si)+1)+sumQuery(st,mid+1, se, qs, qe, (2*si)+2);        
    }

    segmentTree(int arr[],int n){
        int x = (int) (Math.ceil(Math.log(n) / Math.log(2))); 
        int max_size = 2 * (int) Math.pow(2, x) - 1; 
        st = new int[max_size]; // Memory allocation 
        constructSTUtil(arr, 0, n - 1, 0); 
    }
    int constructSTUtil(int []arr, int ss, int se,int si){
        if(ss == se){
            st[si] = arr[ss];
            // System.out.println("st["+si+"] = "+st[si]);
            return  arr[ss];
        }
        int mid;
        mid = (ss+se)/2;
        st[si]=constructSTUtil(arr, ss,mid,(2*si)+1)
        +constructSTUtil(arr,mid+1,se,(2*si)+2);
        // System.out.println("st["+si+"] = "+st[si]);
        return  st[si];
    }

    void updateFunction(int i,int ss,int se,int si,int diff){
        if(i<ss&&i>se)
            return ;
        st[si] += diff; 
        if(se!=ss){
            int mid;
            mid = (ss+se)/2;
            updateFunction(i, ss, mid, (2*si)+1, diff);
            updateFunction(i, mid+1, se, (2*si)+2, diff);
        }
    }

    void update(int []arr,int newVal,int i,int n){
        if(i<0||i>n-1)
            return ;
        int diff ;
        diff = Math.abs(arr[i] - newVal);
        arr[i]  = newVal;

        updateFunction(i,0,n-1,0,diff);
    }
    public static void  main(String[] args) {
        FastReader s =new FastReader();
        int n = s.nextInt();
        int []arr = new int[n];
        
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();        
        for(int i=0;i<n;i++)
            System.out.print(" arr["+i+"]:" + arr[i]+",");
            System.out.println();    
            System.out.println();    
        
        int x = (int) (Math.ceil(Math.log(n) / Math.log(2))); 
        int max_size = 2 * (int) Math.pow(2, x) - 1;    
        
        segmentTree stObj = new segmentTree(arr,n); 
        
        for(int i=0;i<max_size;i++)
            System.out.print(" st["+i+"]:" + st[i]+",");
        System.out.println();    
        System.out.println();    
     
        System.out.println(" queryRange "+stObj.queryRange(n, 1, 3));
        stObj.update(arr,10,1,n);
        System.out.println();    
        
        for(int i=0;i<max_size;i++)
            System.out.print(" st["+i+"]:" + st[i]+",");
            System.out.println();    
            System.out.println();    
        
        System.out.println(" queryRange "+stObj.queryRange(n, 1, 3));
        System.out.println();    
        
        for(int i=0;i<n;i++)
            System.out.print(" arr["+i+"]:" + arr[i]+",");
        System.out.println();    
        //update function after which range query is appiled


    }
}