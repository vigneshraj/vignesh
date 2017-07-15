import java.util.*;
import java.io.*;
class MulitiplicationTable{
  public static void main(String args[]) 
  {
    int n;
    Scanner vc=new Scanner(System.in);
    
    System.out.println("Enter the mulitiplication Table value:");
    n=vc.nextInt();
    System.out.println("The Mulitiplication Table of "+n+" is :");
    for(int i=1;i<=10;i++)
    {
      
      System.out.println(i+"*"+n+"="+(i*n));
    }
  }

}
