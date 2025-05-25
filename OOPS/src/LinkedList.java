public class LinkedList {

        private Node head;
        private Node tail;
        private int size;

        public void Node() {
            this.size=0;
        }

        public void insertfirst(int value){
            Node node =new Node(value);
            node.next=head;
            head=node;

            if(tail==null){
                tail=head;
            }
            size+=1;
            //display();
        }

        public  void insert(int value,int index){
            if(index==0){
                insertfirst(value);
                return;
            }
            if(index==size){
                insertlast(value);
                return;
            }
            Node temp=head;
            for (int i = 1; i <index ; i++) {
                temp=temp.next;
            }
            Node node=new Node(value,temp.next);
            temp.next=node;
            size++;
        }

        public void insertafterkey(int key,int value){
            Node cur=head;
            while (cur!=null&&cur.value!=key){
                cur=cur.next;
            }
            if(cur==null){
                System.out.println(key+" had not been found");
                return;
            }
            Node node=new Node(value);
            node.next=cur.next;
            cur.next=node;
            size++;
        }

        public  void insertlast(int value){
            Node node=new Node(value);
            if(tail==null){
                insertfirst(value);
                return;
            }
           tail.next=node;
           tail=node;
           size++;
          //  display();
        }

        public  void deletefirst(){
            int v= head.value;;
            head=head.next;
            if(head==null){
                tail=null;
            }
            size--;
            System.out.println(v+" is removed");
        }

        public void deleteindex(int index){
            if(index==0){
                deletefirst();
            }if(index==size){
                deletelast();
            }
            Node prev=get(index-1);
            int v=prev.next.value;
            prev.next=prev.next.next;
            System.out.println(v+ " is the value  being deleted");
            size--;
        }

        public void deletebykey(int key) {

        Node cur=head;
        Node prev=null;
        while (cur!=null&&cur.value!=key){
            prev=cur;
            cur=cur.next;
        }
        if(cur==null){
            System.out.println(key+" had not been found");
            return;
        }
        System.out.println(cur.value+" is deleted ");
        prev.next=cur.next;
        size--;
        }

        public void deletelast(){
            if(size<=1){
                deletefirst();
            }else{
            Node sec=get(size-2);
            int v=tail.value;
            tail=sec;
            tail.next=null;

//            Node cur=head;
//            Node prev=null;
//            while(cur!=null){
//                prev=cur;
//                cur=cur.next;
//            }
//            int v= prev.value;
//            prev=null;
//            cur=null;
            size--;
                System.out.println(v+" is the last value and it is removed");}
        }

    private Node get(int index) {
            Node node=head;
        for (int i = 0; i <index ; i++) {
            node=node.next;
        }return node;
    }

    private Node find(int value) {
        Node node=head;
        while(node!=null) {
            if(node.value==value){
                return node;
            }
            node=node.next;
        }return null;
    }

    public  void display(){

            Node temp=head;
            while(temp!=null){
                System.out.print(temp.value+" -> ");
                temp=temp.next;
            }
            System.out.println("END");
        System.out.println("size of node is "+size);
        System.out.println();
    }



    private class Node{
      private   int value;
       private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

}

class LL{
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
list.insertfirst(3);
list.insertfirst(7);
list.insertlast(2);
list.insertlast(6);
list.insertlast(99);
list.display();

list.insert(66,2);
list.display();

list.insertafterkey(2,80);
list.display();



list.deletefirst();
list.display();

list.deleteindex(4);
list.display();

list.deletebykey(2);
list.display();

list.deletelast();
list.display();
    }
}
