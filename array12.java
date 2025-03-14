import java.util.*;

public class array12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int N = input.nextInt();

        if (N < 2) {
            System.out.println("Array should have at least 2 elements.");
            return;
        }

        int[] arr = new int[N];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < N; i++) {
            arr[i] = input.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;  // Store previous max before updating
                max = arr[i];  // Update max
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("No second largest element found (all elements may be identical).");
        } else {
            System.out.println("Second largest element in the array is: " + secondMax);
        }

        input.close();
    }
}
