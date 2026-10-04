//This program takes two lists and merge them to make one ordered list
class Node6 {

    int data;
    Node6 next;

    public Node6(int data) {
        this.data = data;
    }

    public Node6(int data, Node6 next) {
        this(data);
        this.next = next;
    }

    static Node6 insert(Node6 start, int x) {

        if (start == null || start.data > x) {
            start = new Node6(x, start);
            return start;
        }

        Node6 p = start;

        while (p.next != null) {

            if (p.next.data > x)
                break;

            p = p.next;
        }

        p.next = new Node6(x, p.next);

        return start;
    }

    static void display(Node6 start) {

        for (Node6 i = start; i != null; i = i.next)
            System.out.print(i.data + " ");

        System.out.println();
    }

    public static void main(String[] args) {

        Node6 list1 = null;

        for (int i = 1; i < 6; i++) {
            list1 = insert(list1, i * 4);
        }

        Node6 list2 = null;

        for (int i = 1; i < 6; i++) {
            list2 = insert(list2, i);
        }

        System.out.println("List 1:");
        display(list1);

        System.out.println("List 2:");
        display(list2);

        Node6 start3 = null;

        for (Node6 i = list1, j = list2; j != null; i = i.next, j = j.next) {

            start3 = insert(start3, i.data);
            start3 = insert(start3, j.data);

        }

        /*
          we can also do the exact same thing using two separate loops like this:
          for (Node6 i = list1; i != null ; i = i.next) {
          
          start3 = insert(start3, i.data);
          }
          for (Node6 i = list2; i != null; i = i.next) {
          
          start3 = insert(start3, i.data);
          
         }
         */

        System.out.println("Merged List is given below :");
        display(start3);
    }
}