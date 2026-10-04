//This class contains a method to delete the target elements
class Node7 {
    int data;
    Node7 next;

    public Node7(int data) {
        this.data = data;
    }

    public Node7(int data, Node7 next) {
        this(data);
        this.next = next;
    }

    static Node7 delete(Node7 start, int x) {
        if (start == null || start.data > x) {
            return start;

        }
        if (start.data == x) {
            return start.next;
        }
        for (Node7 p = start; p.next != null; p = p.next) {
            if (p.next.data > x)
                break;
            if (p.next.data == x) {
                p.next = p.next.next;
                break;
            }

        }
        return start;
    }

    static Node7 insert(Node7 start, int x) {
        if (start == null || start.data > x) {
            start = new Node7(x, start);
            return start;
        }

        Node7 p = start;
        while (p.next != null) {
            if (p.next.data > x) {
                break;
            }
            p = p.next;

        }
        p.next = new Node7(x, p.next);

        return start;
    }

    static void display(Node7 start) {
        for (Node7 i = start; i != null; i = i.next) {
            System.out.println(i.data);
        }
    }

    public static void main(String[] args) {

        Node7 a = null;
        for (int i = 1; i < 12; i++) {
            a = insert(a, i * 3);

        }
        System.out.println(" List before deletion");
        display(a);
        int target = 18;
        delete(a, target);
        target = 12;
        delete(a, target);
        target = 21;
        delete(a, target);
        System.out.println(" List after deletion");
        display(a);
    }

}