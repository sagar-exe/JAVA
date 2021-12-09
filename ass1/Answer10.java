package ass1;

import java.util.Scanner;

public class Answer10 {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("enter the number for armstrong check:");
        int number=s.nextInt();

        int originalNumber, remainder, result = 0;

        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}
    

