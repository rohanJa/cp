import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;
import java.io.InputStreamReader;

class playerWin{

    public static void main(String [] args)throws IOException{
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numberTime = Integer.parseInt(br.readLine());

        int i,scoreA,scoreB,lead=0,playerName=1;
       
        for (i=0;i<numberTime;i++){
            String []x =  br.readLine().split(" ");
            scoreA = Integer.parseInt(x[0]);
            scoreB = Integer.parseInt(x[1]);
            if(scoreA>scoreB){
                if(lead<(scoreA-scoreB)){
                    lead = scoreA-scoreB;
                    playerName = 1;
                    System.out.println("leadA "+lead);
                }
            }
            else{
                if(lead<(scoreA-scoreB)){
                    lead = scoreB-scoreA;
                    playerName = 2;
                    System.out.println("leadB "+lead);                    
                }
            }
        }
       
 
       
        // if(leadA>leadB){
        //     playerName=1;
        //     lead=leadA;
        // }
        // else{
        //     playerName=2;
        //     lead=leadB;
        // }  
        System.out.println(playerName+" "+lead);     
    }
}
