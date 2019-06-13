import java.util.*;
class ascending{
    public static void main(String []args) {
        Scanner sc =new Scanner(System.in);
        int arraySize =sc.nextInt();
        int []array=new int[arraySize];
        // int []tempArray=new int[arraySize];
        int i,index,j,temp;
        
        for(i=0;i<arraySize;i++){
            array[i] = sc.nextInt();

        }

        // temp=array[0];
        for(i=0;i<arraySize-1;i++){
            index =i;
            for(j=i+1;j<arraySize;j++){
                
                if(array[i]>array[j]){
                    index=j;
                }
            }
            temp = array[index];
            array[index] = array[i];
            array[i] =temp ;
        
        }
        for(i=0;i<arraySize;i++){
            System.out.println(array[i]);
        }
    }
}