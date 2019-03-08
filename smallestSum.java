import java.util.Scanner;

class smallestSum{
 
    static int elementSum(int[] array){


        int small,temp,index;
        //length is used for array and all
        //but length() is used for string string Builder

        for(int i=0;i<2;i++){
            small = array[i];
            index = i;
            for(int j=i;j<array.length;j++){
                if(small>array[j]){
                    small = array[j];
                    index = j;
                }
            }
            temp = array[i];
            array[i] = small;
            array[index] = temp;
        }
        return (array[0]+array[1]);
    } 
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int testcase = sc.nextInt();
        while(testcase>0){
            int arraySize =sc.nextInt();
            int []arrayElement = new int[arraySize];
            for(int i=0;i<arraySize;i++){
                arrayElement[i] = sc.nextInt();
            }
            System.out.println(elementSum(arrayElement));
            
            // System.out.println("Array is "+arrayElement);
            // System.out.println("arrayElement[0] is "+arrayElement[0]+" arrayElement[1] is "+arrayElement[1]+" sum is "+(arrayElement[0]+arrayElement[1])); 
            testcase--;
        }
    }
}