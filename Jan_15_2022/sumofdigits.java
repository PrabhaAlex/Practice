import java.util.*;
import java.io.*;
class Solution{
    public static void main(String[ ] args){
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt(); 
          int sum = 0; 
          while(n!=0){  	// 123!=0 t , 12!=0 t, 1!=0 t ,0!=0 f
          	int r = n%10;   // 3 , 2 , 1
          	sum = sum+r;    // 3, 3+2=5 ,5+1 =6
          	n=n/10;			// 12,1,0
          }
          System.out.println(sum);
    }
}