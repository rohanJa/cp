// June SECRCEP cookoff
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
// import java.util.Scanner; 
import java.util.StringTokenizer; 
class raceTime{
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
        // int distance = s.nextInt();
        int player1 = s.nextInt(),player2 = s.nextInt();
        float answer ;
        float player1Pos= s.nextInt(),player2Pos=s.nextInt();       
        int diffVelo = player1-player2;
        int time = player1Pos/player1;

        answer=((time*player2)/diffVelo)-time;
        System.out.println(answer);
 
    }
}