import java.util.*;
import java.io.*;
class Solution{
    public static void main(String[ ] args){
          Scanner sc = new Scanner(System.in);
          int n  = sc.nextInt();
          for(int i=1;i<=n;i++){   // n=153
          int temp = i,sum=0,count=0;
          int x= temp;
          while(x!=0){  
          	int r = x%10;
          	count = count+1;
          	x = x/10; 
          }
          while(temp!=0){
          	int r = temp%10;
          	sum = sum+(int)Math.pow(r,count);
          	temp = temp/10;
          }
          if(sum == i){
          	System.out.println(i);
          }
      }
    }
}