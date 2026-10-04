//This program uses binary search method to search a element given by the user.

import java.util.Scanner;

public class BinarySearch1 {
    static int search(int[] arr, int x) {
        int p = 0;
        int q = arr.length - 1;
        while (p <= q) {
            int i = (p + q) / 2;

            if (arr[i] == x) {
                return i;

            }
            if (arr[i] < x) {
                p = i + 1;

            } else {
                q = i - 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[20];
        for (int i = 1; i < arr.length; i++) {
            arr[i] = i * 2;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a number from first 20 even numbers to find its index!!");
        int target = sc.nextInt();
        System.out.println("The element is stored on index : " + search(arr, target));
        sc.close();
    }
}
