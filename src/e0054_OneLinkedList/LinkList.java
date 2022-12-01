package e0054_OneLinkedList;

public class LinkList {
    public class Node {
        String value;
        Node next;

        Node(String value, Node next) {
            this.value = value;
            this.next = next;
        }
    }


    Node tail;
    Node head;
    int size;

    LinkList() {
        initZero();
    }

    void initZero() {
        size = -1;
        this.tail = null;
        this.head = tail;
        System.out.println("Begin: Create new list with 0 elements:");
        System.out.println("-----");
    }

    void add(String data) {
        if (tail == null) {
            size++;
            Node nodeFirst = new Node(data, null);
            System.out.println("Add first node (nodeFirst) - " + nodeFirst.value);
            tail = nodeFirst;
            head = tail;
            System.out.println("tail.next = " + tail.next);
            System.out.println(tail);
            System.out.println(nodeFirst);
            System.out.println(head);

            System.out.printf("%-40s %-50s\n", " - linkList.tail:", tail);
            System.out.printf("%-40s %-50s\n", " - linkList.tail.next:", tail.next);
            System.out.printf("%-40s %-50s\n", " - linkList.head:", head);
            System.out.printf("%-40s %-50s\n", " - linkList.head.value:", head.value);
            System.out.println("-----");

            return;
        }
        size++;
        Node node = new Node(data, null);
        head.next = node;
        head = node;
        System.out.println("ADDED NEXT NODE - " + node.value);
        System.out.printf("%-40s %-50s\n", " - linkList.tail:", tail);
        System.out.printf("%-40s %-50s\n", " - linkList.tail.next:", tail.next);
        System.out.printf("%-40s %-50s\n", " - linkList.head:", head);
        System.out.printf("%-40s %-50s\n", " - linkList.head.value:", head.value);
        System.out.println("-----");
    }


    void printList() {
        System.out.println("====== printList: =========================================");
        Node ref = tail;

        for (int i = 0; i <= size; i++) {
            System.out.printf("%-4s : %s\n", i, ref.value);
            System.out.printf("%-40s %-50s\n", " - linkList.tail:", tail);
            System.out.printf("%-40s %-50s\n", " - linkList.tail.next:", tail.next);
            System.out.printf("%-40s %-50s\n", " - linkList.ref:", ref);
            System.out.printf("%-40s %-50s\n", " - linkList.ref.next:", ref.next);
            System.out.printf("%-40s %-50s\n", " - linkList.head:", head);
            System.out.printf("%-40s %-50s\n", " - linkList.head.value:", head.value);
            System.out.println("-----");

            ref = ref.next;
        }
    }

    String get(int position) {

        return "";
    }
}
