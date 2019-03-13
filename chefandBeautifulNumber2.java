import java.util.Scanner;
class codechef1{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int len = Integer.toString(n).length();
        int len1=len-1,j=len;
        System.out.println("Length is "+len);
        int []arr = new int[len];
        int temp,min =Integer.MAX_VALUE,index=0;
        int i=0;
        int number2=n;
        int compare = sc.nextInt();
       
        while(n>0){
            temp=n%10;
            arr[i]=temp;
            if(min>=temp){
                index=i;
                min=temp;
            }
            i++;
            n/=10;
        }

        System.out.println("Value of min is "+min+" and index of of the samllest number is "+(len-index-1));
        int sum=0,d;
        if(min >= compare){
            while(len>0){
                sum=compare+sum*10;
                len--;
            }
        }
        else{
            while(len1>=0){
                System.out.println("arr[["+len1+"] "+arr[len1]);
                if(arr[len1]>=compare||arr[len1]>min){
                    sum=(int)(arr[len1]*Math.pow(10,(j-1)));   
                    System.out.println("sum in power is "+sum);
                    sum = number2-sum;
                    d=sum;
                    sum*=10;
                    sum+=compare;
                    number2=sum;
                    // number2/=10;
                    System.out.println("sum in while loop is "+sum);
                    System.out.println("number2 "+number2);
                }
                else
                    j--;
                len1--;
            }
        }
        String inString= String.valueOf(sum);
        String outString="";
        for (char digit : inString.toCharArray()) { // cycle through every char 
            if(digit!='0') { // if it is not a zero
             outString+=digit; // append it to the resultString
            }
        }
        
        System.out.println("sum is "+sum);
        System.out.println("outString is "+outString);
    
    }
}
