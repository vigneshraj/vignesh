import java.util.*;
import java.io.*;
class FactorialNumber {
  public static void main(String args[]) {
    int i,sum=1;
    int n;
    Scanner vc=new Scanner(System.in);
    System.out.println("Enter the range of factorial:");
    n=vc.nextInt();
    for(i=1;i<=n;i++)
    {
      sum=sum*i;
    }
    System.out.println("Enter the range of factorial is:"+sum);
  }
}
