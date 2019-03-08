import java.util.Scanner;

class chefRecipe{

    public static void main(String []args){
        
        Scanner sc =new Scanner(System.in);
        int testcase = sc.nextInt();
        while(testcase>0){
        
        int arraySize = sc.nextInt();
        int []arrayElement = new int[arraySize];
        for(int i=0;i<arraySize;i++){
            arrayElement[i] = sc.nextInt();
        }

        int small = arrayElement[0];

        for(int i=1;i<arraySize;i++){
            if (small == 1)
                break;
            else if(small>arrayElement[i])    
                small = arrayElement[i];
        }
        int  flag=0;
        if (small == 1 ){
            for(int i=0;i<arraySize;i++){
                System.out.print(arrayElement[i]+" ");
            }
        }
        else{
            for(int i=0;i<arraySize;i++){
                if (arrayElement[i]%small != 0)
                   flag=1;
            }
            if(flag == 1){
                for(int i=0;i<arraySize;i++){
                    System.out.print(arrayElement[i]+" ");
                }
            }
            else{
                for(int i=0;i<arraySize;i++){
                    System.out.print(arrayElement[i]/small+" ");
                }
            }
        }
        System.out.println();
        testcase--;
    }
    }
}