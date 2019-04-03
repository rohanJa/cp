import java.util.Scanner;

class buyingSweets{
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        while(testcases>0){
            int n = sc.nextInt();
            int eachCost = sc.nextInt();
            int arr ;    
            int small = Integer.MAX_VALUE;
            int sum=0,quiotent,quiotent2; 
            
            for(int i=0;i<n;i++){
                arr = sc.nextInt();
                if(arr<small){
                    small = arr;
                }
                sum+=arr;
            }
            
            quiotent = sum/eachCost;
            quiotent2 = (sum-small)/eachCost;

            if(quiotent2 == quiotent){
                System.out.println("-1");
            }
            else{   
                System.out.println(quiotent);
            }
            testcases--;
        }
    }
}