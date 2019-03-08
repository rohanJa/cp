import java.util.Scanner;

class ambigousPermutation{

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int flag=1;
        while(flag){
            int arraySize = sc.nextInt();
            int checker = 1;
            if(arraySize == 0)
                break;
            int []arrrayElement = new int[arraySize];
            for(int i=0;i<arraySize;i++){
                arrrayElement[i] = sc.nextInt();
            }
            for(int i=0;i<arraySize;i++){
                if(arrrayElement[arrrayElement[i]] != i+1)
                    checker =0;
            }
            if(checker == 0)
                System.out.println("ambiguous");
            else                
                System.out.println("not ambiguous");
        }

    }
}