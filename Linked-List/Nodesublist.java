class Nodesublist {
    int data;
    Nodesublist next;

    public Nodesublist(int data) {
        this.data = data;
    }

    Nodesublist(int data, Nodesublist next) {
        this.data = data;
        this.next = next;
    }

    public static Nodesublist insert(Nodesublist start, int x) {
        if (start == null || start.data > x) {
            start = new Nodesublist(x, start);
            return start;
        }
        Nodesublist p = start;
        while (p.next != null) {
            if (p.next.data > x)
                break;
            p = p.next;
        }
        p.next = new Nodesublist(x, p.next);
        return start;
    }

    static Nodesublist sublist(Nodesublist list, int p, int q) {
        // Return null if invalid range, empty list, or p exceeds range bounds
        if (list == null || p < 0 || p > q) {
            return null;
        }
        Nodesublist newlist = null;
        Nodesublist current = list;
        int counter = 0;
        // Traverse until list ends or counter exceeds q
        while (current != null && counter <= q) {
            if (counter >= p) {
                newlist = insert(newlist, current.data);
            }
            current = current.next;
            counter++;
        }
        return newlist;
    }

    static Nodesublist[] splitInHalf(Nodesublist list) {
        if (list == null) {
            return new Nodesublist[] { null, null };
        }
        // Loop 1: Count total nodes
        int totalCount = 0;
        Nodesublist temp = list;
        while (temp != null) {
            totalCount++;
            temp = temp.next;
        }
        // Calculate the midpoint (for odd lengths, the first half gets the extra
        // element)
        int mid = (totalCount + 1) / 2; // Loop 2: Traverse to the midpoint node
        Nodesublist current = list;
        for (int i = 1; i < mid; i++) {
            current = current.next;
        }
        // Extract the second half and disconnect the first half
        Nodesublist secondHalf = current.next;
        current.next = null;
        return new Nodesublist[] { list, secondHalf };
    }

    public static void main(String[] args) {
        Nodesublist a = null;
        a = insert(a, 30);
        a = insert(a, 50);
        a = insert(a, 10);
        a = insert(a, 20);
        a = insert(a, 40);
        a = insert(a, 60);
        Nodesublist newlist = sublist(a, 2, 4);
        for (Nodesublist b = newlist; b != null; b = b.next)
            System.out.println(b.data);
        Nodesublist[] parts = splitInHalf(a);
        System.out.println("First part:");
        for (Nodesublist b = parts[0]; b != null; b = b.next) {
            System.out.println(b.data);
        }
        System.out.println("Second part:");
        for (Nodesublist b = parts[1]; b != null; b = b.next) {
            System.out.println(b.data);
        }
    }
}