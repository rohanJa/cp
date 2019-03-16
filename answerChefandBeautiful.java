import java.io.*;
import java.util.*;
class answerChefandBeautiful
{
 public static void main(String[] args)
{
    int i,j,count,flash,y;
  Scanner d=new Scanner(System.in);
  int m=d.nextInt();
  for(i=0;i<m;i++)
  {
      String n=d.next();
      char k=d.next().charAt(0);
      char b[]=n.toCharArray();
     Arrays.sort(b);
     int x=0;
     count=0;
     for(int l=0;l<(n.length())&&x<n.length();l++)
     {  if(k>(b[l])){
         flash=0;
         y=x;
         while(y<n.length()&&flash==0)
         {
             if(b[l]==n.charAt(y))
             {
                 flash=1;
                 System.out.print(b[l]);
                 x=y+1;
                 count++;
             }
             else
             {
                 y++;
             }}
         }
     }
     int z=n.length()-count;
     for(j=0;j<z;j++)
     {
         System.out.print(k);
     }
     System.out.println();
   }
}
}