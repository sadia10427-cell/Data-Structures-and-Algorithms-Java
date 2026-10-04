// This program duplicates the given array in reverse order
// and prints it.

public class ReverseDuplicate {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10};
        System.out.println("The original array: ");
        for(int num:arr){
            System.out.println(num);
        }
        int[] duplicate_arr = new int[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            duplicate_arr[j] = arr[i];
            j++;
        }
        System.out.println("The reversed duplicate array is as follows:  ");
        for (int num : duplicate_arr) {
            System.out.println(num);
        }

    }
}
