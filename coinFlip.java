import java.util.*;


class coinFlip{

    public static void main(String []args){

        Scanner sc = new Scanner(System.in);    
        int testcase=sc.nextInt();
        int state=sc.nextInt();
        int coin=sc.nextInt();
        int fstate=sc.nextInt();
        int number;
        while(testcase>0){
            if(state == fstate){
                number=coin/2;
            }
            else{
                number = coin/2;
                number+=1;
            }
            System.out.println(number);
        }
    }
}