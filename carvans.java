import java.util.Scanner;

class carvans{
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        int testcases = sc.nextInt();
        
        while(testcases>0){
            int count=0;
            int numberCars=sc.nextInt();
            int []arr = new int[numberCars];    
            for(int i=0;i<numberCars;i++)
                arr[i] = sc.nextInt();
            int firstElement=arr[0];
            for(int i=0;i<numberCars;i++){
                if(arr[i]<firstElement){
                    firstElement =arr[i];
                } 
                if(arr[i]<=firstElement){
                    count++;
                }
            }
            System.out.println("count is "+count);
            testcases--;
        }
    }
}