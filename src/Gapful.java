import java.util.Scanner;

/**
 * Created by Johnny on 06/11/2018
 * Program to check if a number is a gapful number
 * A gapful number is a number that is divisible by the
 * number formed by the first and last digits
 * of the original number
 */
public class Gapful {

    // method for a 3 digit number
    public static boolean isAGapful(int num){
        boolean isAGapful = false;
        int lastDigit = num % 10;
        int firstDigit = num / 100;
        int divisor = firstDigit * 10 + lastDigit;
        if(num % divisor == 0){
            isAGapful = true;
        }
        return isAGapful;
    }
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a 3 digit number: ");
        int number = keyboard.nextInt();
        if(isAGapful(number))
            System.out.print(number + " is a gapful number");
        else
            System.out.print(number + " is not a gapful number");
    }
}

