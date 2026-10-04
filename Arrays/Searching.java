//The program performs the basic searching operation
public class Searching {

    public static void main(String[] args) {

        int[] arr1 = { 30, 69, 45, 25, 27, 10, 47, 68, 74, 36, 26 };
        int target = 10;
        int index = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == target) {
                index = i;
                break;

            } 

        }
        System.out.println("The required element appeared at index : " + index);
    }
}
