import java.util.Scanner;
// Appy and Chef are participating in a contest. There are NN problems in this contest; each problem
// has a unique problem code between 11 and NN inclusive. Appy and Chef decided to split the problems 
// to solve between them ― Appy should solve the problems whose problem codes are
// divisible by AA but not divisible by BB, and Chef should solve
// the problems whose problem codes are divisible by BB but not divisible by AA (they decided to not solve the problem
// s whose codes are divisible by both AA and BB).

class appyNContenst{
    static int gcd(int a,int b){
        if(b==0)
            return a;
        return gcd(b,a%b);
    }

    public static void main(String []args){

           
       
        Scanner sc = new Scanner(System.in);
        int count,noOfQuestion,i,greaterNumber,number ,number2;
        int testcases=sc.nextInt();
        int storeGcd;   
        int greaterCount,numberCount,number2Count;
        while(testcases>0){
            greaterNumber = sc.nextInt();
            number = sc.nextInt();
            number2 = sc.nextInt(); 
            noOfQuestion = sc.nextInt();
            storeGcd = (number2*number)/gcd(number,number2);
            System.out.println(storeGcd);   
            greaterCount = 2*(greaterNumber/storeGcd);
            System.out.println("greaterCount "+greaterCount);
            numberCount = greaterNumber/number;
            System.out.println("numberCount "+numberCount);
            number2Count = greaterNumber/number2;
            System.out.println("number2Count "+number2Count);
            count=(numberCount+number2Count)-greaterCount;
            System.out.println("count "+count);
            if(count>=noOfQuestion)
                System.out.println("Win");
            else
                System.out.println("Lose");

            testcases--;
        }
    }
}