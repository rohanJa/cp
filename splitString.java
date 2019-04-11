import java.util.Scanner;

class splitScanner{

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String c = sc.nextLine();

        // String[] st = s.split(c);
        // System.out.println("Split String is "+st[0]+" String 2 is "+st[1]);
        // StringBuilder r = new StringBuilder();
        // r.append(s);
        // r.reverse();
        // System.out.println("Reverse if string is "+r);

        // if(r.contains()){

        // }
        int count=0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                System.out.println(s.substring(i, j));
                if(s.substring(i, j).contains(c)){
                    count++;
                }
            }
        }
        System.out.println("Count is "+count);
        // System.out.println(s.substring(3,5));
    }
}