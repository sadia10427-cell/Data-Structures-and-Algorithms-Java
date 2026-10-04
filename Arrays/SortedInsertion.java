//This program is capable of inserting an element in a sorted array
public class SortedInsertion {
    public static void main(String[] args) {

        int[] arr1 = { 10, 20, 40, 50, 60 };
        int newElement = 30;
        int index = 2;
        int[] arr2 = new int[arr1.length + 1];
        System.arraycopy(arr1, 0, arr2, 0, index);
        arr2[index] = newElement;
        System.arraycopy(arr1, index, arr2, index + 1, arr1.length - index);
        System.out.println("The array contains following elements:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i] + "  ");
        }

    }

}
