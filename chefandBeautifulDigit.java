import java.util.Scanner;

class chefandBeautifulDigit{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        // int i=0,length=(int) (Math.log10(number) + 1);

        while(testcase>0){
            int i=0;
            long number = sc.nextLong();
            int compare = sc.nextInt();
            long temp,number2 = number;
            while(number>0){
                temp = number%10;
                System.out.println("temp is "+temp);
                if(temp>compare){
                    System.out.println("Value of temp is "+(temp-compare)*(Math.pow(10,i)));
                    number2 -=Math.round((temp-compare)*(Math.pow(10,i)));
                }
                i++;
                number=number/10;
            }
            System.out.println("value of number 2 is "+number2);
            testcase--;
        }
    }
}