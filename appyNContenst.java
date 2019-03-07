import java.util.Scanner;
// Appy and Chef are participating in a contest. There are NN problems in this contest; each problem
// has a unique problem code between 11 and NN inclusive. Appy and Chef decided to split the problems 
// to solve between them ― Appy should solve the problems whose problem codes are
// divisible by AA but not divisible by BB, and Chef should solve
// the problems whose problem codes are divisible by BB but not divisible by AA (they decided to not solve the problem
// s whose codes are divisible by both AA and BB).

class appyNContenst{
    public static void main(String []args){
       
       
        Scanner sc = new Scanner(System.in);
        int count,noOfQuestion,i,greaterNumber,number ,number2;
        System.out.println("Enter nunmber of testcases ");
        int testcases=sc.nextInt();
        
        while(testcases>0){
            System.out.println("enter greaterNumber number 1 and 2 noOfQuestion" );
            greaterNumber = sc.nextInt();
            number = sc.nextInt();
            number2 = sc.nextInt(); 
            noOfQuestion = sc.nextInt();
            count=0;
            for(i=0;number*i<=greaterNumber;i++){
                if((number*i)%number2!=0){
                    count--;
                }
                    count++;
            }

            for(i=0;number2*i<=greaterNumber;i++){
                if((number2*i)%number==0){
                    count--;
                }
                count++;                
            }
            System.out.println("value of "+noOfQuestion+noOfQuestion+"value of count is "+count);
            if(count>=noOfQuestion)
                System.out.println("Win");
            else
                System.out.println("Lose");

            testcases--;
        }
    }
}