import java.util.Scanner;

public class LeapYear
{
    public static void main(String args[])
    {   
        int year;
        boolean flag=false;
        Scanner vc= new Scanner(System.in);
        System.out.println("Enter the year:");
        year=vc.nextInt();
        
        if(year%400 ==0)
        {
            flag=true;
        }
        else if(year%100==0)
        {
            flag=false;
        }
        
        if(flag)
        {
            System.out.println("Given year "+year+" is a Leap Year");
        }
        else
        {
               System.out.println("Given year "+year+" is a Non-Leap Year");
        }

    }
}
