import java.util.*;
import java.io.*;
class Solution{
    public static void main(String[ ] args){
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt(); 
          int c = 0,sum=0,temp = n,x = temp;
          while(n!=0){     	// 1532!=0 T , 153!=0 T , 15!=0 T ,1!=0 T , 0!=0 F
            c = c+1;        // 1 ,1+1=2 ,2+1=3 ,3+1=4
          	n = n/10; 		// 153 , 15 , 1, 0
          	}     
 		    //for(temp = n;temp!=0;temp=temp/10){ // 1532!=0 T , 153!=0 T , 15!=0 T , 1!=0 T
 		    while(temp!=0){
 		    int r = temp%10;       				    // 2 , 3 , 5 , 1
            int s =(int)Math.pow(r,c);		        //2^4 = 16 , 3^4 = 81 , 5^4 = 625 , 1^4=1
          	sum = sum+s;
          	temp=temp/10;      				    // 16 , 16+81 = 97 , 97+625 = 722 , 722+1=723 -->sum=723
          } 	
          if(sum == x){
          System.out.println("Armstrong number");
        }
        else{
        	System.out.println(" Not an Armstrong number");
        }
   }
}