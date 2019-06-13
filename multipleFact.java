import java.util.*;
class multipleFact{
    static int clacFactorial(int n){
       if(n==1){
           return 1;
       } 
       else
        return n*clacFactorial(n-1);
    }


    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int numberFactorial = sc.nextInt();
        int i;
        int []factorialNumber = new int[numberFactorial];
        for(i=0;i<numberFactorial;i++){
            factorialNumber[i]= sc.nextInt();
        }   
        for(i=0;i<numberFactorial;i++){
             System.out.println(clacFactorial(factorialNumber[i]));   
        }
    }
}