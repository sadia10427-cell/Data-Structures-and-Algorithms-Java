//This program contains methods to insert, delete, replace and display
// the elements in a linked list while maintaining its order

public class Node8 {
    int data;
    Node8 next;

    public Node8(int data) {
        this.data = data;

    }

    public Node8(int data, Node8 next) {
        this(data);
        this.next = next;

    }

    static Node8 replace(Node8 start, int x, int y) {
        if (start == null || start.data > x) {
            return start;
        }
        if (start.data == x) {
            start.data = y;
            return start;
        }
        for (Node8 p = start; p.next != null; p = p.next) {
            if (p.next.data > x)
                break;
            if (p.next.data == x) {
                p.next.data = y;
                break;
            }
        }
        return start;

    }

    static Node8 delete(Node8 start, int x) {
        if (start == null || start.data > x) {
            return start;

        }
        if (start.data == x) {
            return start.next;
        }

        for (Node8 p = start; p.next != null; p = p.next) {
            if (p.next.data > x)
                break;
            if (p.next.data == x) {
                p.next = p.next.next;
                break;
            }
        }
        return start;
    }

    static Node8 insert(Node8 start, int x) {
        if (start == null || start.data > x) {
            start = new Node8(x, start);
            return start;
        }
        Node8 p = start;
        while (p.next != null) {
            if (p.next.data > x)
                break;
            p = p.next;

        }
        p.next = new Node8(x, p.next);
        return start;
    }

    static void display(Node8 start) {
        for (Node8 i = start; i != null; i = i.next) {
            System.out.println(i.data);
        }
    }

    public static void main(String[] args) {
        Node8 start = null;
        for (int i = 1; i < 11; i++) {
            start = insert(start, i * 2);
        }
        System.out.println("LIST before changes:");
        display(start);

        int target = 14;
        delete(start, target);
        target = 12;
        delete(start, target);
        int x = 10;
        int y = 20;
        replace(start, x, y);
        System.out.println("List after changes: ");
        display(start);

    }

}
