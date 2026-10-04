//This program will store 10 elements in a linked list structure through for loop
// Calculates its sum and display only the first and the last element
public class Node1 {
    int data;
    Node1 next;

    Node1(int data) {
        this.data = data;
    }

    public static void main(String[] args) {
        Node1 start = new Node1(10);
        Node1 p = start;
        for (int i = 2; i < 10; i++) {
            p.next = new Node1(i * 10);
            p = p.next;
        }
        int sum = 0;
        for (Node1 j = start; j != null; j = j.next) {
            System.out.println(j.data);
            sum += j.data;

        }
        System.out.println("The sum = " + sum);

        System.out.println("The first and last elements are: ");
        for (Node1 k = start; k != null; k = k.next) {
            if (k == start || k.next == null) {
                System.out.println(k.data);
            }

        }

    }
}
