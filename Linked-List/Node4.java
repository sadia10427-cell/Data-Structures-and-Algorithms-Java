
//This program inserts 15 int elements in the linked list 
//using insertion method and then search a particular element 
//using static boolean search method
import java.util.Scanner;

public class Node4 {
    int data;
    Node4 next;

    public Node4(int data) {
        this.data = data;
    }

    public Node4(int data, Node4 next) {
        this(data);
        this.next = next;
    }

    static Node4 insert(Node4 start, int x) {
        if (start == null || start.data > x) {
            start = new Node4(x, start);
            return start;
        }
        Node4 p = start;
        while (p.next != null) {
            if (p.next.data > x) {

                break;
            }
            p = p.next;
        }
        p.next = new Node4(x, p.next);

        return start;
    }

    static boolean search(Node4 start, int x) {
        for (Node4 i = start; i != null; i = i.next) {
            if (i.data == x) {
                System.out.println("Element found!!");
                return true;
            }
        }
        System.out.println(" Element not found: ");
        return false;
    }

    static void display(Node4 start) {
        for (Node4 j = start; j != null; j = j.next) {
            System.out.println(j.data);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node4 start = null;

        for (int i = 1; i <= 15; i++) {
            System.out.println(" Enter the element " + i + " : ");
            int num = sc.nextInt();
            start = insert(start, num);

        }
        display(start);

        System.out.println(" Enter element to search: ");
        int key = sc.nextInt();
        search(start, key);
        sc.close();
    }
}