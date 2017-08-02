import java.io.*;
import java.util.Scanner;
public class SimpleConverson {

	public static void main(String args[]) {
		
		int n;
		int z=0;
		float a=0.3f,b=0.3f;
		Scanner vc=new Scanner(System.in);
		System.out.println("1) Kg to Pounds");
		System.out.println("2) Meters to yards");
		System.out.println("3) Celsius to Fahrenheit");
		
		System.out.println("Choose the Converson type : ");
		
		n=vc.nextInt();
		switch(n)
		{
		case 1:
			
			System.out.println("1. Kilograme to Pounds");
			System.out.println("2. Pounds to Kilograme");
			System.out.println("==========================");
			z=vc.nextInt();
			
			if(z==1)
			{
				System.out.println("Enter the Kilogram : ");
				a=vc.nextFloat();
				b=(float) (a*2.2);
				System.out.printf("The equal value of pounds is : %.3f",b);
			}
			else if(z==2)
			{
				System.out.println("Enter the Pounds : ");
				a=vc.nextFloat();
				b=(float) (1/2.2)*a;
				System.out.printf("The equal value of pounds is : %.3f",b);
				
			}
			else
			{
				System.out.println("Choose Correct Conversion");
			}
			break;
		case 2:
			System.out.println("1. Meter to Yards");
			System.out.println("2. Yards to Meter");
			System.out.println("==========================");
			
			z=vc.nextInt();
			if(z==1)
			{
				System.out.println("Enter the Meter : ");
				a=vc.nextFloat();
				b=(float) (a/0.9144);
				System.out.println("The equal value of yards is : "+b);
			}
			else if(z==2)
			{
				System.out.println("Enter the Yards : ");
				a=vc.nextFloat();
				b=(float) (a*0.9144);
				System.out.println("The equal value of meter is : "+b);
				
			}
			else 
			{
				System.out.println("Choose Correct Conversion");
			}
			break;
		
		case 3:
			double v=0.2f, c=0.2f;
			System.out.println("1. Celsius to Fahrenheit ");
			System.out.println("2. Fahrenheit to Celsius ");
			System.out.println("==========================");
			
			z=vc.nextInt();
			if(z==1){
				System.out.println("Enter the Celsius value : ");
				v=vc.nextFloat();
				c= (9/5.0)*v+32;
				System.out.printf("The equal value of fahrenheit : %.2f ",c);
			
			}
			else if(z==2)
			{
				System.out.println("Enter the Fahrenheit value : ");
				v=vc.nextFloat();
				c= (5/9.0)*(v-32);
				System.out.printf("The equal value of Celsius is : %.2f ",c);
			}
			else
			{
				System.out.println("Choose correct conversion: ");
			}
			break;
			
		default:
			System.out.println("Error");
		break;
		}
	}
}
