import java.util.Scanner;

class bgInt{

    // static long modulo(long a,long b){
    //     if(b==0)
    //         return 1;
    //     else if(b==1){
    //         return a;
    //     }
    //     else if (b%2==0)
    //         return modulo(a*a,b/2);  
    //     else
    //         return a*modulo(a*a,b/2);
    // }

    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        // int testcase = sc.nextInt();
        // StringBuilder sb = new StringBuilder("");
        // while(testcase-->0){
        //     long power = sc.nextLong();
        //     sb.append((10*modulo(2,power-1))+"\n");  
        // }
        // System.out.println(sb);
        long num =sc.nextLong();
        
        System.out.println(num/2);
    
    
    }
}
