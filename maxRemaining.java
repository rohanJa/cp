import java.util.Scanner;
import java.util.Arrays;

class maxRemaining{
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        int size =    sc.nextInt();
        int []arr = new int[size];
        int second=Integer.MIN_VALUE,first=Integer.MIN_VALUE;
        for(int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }    
        Arrays.sort(arr);
        if(arr[size-1] == arr[0]){
            System.out.println("0");
        }
        else{
            for (int i = 0; i < size ; i++) 
            { 
                if (arr[i] > first) 
                { 
                    second = first; 
                    first = arr[i]; 
                } 
    
                    second = arr[i]; 

            }
            System.out.println(second%first);                
        }

    }
}