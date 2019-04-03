import java.util.*;

class parctice{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();

        while(testcase>0){
            long n = sc.nextLong();
            int compare = sc.nextInt();
            int length = Long.toString(n).length();
            int temp,first,index,sum=0;
            int []arr = new int[length];
            for(int i=0;i<length;i++){
                temp = (int)n%10;
                arr[i] = temp;
                n=n/10;
            }

            for(int i=0;i<length-1;i++){
                first=arr[i];
                index=i;
                for(int j=i+1;j<length;j++){
                    if(first>arr[j]){
                        first=arr[j];
                        index=j;
                    }
                }
                temp=arr[i];
                arr[i]=first;
                arr[index]=temp;
            }
            for(int i=0;i<length;i++){
                if(compare<arr[i])
                    sum=(sum*10)+compare;
                else
                    sum=(sum*10)+arr[i];
            }       
            System.out.println(sum);
            testcase--;    
        }
    }
}