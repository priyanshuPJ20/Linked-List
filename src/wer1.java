public class wer1 {

    public static void main(String[] args) {
        wer list = new wer();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(5);
        list.insertFirst(8);
        list.insertFirst(9);
        list.insertLast(99);
        list.insert(100,3);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
    }
}
