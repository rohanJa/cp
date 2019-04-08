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
            int []xpos = new int[pos];
            int []ypos = new int[pos];
            // for(int i=0;i<m;i++){
            //     for(int j=0;j<n;j++){
            //         System.out.print(arr[i][j]+" ");
            //     }
            //     System.out.println();
            // }
    
            for(int i=0;i<pos;i++){
                xpos[i] = sc.nextInt();   
                ypos[i] = sc.nextInt();
                arr[xpos[i]-1][ypos[i]-1] = 1;
            }
            int count =0;
            
            for(int i=0;i<pos;i++){
                if(arr[xpos[i]][ypos[i]] == 1){
                    if(ypos[i]==0){
                        count++;
                    }
                    else if(ypos[i]>0&&arr[xpos[i]][ypos[i]-1]==0){
                        count++;
                    }
                    if(ypos[i]==n-1){
                        count++;        
                    }
                    else if(ypos[i]!=n-1 && arr[xpos[i]][ypos[i]+1] == 0){
                        count++;        
                    }
                }
            }

            for(int i=0;i<pos;i++){
                if(arr[xpos[i]][ypos[i]] == 1){
                    if(xpos[i]==m-1){
                        count++;
                    }
                    else if(xpos[i] != m-1 && arr[xpos[i]+1][ypos[i]] == 0){
                        count++;        
                    }
                    if(xpos[i]==0){
                        count++;        
                    }
                    else if(xpos[i]>0 & arr[xpos[i]-1][ypos[i]] == 0){
                        count++;
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