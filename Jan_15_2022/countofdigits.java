import java.util.*;
import java.io.*;
class Solution{
    public static void main(String[ ] args){
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int count = 0;
          while(n!=0){    //123!=0 T , 12!=0 T , 1!=0 T , 0!=0 T
          	count = count+1;  //1 , 1+1=2 , 2+1=3
          	n = n/10;     //12 , 1 , 0
          }
          System.out.println(count);
        }
}
//c+=1 