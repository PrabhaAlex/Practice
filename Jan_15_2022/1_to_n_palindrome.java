import java.util.*;
import java.io.*;
class Solution{
    public static void main(String[ ] args){
          Scanner sc = new Scanner(System.in);
          int n  = sc.nextInt();
          int rev = 0;
         /* while(n!=0){
          	int r = n%10;
          	rev = (rev*10)+r;
          	n = n/10;
          }*/
          for(int temp=n;temp!=0;temp=temp/10){
          	int r = temp%10;
          }
          for(int i=0;i<=n;i++){
          	System.out.println(i);
          }
    }
}