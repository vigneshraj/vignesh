import java.util.*;
import java.io.*;
class Fibonacci {
public static void main(String args[])  
{    
 int n1=0,n2=1,n3,i,n;
 Scanner vc=new Scanner(System.in);
 System.out.println("Enter the Limit of the Fibonacci series: ");
 n=vc.nextInt();    
 System.out.print(n1+" "+n2);
    
 for(i=2;i<n;++i)
 {    
  n3=n1+n2;    
  System.out.print(" "+n3);    
  n1=n2;    
  n2=n3;    
 }    
  
} 
}
