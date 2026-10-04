//This program creates a 2D-Array, print its elements 
// and also prints the transpose of the 2D-Array
public class ArrayTranspose {
    public static void main(String[] args) {
        int rows = 5;
        int columns = 5;
        int[][] array = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = i + (j * 2);
            }
        }

        System.out.println("The 2D-Array contains following elements: ");
        for (rows = 0; rows < array.length; rows++) {
            for (columns = 0; columns < array[rows].length; columns++) {
                System.out.print(array[rows][columns] + " ");
            }
            System.out.println();
        }
        System.out.println("The transpose of the 2D-Array is as follows: ");
        for (rows = 0; rows < array.length; rows++) {
            for (columns = 0; columns < array[rows].length; columns++) {

                System.out.print(array[columns][rows] + " ");
            }
            System.out.println();
        }

    }
}
