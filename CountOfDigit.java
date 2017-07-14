import java.util.*;
class CountOfDigit {
  public static void main(String args[]) 
  {
    int n;
    Scanner vc=new Scanner(System.in);
    System.out.println("Enter the Integer:");
    n=vc.nextInt();
    String a=String.valueOf(n);
    int l=a.length();
    System.out.println("Value of int:  "+l);
  }
}
