import java.util.Scanner;

class addNumber{
    public static void main(String []args){

        int sum,i,temp;
        Scanner sc = new Scanner(System.in);
        int numberIteration = sc.nextInt();
        int []num = new int[numberIteration];

        for(i=0;i<numberIteration;i++){
            num[i] = sc.nextInt();    
        }        

        for(i=0;i<numberIteration;i++){
            sum=0;
            while(num[i]!=0){
                temp=num[i]%10;
                sum+=temp;
                num[i]=num[i]/10;
            }
            System.out.println(sum);
        }
        
    }
}