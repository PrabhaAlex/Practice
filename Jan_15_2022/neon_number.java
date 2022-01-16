import java.util.*;
import java.io.*;
class Solution{
    public static void main(String[ ] args){
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();     // 9
          int sum=0,a=0,temp = n;
          a = (int)Math.pow(n,2); //9^2=81 -->a=81
          while(a!=0){
            int r = a%10;        // 1 , 8
          	sum = sum+r;         // 1 ,1+8=9
          	a=a/10;              // 8 , 0
          }
          if(temp == sum){
         		 System.out.println("neon number");
          }
      	  else{
      			System.out.println("not a neon number");
          }
    }
}