/*
Check if Array is Sorted (Ascending Order):
Ek integer N diya hoga.
Tumhe check karna hai ki array sorted hai ya nahi.
Output: "YES" agar sorted hai, warna "NO".
 */

import java.util.Scanner;

public class array11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int N = scanner.nextInt();
        int[] arr = new int[N];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                System.out.println("NO");
                return;
            }
        }
    }
}
