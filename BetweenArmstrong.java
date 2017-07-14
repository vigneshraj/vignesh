import java.util.*;
public class BetweenArmstrong {

    public static void main(String[] args) {

        int low , high;
        Scanner vc=new Scanner(System.in);
        System.out.println("Enter the low and high values:");
        low=vc.nextInt();
        high=vc.nextInt();

        for(int number = low + 1; number < high; ++number) {
            int digits = 0;
            int result = 0;
            int originalNumber = number;

                while (originalNumber != 0) {
                originalNumber /= 10;
                ++digits;
            }

            originalNumber = number;

                while (originalNumber != 0) {
                int remainder = originalNumber % 10;
                result += Math.pow(remainder, digits);
                originalNumber /= 10;
            }

            if (result == number)
                System.out.print(number + " ");
        }
    }
} 
