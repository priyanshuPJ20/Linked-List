public class CLL1 {
    public static void main(String[] args) {
        CLL list = new CLL();
        list.insert(23);
        list.insert(3);
        list.insert(1);
        list.insert(75);
        list.display();
        list.delete(1);
        list.display();
    }
}
