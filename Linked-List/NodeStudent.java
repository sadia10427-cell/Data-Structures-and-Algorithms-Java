// This program inserts objects in the linked list and 
// Search for the object(student) using static boolean search method

class Student {

    String name;
    int rollNo;
    int serialNo;

    Student(String name, int rollNo, int serialNo) {
        this.name = name;
        this.rollNo = rollNo;
        this.serialNo = serialNo;
    }
}

class NodeStudent {

    Student data;
    NodeStudent next;

    public NodeStudent(Student data) {
        this.data = data;
    }

    public NodeStudent(Student data, NodeStudent next) {
        this(data);
        this.next = next;
    }

    static boolean search(NodeStudent start, String targetName) {

        for (NodeStudent i = start; i != null; i = i.next) {

            if (i.data.name.equals(targetName)) {

                System.out.println("Student Found!");
                System.out.println("Name      : " + i.data.name);
                System.out.println("Roll No   : " + i.data.rollNo);
                System.out.println("Serial No : " + i.data.serialNo);

                return true;
            }
        }

        System.out.println("Student not found!");
        return false;
    }

    public static void main(String[] args) {

        NodeStudent start = new NodeStudent(
                new Student("Zumar", 101, 1));

        NodeStudent p = start;

        p.next = new NodeStudent(
                new Student("Zahra", 102, 2));
        p = p.next;

        p.next = new NodeStudent(
                new Student("Aliyana", 103, 3));
        p = p.next;

        p.next = new NodeStudent(
                new Student("Khuzaima", 104, 4));
        p = p.next;

        p.next = new NodeStudent(
                new Student("Areem", 105, 5));

        System.out.println("The following Students are enrolled: ");

        for (NodeStudent i = start; i != null; i = i.next) {

            System.out.println(
                    i.data.name + "  "
                            + i.data.rollNo + "  "
                            + i.data.serialNo);
        }
        System.out.println(" \nsearching for the Students: \n");

        search(start, "Aliyana");

        search(start, "Sadia");
    }
}
