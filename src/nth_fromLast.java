public class nth_fromLast {
    public static Node nthNode(Node head,int n){
        int size=0;
        Node temp=head;
        while (temp!=null){
            size++;
            temp=temp.next;
        }
        int m=size-n+1;
        temp=head;
        for (int i = 1; i <=m-1; i++) {
            temp=temp.next;
        }
        return temp;
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;

        }
    }
    public static void main(String[] args) {
        Node a=new Node(100);
        Node b=new Node(150);
        Node c=new Node(109);
        Node d=new Node(10);
        Node e=new Node(109);
        Node f=new Node(101);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        Node q=nthNode(a,2);
        System.out.println(q.data);
    }
}
