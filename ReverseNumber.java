import java.util.Scanner;
public class Sample
{
    public static void main(String args[])
    {
        int n, m, a = 0,x;
        Scanner vc = new Scanner(System.in);
        System.out.print("Enter any number:");
        n = vc.nextInt();
        m = n;
        while(n > 0)
        {
            x = n % 10;
            a = a * 10 + x;
            n = n / 10;
        }
        
        System.out.println("The Reverse String is : "+a);
        
    }
}
