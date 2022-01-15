import java.util.*;
import java.io.*;
class Solution{
    public static void main(String[ ] args){
          Scanner sc = new Scanner(System.in);
          float p = sc.nextFloat();
          float r = sc.nextFloat();
          int t = sc.nextInt();
          float c = p*Math.pow(1+r/100,t);
    		System.out.println(c);
    }
}