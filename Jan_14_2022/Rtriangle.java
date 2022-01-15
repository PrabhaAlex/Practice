import java.util.*;
import java.io.*;
class Solution{
    public static void main(String[ ] args){
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          for(int i=1;i<=n;i++){
          	for(int j=1;j<=i;j++) //i=1 j=1 | i=2 j=1,2 | i=3 j=1,2,3
          		System.out.print(j);
          	System.out.println();
          }
    }
}
//  1
//  1 2
//  1 2 3