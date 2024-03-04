class LinkedListImp {

    class Node {

        int value;
        Node next;

        Node(int val) {
            this.value = val;
        }

    }

    Node head;
    int size;

    void addFirst(int val) {
        Node nn = new Node(val);
        nn.next = this.head;
        this.head = nn;

    }

    void addLast(int val) {

        if (this.head == null) {
            addFirst(val);
            return;
        }

        Node nn = new Node(val);
        Node temp = this.head;

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = nn;

    }

    void addAt(int val, int idx) {
        if (idx < 0) {
            return;
        }

        if (idx == 0) {
            addFirst(val);
            return;
        }
        Node nn = new Node(val);
        Node temp = this.head;

        for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }

        Node forward = temp.next;
        temp.next = nn;
        nn.next = forward;
    }

    void display() {
        Node temp = this.head;

        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.print("END");
    }

}