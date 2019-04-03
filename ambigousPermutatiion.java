import java.util.Scanner;

class ambigousPermutation{

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        boolean flag=true;
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
                // System.out.println("arrrayElement[arrrayElement[i]-1] "+arrrayElement[arrrayElement[i]-1]+" i+1 "+(i+1));
                if(arrrayElement[arrrayElement[i]-1] != i+1){
                    checker = 0;
                    break;
                }
            }
            if(checker == 0)
                System.out.println("not ambiguous");
            else                
                System.out.println("ambiguous");
        }

    }
}