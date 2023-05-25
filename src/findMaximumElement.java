import java.util.Scanner;

public class findMaximumElement {

    public static int findMax(int[] arr,int index){
        if (index == arr.length - 1) {
            return arr[index];
        } else {
            int maxRest = findMax(arr, index + 1);
            return Math.max(arr[index], maxRest);
        }
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

        int max=findMax(arr,0);
        System.out.println("Maximum elements of the given array:"+max);
    }
}
