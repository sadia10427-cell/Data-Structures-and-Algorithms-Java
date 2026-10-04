//This program inserts String elements(names) in the list
// and searches for the same name using searching method

public class Node5 {
    String name;
    Node5 next;

    public Node5(String name) {
        this.name = name;
    }

    public Node5(String name, Node5 next) {
        this(name);
        this.next = next;
    }

    static boolean search(Node5 start, String x) {
        for (Node5 i = start; i != null; i = i.next) {
            if (i.name.equals(x)) {
                System.out.println(" Name found! ");
                return true;

            }
        }
        System.out.println("Element not found ! ");
        return false;
    }

    public static void main(String[] args) {
        Node5 start = new Node5("Zumar");
        Node5 p = start;
        p.next = new Node5("Zahra");
        p = p.next;
        p.next = new Node5("Aliyana");
        p = p.next;
        p.next = new Node5("Khuzaima");
        p = p.next;
        p.next = new Node5("Areem");

        for (Node5 i = start; i != null; i = i.next) {
            System.out.println(i.name);

        }
        search(start, "Sadia");
        search(start, "Areem");

    }
}
