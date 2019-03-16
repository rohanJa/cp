/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc =new Scanner(System.in);
        int testcase = sc.nextInt();
        while(testcase>0){
        
        int arraySize = sc.nextInt();
        int []arrayElement = new int[arraySize];
        for(int i=0;i<arraySize;i++){
            arrayElement[i] = sc.nextInt();
        }

        int small = arrayElement[0];
        if (small == 1 ){
            for(int i=0;i<arraySize;i++){
                System.out.print(arrayElement[i]+" ");
            }
        }
        else if(small!=1){
            for(int i=1;i<arraySize;i++){
                if (small == 1)
                    break;
                else if(small>arrayElement[i])    
                    small = arrayElement[i];
            }
        
            int flag=1;
            while(small>1&&flag==1){

                for(int i=0;i<arraySize;i++){
                    if (arrayElement[i]%small != 0){
                        small--;
                       flag=1;
                        break;
                    }
                    else{
                        flag=0;
                    }
                }

            }
            
            System.out.println("small is "+small+" flag is "+flag);
            if(flag == 1){
                for(int i=0;i<arraySize;i++){
                    System.out.print(arrayElement[i]+" ");
                 }
            }
            else{
                for(int i=0;i<arraySize;i++){
                    System.out.print(arrayElement[i]/small+" ");
                }
            }
        }
        System.out.println();
        testcase--;
    }		
	}
}
