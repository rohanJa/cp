import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;


class triangleSum{

    private static final int _0 = 0;

    public static void main(String[] args) throws java.io.IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // int length = Integer.parseInt(br.readLine());
        Scanner sc = new Scanner(System.in);
        

        int i, j;
        int numberOfTime = sc.nextInt();

        while(numberOfTime>0){
            System.out.println("numberOfTime "+numberOfTime);
            
            int length = sc.nextInt();
            int[][] arrayValue = new int[length][length];
            
            for (i = 0; i < length; i++) {
            for (j = 0; j <= i; j++) {
                // arrayValue[i][j] = Integer.parseInt(br.readLine());
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
        System.out.println("Answer is "+arrayValue[0][0]);
     numberOfTime--;
    }
    }
}