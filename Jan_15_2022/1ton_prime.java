import java.util.*;
import java.io.*;
class Solution{
    public static void main(String[ ] args){
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          for(int j=2;j<=n;j++) {
          boolean flag = true;

          for(int i=2;i<=Math.sqrt(j);i++){
          	if(j%i == 0){
          		flag  = false;
          		break;
          	}
          }
          if(flag){
          	System.out.println(j);
          }
          
        /*  for(int i=1;i<=n;i++){ 			 // time complexity - O(n)
          	for(int j=2;j<=Math.sqrt(i);j++) // time complexity - O(log n)*/
        }
          	
        
    }
}
