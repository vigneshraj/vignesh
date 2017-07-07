import java.util.Scanner;

class EvenorOdd {
	public static void main(String args[]) 
	{
		int a;
		Scanner vc=new Scanner(System.in);
		a=vc.nextInt();
		if(a%2==0)
		{
			System.out.println("A is Even number:");
		}
		else if(a%2==1)
		{
			System.out.println("A is Odd number:");
		}
	}
}
