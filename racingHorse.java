import java.util.*;

class racingHorse{

    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
	    int testcase = sc.nextInt();
	    long minSum=0;
	    
	    while(testcase>0){
	        int elementNumber = sc.nextInt();
	        long []arrayElement = new long[elementNumber];
	        for(int i=0;i<elementNumber;i++){
	            arrayElement[i] = sc.nextLong();
	        }

            minSum = Math.abs(arrayElement[0]-arrayElement[1]);
	        
	        for(int i=0;i<elementNumber-1;i++){
	           for(int j=i+1;j<elementNumber;j++){
	                if(minSum>Math.abs(arrayElement[i]-arrayElement[j])){
	                    minSum=Math.abs(arrayElement[i]-arrayElement[j]);
                        System.out.println(minSum);
                    }
	           }
	        }
	    testcase--;    
	        
	    }
    
	    System.out.println(minSum);
	    
    }
}