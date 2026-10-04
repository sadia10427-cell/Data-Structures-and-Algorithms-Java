//The basic count operation is executed
public class Count {
    public static void main(String[] args) {

        int[] arr = { 28, 10, 36, 19, 10, 37, 53, 10, 10, 65, 20, 10, 10 };
        int target = 10;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                count++;
            }
        }
        System.out.println("In this array 10 exists " + count + " times!!");
        System.out.println("The array contains " + arr.length + " elements in total.");
    }
}