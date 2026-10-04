//This program creates a sub-array from the already existing array and 
// calculates the sum and average of both arrays
// Another method for creating subarrays is also given by the end of the main code
public class SubArray {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (i + 1) * 2;
        }
        int sum = 0;
        System.out.println("The original Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            sum += arr[i];
        }
        double average = (double) sum / arr.length;
        System.out.println("Sum of the original array: " + sum);
        System.out.println("Average of the original array: " + average);
        int[] arr1 = { arr[4], arr[5], arr[6], arr[7], arr[8] };
        System.out.println("\n\n\nSub array: ");
        int sum1 = 0;
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
            sum1 += arr1[i];

        }
        double average1 = (double) sum1 / arr1.length;

        System.out.println("Sum of the sub-array: " + sum1);
        System.out.println("Average of the sub-array: " + average1);
    }
}

/*Another way of doing this is as follows:

int[ ] arr={10,13,16,29,35,34};
int[] subarr= new int[3];
int j=0;
for(int i=2; i<=4; i++){
subarr[j]= arr[i];
j++;
for(int num: subarr){
System.out.println(num);
} 
}

*/