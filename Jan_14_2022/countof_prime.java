import java.util.*;
import java.io.*;
class Solution{
    public static void main(String[ ] args){
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt(); int c=0;
          for(int i=1;i<=n;i++){
          	if(n%i == 0){
          		c+=1;
          	}
          }
          		for(int j=1;j<=n;j++){
          			if(c == 2){
          			System.out.print(j+" ");
          			}
      	        }
        }
    }
