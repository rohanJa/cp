import java.util.Scanner;
class enormous{
    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int i=0;
        int divdeNumber=sc.nextInt();
        int divident;
        int count=0;
        while(i<n){
            divident=sc.nextInt();
            if(divident%divdeNumber == 0){
                count++;

            }
            i++;
        }
        System.out.println(count);
    }
}