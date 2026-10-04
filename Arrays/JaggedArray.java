//This program creates & displays a jagged array(no. of rows!= no. of columns)
public class JaggedArray {
    public static void main(String[] args) {

        int[][] arr = { { 1, 3 }, { 2, 4, 6 }, { 5, 6, 7, 8 }, { 4, 8, 12, 16, 20 } };
        System.out.println("The jagged array is as follows:");
        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr[i].length; k++) {
                System.out.print(arr[i][k] + "  ");
            }
            System.out.println();
        }
    }
}
