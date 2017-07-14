import java.util.Scanner;
public class Prime
{
    public static void main(String args[])
    {
         int a1, a2, a3, fl = 0, i, j;
         Scanner vc = new Scanner(System.in);
         System.out.println ("Enter the Starting limit :"); 
         a1 = vc.nextInt();
         System.out.println ("Enter the Ending limit :"); 
         a2 = vc.nextInt();
         System.out.println ("The prime numbers in between"+a1+" and"+a2+" is :");
         for(i = a1; i <= a2; i++)
         {
             for( j = 2; j < i; j++)
             {
                 if(i % j == 0)
                 {
                     fl = 0;
                     break;
                 }
                 else
                 {
                     fl = 1;
                 }
             }
             if(fl == 1)
             {
                 System.out.println(i);
             }
         }
    }
}
