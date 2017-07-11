import java.util.*;
import java.io.*;
class CheckNumber {
  public static void main(String args[])
  {
    int i;
    Scanner vc=new Scanner(System.in);
    System.out.println("Enter the value of i:");
    i=vc.nextInt();
    if(i==0)
    {
    System.out.println(i+" is equal to zero");
    }
    else if(i>0)
    {
    System.out.println(i+" is Possitive number");
    }
    else 
    {
    System.out.println(i+" is Negative number");
    }
  }
}
