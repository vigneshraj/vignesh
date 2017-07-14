import java.util.*;
class BetweenEvenNo{
  public static void main(String args[]) 
  {
    int st, end,n;
    Scanner vc=new Scanner(System.in);
    
    System.out.println("Enter the Starting interval: ");
    st=vc.nextInt();
    
    System.out.println("Enter the Ending interval: ");
    end=vc.nextInt();
    
    for(n=st;n<end;++n)
    { 
      if(n%2==0)
      {
      System.out.println(n);
      }
    }
  }
}
