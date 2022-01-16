import java.util.*;
import java.io.*;
class Solution{
    public static void main(String[ ] args){
          Scanner sc = new Scanner(System.in);
          int n =sc.nextInt();
          int sum = 0 , temp = n;
          while(n>0){   // 145>0 T, 14>0 T, 1>0 T , 0>0 F
         		 int r = n%10;
          		 long fact = 1;           // 5 , 4 , 1
          for(int i=1;i<=r;i++){
          		fact = fact*i;    // 5! = 120 , 4!= 24 , 1! = 1
          	}
          			sum = sum+(int)fact;  // 120 , 144 , 145
          			n = n/10;             // 14 , 1 ,0
            }
          if(sum == temp){
          	System.out.println("perfect number");
          }
          else{
          	System.out.println("not a perfect number");
          }
      
    }
}