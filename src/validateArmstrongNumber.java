import java.util.Scanner;

public class validateArmstrongNumber {
    public static boolean isArmstrong(int number) {
        int numDigits = countDigits(number);
        int sum = calculateSumOfPowers(number, numDigits);
        return sum == number;
    }

    public static int countDigits(int number) {
        if (number == 0) {
            return 0;
        } else {
            return 1 + countDigits(number / 10);
        }
    }

    public static int calculateSumOfPowers(int number, int numDigits) {
        if (number == 0) {
            return 0;
        } else {
            int digit = number % 10;
            int power = (int) Math.pow(digit, numDigits);
            return power + calculateSumOfPowers(number / 10, numDigits);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        if (isArmstrong(num)){
            System.out.println("Entered number is armstrong number");
        }
        else System.out.println("Entered number is not an armstrong number:");
    }
}
