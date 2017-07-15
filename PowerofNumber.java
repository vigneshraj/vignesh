import java.util.*;
import java.io.*;
class PowerofNumber{
  public static void main(String args[])
{
    int count;
    int num1, num2, result = count =1;
    Scanner vc = new Scanner(System.in);
    
        System.out.println("Enter the 1st number");
        num1 = vc.nextInt();
        System.out.println("Enter the 2nd number");
        num2 = vc.nextInt();
   
   while(count<=num2)
    {
        if(num2!=0)
        {
            result = num1*result;
            count++;
        }
        else
        {
            System.out.println(num1+" to the power "+num2+" is "+num1);
        }
    }
    System.out.println(num1+" to the power "+num2+" is "+result);
}
}
