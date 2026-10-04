// This program contains an insertion method to insert any element 
// in a linked list without affecting the order of the list
class Node3 {
    int data;
    Node3 next;

    public Node3(int data) {
        this.data = data;
    }

    public Node3(int data, Node3 next) {
        this(data);
        this.next = next;
    }

    static Node3 insert(Node3 start, int x) {
        if (start == null || start.data > x) {
            start = new Node3(x, start);
            return start;
        }

        Node3 p = start;
        while (p.next != null) {
            if (p.next.data > x) {
                break;

            }
            p = p.next;
        }
        p.next = new Node3(x, p.next);
        return start;
    }

    public static void main(String[] args) {

        Node3 a = null;
        a = insert(a, 50);
        a = insert(a, 20);
        a = insert(a, 25);
        a = insert(a, 15);

        for (Node3 i = a; i != null; i = i.next) {
            System.out.println(i.data);
        }
    }
}
