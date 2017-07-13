import java.util.*;
class SumofNnumber {
  public static void main(String args[])
  {
    int n,sum=0;
    Scanner vc=new Scanner(System.in);
    System.out.println("Enter the value of n:");
    n=vc.nextInt();
    for(int i=0;i<n;i++)
    {
    sum=sum+i;
    }
    System.out.println("Sum of "+n+" is :"+sum);
  }
}
