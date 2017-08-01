import java.io.*;
import java.util.Scanner;
class SimpleCalculater {

public static void main(String args[])
{
  int a,b,c=0;
  Scanner vc=new Scanner(System.in);
  System.out.println("Enter the 1st value: ");
  a=vc.nextInt();
  System.out.println("Enter the 2nd value: ");
  b=vc.nextInt();
  System.out.println("Choose Which Operation to perform: ");
  System.out.println("1) Addition");
  System.out.println("2) Subtract");
  System.out.println("3) Multiply");
  System.out.println("4) Divison");
  System.out.println("5) Mod Operation");
  System.out.println("6) Power");
  int n=vc.nextInt();
  switch(n)
  {
  case 1:
	  c=(a+b);
	  System.out.println("Addition value is: "+c);
	  break;
  case 2:
	  c=(a-b);
	  System.out.println("Subtrat value is: "+c);
	  break;
  case 3:
	  c=(a*b);
	  System.out.println("Multiply value is: "+c);
	  break;
  case 4:
	  c=(a/b);
	  System.out.println("Divison value is: "+c);
	  break;
  case 5:
	  c=(a%b);
	  System.out.println("Modulo value is: "+c);
	  break;
  case 6:
	  for(int x=0;x<b;x++)
	  {
		  c=(a*b);
	  }
	  System.out.println("Power of" +a+" is " +c);
	  
  break;
  default:
	  System.out.println("Error");
	  break;
  }
}
}
