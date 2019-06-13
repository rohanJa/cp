// import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Iterator;

// import java.util.TreeSet;
// import java.util.Set;
// import java.util.List;
// import java.util.ArrayList;
// import java.util.Collections;

class gcdandsum{
//   static int gcd(int a, int b) 
//         { 
//             if (a == 0) 
//                 return b; 
//             return gcd(b % a, a); 
//         } 
      
//         // Function to find gcd of array of 
//         // numbers 
//         static int findGCD(int arr[], int n) 
//         { 
//             int result = arr[0]; 
//             for (int i = 1; i < n; i++) 
//                 result = gcd(arr[i], result); 
      
//             return result; 
//         } 
      
//             int arr[] = { 2, 4, 6, 8, 16 }; 
//             int n = arr.length; 
//             System.out.println(findGCD(arr, n)); 
        // } 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashSet<String> hs = new HashSet<String>();
        String data;
        for(int i=0;i<10;i++){
            data = sc.nextLine();
            hs.add(data);
        }
        int []arr = new int[hs.size()];
        Iterator itr = hs.iterator();
        int i=0;
        while(itr.hasNext())
        {
            arr[i]=Integer.parseInt((itr.next()).toString());
            i++;
        }
        Arrays.sort(arr);
        for(int j=0;j<hs.size();j++){
        System.out.println(arr[j]);
        }
    }
}