import java.util.*;
class EvenorOdd {
  public static void main(String args[]) {
  int a;
  Scanner vc= new Scanner(System.in);
  System.out.println("Enter the value of a");
  a=vc.nextInt();
  if(a%2==0)
  {
  System.out.println(a+" is a Even number");
  }
  else if(a%2==1)
  {
  System.out.println(a+" is Odd number");
  }
  }
}
