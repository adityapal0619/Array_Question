/*
Find Frequency of Each Element in Array:
Ek integer N diya hoga.
Tumhe har unique element ki frequency count karni hai.
 */

import java.util.Scanner;

public class array13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int N = input.nextInt();
        int arr[] = new int[N];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < N; i++) {
            arr[i] = input.nextInt();
        }
        int visited = 0;
        for(int i=0;i<N;i++){
            if(arr[i] != -1){
                int count = 1;
                for(int j=i+1;j<N;j++){
                    if(arr[i] == arr[j]){
                        count++;
                        arr[j] = -1;
                    }
                }
                System.out.println(arr[i] + " occurs " + count + " times.");
            }
        }
        input.close();
    }
}
