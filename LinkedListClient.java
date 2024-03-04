public class LinkedListClient {

    public static void main(String[] args) {
        LinkedListImp ll = new LinkedListImp();

        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.addFirst(40);
        ll.addFirst(50);
        ll.addLast(34);
        ll.addAt(45, 3);
         ll.addAt(58, 3);
        ll.display();

    }
}
