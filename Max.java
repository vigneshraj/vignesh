import java.util.*;
class Max{
  public static void main(String args[]) {
    int a=0,b=0,c=0;
    Scanner vc=new Scanner(System.in);
    System.out.println("Enter the 3 integer:");
    a=vc.nextInt();
    b=vc.nextInt();
    c=vc.nextInt();
    if(a>b && a>c)
    {
      System.out.println("A is greatest");
    }
    else if(b>a && b>c)
    {
      System.out.println("B is greatest");
    }
    else
    {
      System.out.println("C is greatest");
    }
    
  }
}
