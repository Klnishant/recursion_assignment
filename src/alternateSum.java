import java.util.Scanner;

public class alternateSum {
    public static int nthAlternateSum(int n){
        if (n == 0) {
            return 0;
        } else if (n % 2 == 0) {
            return nthAlternateSum(n-1)-n;
        } else {
            return nthAlternateSum(n - 1) + n;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth value:");
        int n = sc.nextInt();
        int result=nthAlternateSum(n);
        System.out.println("Alternate sum of the "+n+" natural numbers:"+result);
    }
}
