import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;


class triangleSum{
    public static void main(String[] args) throws java.io.IOException {
        
        Scanner sc = new Scanner(System.in);
        int i, j;
        int numberOfTime = sc.nextInt();

        while(numberOfTime>0){   
            int length = sc.nextInt();
            int[][] arrayValue = new int[length][length];
            
            for (i = 0; i < length; i++) {
            for (j = 0; j <= i; j++) {
                arrayValue[i][j] = sc.nextInt();
            }
        }

        for (i = length - 2; i >= 0; i--) {
            for (j = i; j >= 0; j--) {
              
                if(arrayValue[i+1][j+1]>arrayValue[i+1][j])
                    arrayValue[i][j]+=arrayValue[i+1][j+1];
                else
                    arrayValue[i][j]+=arrayValue[i+1][j];
            }
        }
     numberOfTime--;
    }
    }
}
