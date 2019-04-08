import java.util.Scanner;

class farm{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while(testcase>0){
            int m = sc.nextInt();
            int n = sc.nextInt();    
            int pos = sc.nextInt();
            int [][]arr = new int[m][n];

            // for(int i=0;i<m;i++){
            //     for(int j=0;j<n;j++){
            //         System.out.print(arr[i][j]+" ");
            //     }
            //     System.out.println();
            // }
    
            for(int i=0;i<pos;i++){
                int j = sc.nextInt();   
                int k = sc.nextInt();
                arr[j-1][k-1] = 1;
            }
            int count =0;
            
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(arr[i][j] == 1){
                        if(j==0){
                            count++;
                        }
                        else if(j>0&&arr[i][j-1]==0){
                            count++;
                        }
                        if(j==n-1){
                            count++;        
                        }
                        else if(j!=n-1 && arr[i][j+1] == 0){
                            count++;        
                        }
                    }
                }
            }

            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(arr[i][j] == 1){
                        if(i==m-1){
                            count++;
                        }
                        else if(i != m-1 && arr[i+1][j] == 0){
                            count++;        
                        }
                        if(i==0){
                            count++;        
                        }
                        else if(i>0 & arr[i-1][j] == 0){
                            count++;
                        }
                    }
                }
            }
            System.out.println("Value of count is "+count);
        testcase--;
        }
        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }
 
    }
}