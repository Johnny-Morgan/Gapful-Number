import java.util.Scanner;

/**
 * Created by Johnny on 06/11/2018
 * Program to check if a number is a gapful number
 * A gapful number is a number that is divisible by the
 * number formed by the first and last digits
 * of the original number
 */
public class Gapful {

    // method to return the first digit of an integer
    public static int firstDigit(int num){
        while(num > 9){
            num /= 10;
        }
        return num;
    }
    // method to return if a number is a gapful number
    public static boolean isAGapful(int num){
        boolean isAGapful = false;
        int lastDigit = num % 10;
        int firstDigit = firstDigit(num);
        int divisor = firstDigit * 10 + lastDigit;
        if(num % divisor == 0){
            isAGapful = true;
        }
        return isAGapful;
    }
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a range of positive numbers (first number should be at least 3 digits)\n");
        System.out.print("Enter first number in range: ");
        int firstNumber = keyboard.nextInt();
        System.out.print("Enter last number in range: ");
        int lastNumber = keyboard.nextInt();

        // Check and output which numbers in the range are gapful numbers
        System.out.printf("%nThe gapful numbers in the range %d - %d are: %n%n", firstNumber, lastNumber);
        for(int i = firstNumber; i <= lastNumber; i++){
            if(isAGapful(i))
                System.out.println(i);
        }
    }
}

