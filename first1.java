import java.util.*;

class first{
    public static void main(String []args){
       Scanner sc = new Scanner(System.in);
       
       int data =sc.nextInt();
       sc.close();
       if(data%2 == 0){
           System.out.println(data+" is a even number ");
       }
       else{
           System.out.println(data+" is odd number");
       }

    }
}