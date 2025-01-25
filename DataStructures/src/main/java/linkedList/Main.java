package linkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(2);
        list.append(3);
        list.prepend(1);

        list.printList();


        list.set(0,4);

        list.printList();






    }
}
