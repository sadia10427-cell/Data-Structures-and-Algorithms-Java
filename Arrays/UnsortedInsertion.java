//This program is capable of inserting an element in an unsorted array
public class UnsortedInsertion{

    public static void main(String[] args) {
        
        int[] arr1= {10, 3, 15, 4};
        int newElement = 5;
        int[] arr2 = new int[arr1.length+ 1];
        System.arraycopy(arr1, 0, arr2, 0, arr1.length);
        arr2[arr1.length] = newElement;

        System.out.println("The array contains following elements:");
        for(int i =0; i<arr2.length ; i++){
        System.out.println(arr2[i] + "  ");
        }
    }
}