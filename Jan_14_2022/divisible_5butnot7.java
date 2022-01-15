import java.util.*;
import java.io.*;
class Solution{
    public static void main(String[ ] args){
          Scanner sc = new Scanner(System.in);
          int a = sc.nextInt();
          if(a%5==0 && a%7!=0){
          	System.out.println("YES");
          }else{
          	System.out.println("NO");
          }
    }
}