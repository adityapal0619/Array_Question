/*
 Find Maximum and Minimum in Array:
Ek integer N diya hoga.
Tumhe array ka maximum aur minimum element dhoondhna hai.
made by: Aditya Pal 
*/

import java.util.Scanner;

public class arry9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int N = input.nextInt();
        int arr[]=new int[N];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < N; i++) {
            arr[i] = input.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < N; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
         
            }
        }
        System.err.println("The maximum element of the array is: " + max);
        System.err.println("The minimum element of the array is: " + min);
    }
}
