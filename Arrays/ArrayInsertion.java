/*This program uses a static insertion method to insert the elements in an array 
 The method requires the following arguments:
1. The array in which we want to insert the element
2. Number of elements in the array(n)
3. Index position where we want to insert(k)
4. The element we want to insert
 */

public class ArrayInsertion {
    static void insert(int[] arr, int n, int k, int x) {
        int j = n;
        while (j >= k) {
            arr[j + 1] = arr[j];
            j -= 1;
        }
        arr[k] = x;
        n = n + 1;

    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 2;
        arr[1] = 4;
        arr[2] = 8;
        arr[3] = 10;
        int n = 4;
        int k = 2;
        int x = 6;
        insert(arr, n, k, x);
        System.out.println("Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
