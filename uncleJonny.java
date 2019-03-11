import java.util.Scanner;
import java.util.Arrays;
class uncleJhonny{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while(testcase>0){
            int arraySize = sc.nextInt();
            long []arrayElement = new long[arraySize];
            for(int i=0;i<arraySize;i++){
                arrayElement[i] = sc.nextLong();
            }

            int elementIndex = sc.nextInt();
            long element;
            element = arrayElement[elementIndex-1];
            Arrays.sort(arrayElement);

            for(int i=0;i<arraySize;i++){ 
                if(element == arrayElement[i]){
                    System.out.println((i+1));
                    break;
                }
            }
            testcase--;
        }
    }
}