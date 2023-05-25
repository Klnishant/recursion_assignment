import java.util.Scanner;

public class SumOfTheValuesOfTheArray {
    public static int findSumOfArray(int[] arr,int index){
        if (index>=arr.length-1){
            return arr[index];
        }
        return arr[index]+findSumOfArray(arr,index+1);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the element of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result = findSumOfArray(arr,0);

        System.out.println("Sum of the element of the array:"+result);
    }
}
