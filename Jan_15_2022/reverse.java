import java.util.*;
import java.io.*;
class Solution{
    public static void main(String[ ] args){
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int rev = 0;
          while(n!=0){  		 // 123!=0 T , 12!=0 T ,1!=0 T
          	int r = n%10;   	 // 3 , 2 , 1
          	rev = (rev*10)+r;    // 3, 32 ,321                                                                          r; // 3 , 32 
          	n = n/10; 			 // 12 ,1 ,0
          }
          System.out.println(rev);
      }
      
    }
