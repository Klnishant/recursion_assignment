import java.util.Scanner;

public class sumOfDigits {
    public static int digitSum(int num){
        if (num/10==0){
            return num;
        }
        int sum = num%10 + digitSum(num/10);
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();

        int result=digitSum(num);
        System.out.println("Sum of the digits of the given numbers:"+result);
    }
}
