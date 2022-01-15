import java.util.*;
import java.io.*;
class Solution{
    public static void main(String[ ] args){
          Scanner sc = new Scanner(System.in);
          int a[] = new int[6];
          for(int i=0;i<6;i++){
          	a[i] = sc.nextInt();
          }
          Arrays.sort(a);
          System.out.println(a[5]+" ");
    }
}