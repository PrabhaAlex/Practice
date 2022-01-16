import java.util.*;
import java.io.*;
class Solution{
    public static void main(String[ ] args){
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int sum = 0,sum1 = 0;
          while(n!=0){     // 241!=0 T , 24!=0 T , 2!=0 T
          	int r = n%10;  // 1 , 4 , 2
          	if(r%2 == 0){  // F , T , T
          		sum = sum+r; // 4 , 4+2 = 6 --> sum=6
          	}
          	else{ // t
          		sum1 = sum1+r;  // 1 --> sum1=1
          	}
          	n = n/10; // 24 , 2
          }
          System.out.println("even "+sum);
          System.out.println("odd "+sum1);
    }
}