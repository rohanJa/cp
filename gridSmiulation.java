// June SECRCEP cookoff
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
// import java.util.Scanner; 
import java.util.StringTokenizer; 
class gridSmiulation{
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
        int testcase=s.nextInt();
        while(testcase-->0){
            int row =s.nextInt(),col = s.nextInt();
            char [][] strArray =new char[row][col];
            int [][] count = new int [row][col];
            int step=1,answer=0;

            for(int i=0;i<row ;i++)
                strArray[i]= (s.nextLine()).toCharArray();
            
            while(step<Math.max(row,col)){
                for(int i=0;i<row;i++){
                    for(int j=0;j<col;j++){
                        if(strArray[i][j]=='#')
                            continue;
                        if(strArray[i][j]=='R'&&j+step<col){
                            if(strArray[i][j+step] =='#')
                                strArray[i][j] = '-';
                            else
                                count[i][j+step]++;
                        }
                        else if(strArray[i][j]=='L'&&j-step>=0){
                            if(strArray[i][j-step]=='#')
                                strArray[i][j] = '-';
                            else
                                count[i][j-step]++;
                        }
                        else if(strArray[i][j]=='D'&&i+step<row){
                            if(strArray[i+step][j]=='#')    
                                strArray[i][j] = '-';
                            else    
                                count[i+step][j]++;
                        }
                        else if(strArray[i][j]=='U'&&i-step>=0){
                            if(strArray[i-step][j]=='#')
                            strArray[i][j] = '-';
                            else
                                count[i-step][j]++;
                        }
                    }
                }
                for(int i=0;i<row;i++){        
                    for(int j=0;j<col;j++){
                        answer+=(count[i][j]*(count[i][j]-1))/2;
                        count[i][j]=0;
                    }    
                }
                step++;
            }
            sb.append(answer+"\n");
        }
        System.out.println(sb);
    }
}