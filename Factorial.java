import java.util.Scanner;

class Factorial{


    public static void main(String [] args){


        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
       
        while(testcase>0){
            int i=1,sum=0;
            int element = sc.nextInt();  
            long number=5;
            while(number<=element)
            {
                number=Math.round(Math.pow(5,i));
                sum+=element/number;
                i++;
            }
            System.out.println(sum);
            testcase--;
        }
    }
    }
