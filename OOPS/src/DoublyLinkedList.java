public class DoublyLinkedList {

   private Node head;
    public  void insertfirst(int val){
        Node node=new Node(val);
        node.next=head;
        node.prev=null;
        if(head!=null) {
            head.prev = node;
        }head=node;
    }

    public void insertafterkey(int val,int key){
        Node node=new Node(val);
        Node cur=head;
        Node last=null;
        while(cur!=null&&cur.val!=key){
            cur=cur.next;
        }
        last=cur.next;
        cur.next=node;
        node.prev=cur;
        node.next=last;
        last.prev=node;

    }

    public void insertlast(int val){
        Node node=new Node(val);
        Node cur=head;
        Node last=null;
        if(cur==null){
            insertfirst(val);
        }
//        while(cur!=null){
//            last=cur;
//            cur=cur.next;
//        }
//        last.next=node;
//        node.prev=last;
//        node.next=null;

        while(cur.next!=null){
            cur=cur.next;
        }
        cur.next=node;
        node.prev=cur;
        node.next=null;
    }

    public void deletefirst(){
        head=head.next;
        head.prev=null;
    }

    public void deletebykey(int key){
        Node node=head;
        Node last=null;
        while(node!=null&&node.val!=key){
            last=node;
            node=node.next;
        }
        last.next=node.next;
        node.prev=last;
    }

    public void deletelast(){
        Node node=head;
        while(node.next!=null){
            node=node.next;
        }
        node.prev.next=null;
    }
    public void display(){
        Node node=head;
        int size=0;
        while(node!=null){
            System.out.print(node.val+" -> ");
            node=node.next;
            size++;
        }
        System.out.println("END");
        System.out.println("The size of the ddl is "+size);
    }

    public void displayprev(){
        Node node=head;
        Node last=null;
        int size=0;
//        while(node!=null){
//            last=node;
//            node=node.next;
//            size++;
//        }
//        while(last!=null){
//            System.out.print(last.val+" -> ");
//            last=last.prev;
//        }
        while(node.next!=null){
            node=node.next;
        }
        while(node!=null){
            System.out.print(node.val+" -> ");
            size++;
            node=node.prev;
        }
        System.out.println("Reached Head");
    }


class Node {
    int val;
    Node next;
    Node prev;

    public Node(int val) {
        this.val = val;
    }

    public Node(int val, Node next, Node prev) {
        this.val = val;
        this.next = next;
        this.prev = prev;
    }
}
}
class DDL{
    public static void main(String[] args) {
        DoublyLinkedList list=new DoublyLinkedList();
        list.insertfirst(5);
        list.insertfirst(4);
        list.insertfirst(3);
        list.insertfirst(2);
        list.insertfirst(1);
        list.display();

        list.insertafterkey(7,3);
        list.display();

        list.insertlast(6);
        list.display();

        list.deletefirst();
        list.display();

        list.deletebykey(7);
        list.display();

        list.deletelast();
        list.display();

      // list.displayprev();
    }
}
