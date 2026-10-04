//Program to delete an element from the array data structure
public class Deletion {
    public static void main(String[] args) {

        int[] arr1 = { 10, 20, 32, 30, 40, 50 };
        int[] arr2 = new int[arr1.length - 1];
        int index = 2;
        System.arraycopy(arr1, 0, arr2, 0, index);
        System.arraycopy(arr1, index + 1, arr2, index, arr2.length - index);
        System.out.println("The array contains following elements:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i] + "  ");
        }
    }
}
