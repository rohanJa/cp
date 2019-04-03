import java.util.*;

class payUp{
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        int size = sc.nextInt();
        int [] array = new int[size];

        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));


        int num = sc.nextInt();
        int flag=0,index=-1;
        for(int i=0;i<size;i++){
            if(array[i]<num){
                index=i;
            }
            else if (array[i]==num){
                flag=1;
            }
        }
        int k=0,sum=0,r=index,l=0;
        if(index == -1){
            System.out.println("Not Found");
        }
        else if(flag==1){
            System.out.println("Found");
        }
        else {
            for(int i=0;i<index+1;i++){
                sum=array[i];
            while(l<r+1){
                for(int j=l+1;j<index+1;j++){
                    sum+=array[j+k];   
                    if(num>=sum){
                        System.out.println(sum);
                    }    
                }
                k++;
                l++;
            }
        }
        }

        // for(int i=0;i<size;)




    }
}