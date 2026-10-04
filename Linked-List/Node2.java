
// This program works exactly like Node1.java, except the inputs are taken using Scanner class
import java.util.Scanner;

public class Node2 {
    int data;
    Node2 next;

    Node2(int data) {
        this.data = data;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        Node2 start = new Node2(sc.nextInt());
        Node2 p = start;
        for (int j = 1; j < 10; j++) {
            System.out.println("Enter number " + (j + 1) + ":");
            p.next = new Node2(sc.nextInt());
            p = p.next;
        }
        int sum = 0;
        for (Node2 i = start; i != null; i = i.next) {
            sum += i.data;
            if (i == start || i.next == null) {
                System.out.println("The first and the last elements are: " + i.data);
            }

        }
        System.out.println("The sum of all the elements = " + sum);
        sc.close();
    }
}
