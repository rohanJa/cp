/**
   Author is Rohan Jain 
   Created at 02/07/2019, 23:44:39
**/

import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;
import java.util.StringTokenizer; 
class segementTree{
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
    static int []tree;
    
    segementTree(int []arr,int n){
      build()      
    }
    void buildTree(int node,int start,int end,int []arr ){
        if(start == end)
            tree[node] = arr[start];

        int mid = (start+end)/2;
        buildTree(2*node, start, mid,arr);    
        buildTree((2*node)+1, mid+1, end,arr);
        tree[node] = tree[2*node] +tree[(2*node)+1];
    }


    public static void  main(String[] args) {
        FastReader s =new FastReader();
        int size = s.nextInt();
        int size2 = (int)(2 *(Math.pow(2,(Math.ceil(Math.log(size))))) -1);
        tree = new int[ size2];
        int []arr = new int[size];
        segmentTree stObj = new segmentTree(arr,size);
        for(int i=0;i<size;i++) {
            arr[i]=s.nextInt();
        }


        stObj.builds(1,0,size,arr);
        for(int i=0;i<(size2);i++)
            System.out.println("arr["+i+"] = "+tree[i]);
    }
}