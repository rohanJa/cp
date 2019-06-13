import java.util.*;


class atm{
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        double withdrawnMoney = sc.nextInt();
        double balance = sc.nextInt();

        if (withdrawnMoney % 5== 0 && withdrawnMoney <= balance -0.05){
            balance = balance -(withdrawnMoney+0.05);
        }
        System.out.println(balance);
    }
}  