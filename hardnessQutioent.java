import java.io.BufferedReader;
import java.util.*;

import java.io.InputStreamReader;

class hardnessQutioent{
    public static void main(String []args)throws java.io.IOException{
        Scanner sc = new Scanner(System.in);
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int noOfGum = Integer.parseInt(br.readLine());
        int gumHardness = Integer.parseInt(br.readLine());
        int eatCounter=0;
        int gumHard;
        for(int i=0;i<noOfGum;i++){
            gumHard = Integer.parseInt(br.readLine());
            if(gumHard<=gumHardness)
                eatCounter++;

        }
        System.out.println(eatCounter);




    }
}