import java.util.HashMap;
import java.util.Scanner;

class attendence{
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int testcase = sc.nextInt();
    StringBuilder sb = new StringBuilder("");
    while(testcase-->0){
      int stringNumber = sc.nextInt();
      HashMap<String,Integer> hm =new HashMap<>();
      String str[] = new String[stringNumber];
      sc.nextLine();   
      for(int i=0;i<stringNumber;i++){
        str[i] = sc.nextLine();
  
        String []strSplit =str[i].split(" ");
        if(hm.containsKey(strSplit[0])){
          hm.put(strSplit[0],hm.get(strSplit[0])+1);
        }
        else{     
          hm.put(strSplit[0],1);
        }
      }
      // System.out.println("hm start");
      // System.out.println("hm size "+hm.size());
      // System.out.println("hm key is "+hm.keySet());
      for(int i=0;i<stringNumber;i++){
        String []strSplit =str[i].split(" ");
        System.out.println(hm.get(strSplit[0]));    
      }
      // System.out.println("hm end");
      // String []str2 = new String[2];
      for(int i=0;i<stringNumber;i++){
        String []str2=str[i].split(" ");
        if(hm.get(str2[0])==1){
          sb.append(str2[0]);
        }
        else{
          sb.append(str[i]);
        }
        sb.append("\n");
      }
    }
    System.out.println(sb);
  }
}