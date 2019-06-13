import java.util.*;

class add{
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        int arr[] =new int[2*arraySize];
        int sum;
        int i;
        System.out.println(arr.length);
        for (i=0;i<2*arraySize;i++){
            arr[i] = sc.nextInt();
        }
        
        for(i=0;i<2*arraySize;){
            sum=0;

            sum = arr[i]+arr[i+1]; 
            i+=2;
            System.out.println(sum);
        }
    }
}