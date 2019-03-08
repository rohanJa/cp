import java.util.Scanner;
// Appy and Chef are participating in a contest. There are NN problems in this contest; each problem
// has a unique problem code between 11 and NN inclusive. Appy and Chef decided to split the problems 
// to solve between them ― Appy should solve the problems whose problem codes are
// divisible by AA but not divisible by BB, and Chef should solve
// the problems whose problem codes are divisible by BB but not divisible by AA (they decided to not solve the problem
// s whose codes are divisible by both AA and BB).

class appyNContenst{

    static long gcd(long a,long b){
        if(b==0)
            return a;
        return gcd(b,a%b);
    }

    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        long count,noOfQuestion,greaterNumber,number ,number2;
        int testcases=sc.nextInt();
        long storeGcd,greaterCount,numberCount,number2Count;
        //long because of the constraint so w euse nextLong() inside of nextInt()
        while(testcases>0){

            greaterNumber = sc.nextInt();
            number = sc.nextLong();
            number2 = sc.nextLong(); 
            noOfQuestion = sc.nextLong();
            
            //it will give L.C.M
            //and multiply by two  as we have two number and it wil occur in both each time  
            storeGcd = (number2*number)/gcd(number,number2);

            greaterCount = 2*(greaterNumber/storeGcd);
            numberCount = greaterNumber/number;
            number2Count = greaterNumber/number2;
            count=(numberCount+number2Count)-greaterCount;
            
            if(count>=noOfQuestion)
                System.out.println("Win");
            else
                System.out.println("Lose");

            testcases--;
        }
    }
}