import java.util.*;
class Prime {  
 public static void main(String args[]){  
  int i,m=0,flag=0;    
  int n;
  Scanner vc=new Scanner(System.in);
  System.out.println("Enter the Value of N:");
  n=vc.nextInt();
  
  m=n/2;    
  for(i=2;i<=m;i++){    
   if(n%i==0){    
   System.out.println("Number is not prime");    
   flag=1;    
   break;    
   }    
  }    
  if(flag==0)    
  System.out.println("Number is prime");    
}  
}  
