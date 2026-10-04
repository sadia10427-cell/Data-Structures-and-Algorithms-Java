//This program print the elements of linear array in reverse order
public class Reverse {
    public static void main(String[] args) {

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (i + 1) * 5;
        }

        System.out.println("Array before reverse: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Printing the array in reverse order: ");
        for (int i = arr.length - 1; i >=0; i--) {
            System.out.println(arr[i]);
        }
    }
}
