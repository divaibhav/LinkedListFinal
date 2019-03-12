//node class
class Node{

    int data;
    Node next;

}
class MySinglyLinkedList{
    Node head;

    //insert at last
    void insert(Node node){
        if(head==null){
            head=node;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=node;
        }
    }

    //insert at begining
    void insertAtBeginning(Node node){
        node.next=head;
        head=node;
    }

    //insert before a node assuming the before node is prenet in list
    void insertBeforeNode(Node node, Node beforenode){
        if(head==null){
            System.out.println("list emplty");
        }
        else{
            Node temp=head;
            Node previous=null;
            while(temp.data!=beforenode.data){
                previous=temp;
                temp=temp.next;

            }
            //checking ifbeforenode is the first node then we have to insert at beginning
            if(temp==head){
                node.next=head;
                head=node;
            }
            else{
                node.next=temp;
                previous.next=temp;

            }
        }

    }
    //insert after a node
    void insertAfterNode(Node node, Node afternode){
        if(head==null){
            System.out.println("empty list");
        }
        else{
            Node temp=head;
            while(temp.data!=afternode.data){
                temp=temp.next;
            }
            node.next=temp.next;
            temp.next=node;
        }
    }

    // to display linked list
    void display(){
        System.out.println("mylist:");
        if(head==null){
            System.out.println("empty list");
        }
        else{
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"--->");
                temp=temp.next;
            }
            System.out.println("null");

        }
    }


}
public class LinkedListMain {

    public static void main(String[] args) {
        MySinglyLinkedList list=new MySinglyLinkedList();

        Node n1=new Node();
        n1.data=100;

        Node n2=new Node();
        n2.data=200;

        Node n3=new Node();
        n3.data=300;

        Node n4=new Node();
        n4.data=400;

        Node n5=new Node();
        n5.data=500;

        list.insert(n1);
        list.display();
        list.insertAtBeginning(n2);
        list.display();
        //inserting n3 that is 300 after n1 that is 100
        list.insertAfterNode(n3,n1);
        list.display();
        //inserting n4 that is 400 beofre n2 tthat is 200
        list.insertBeforeNode(n4,n2);
        list.display();
    }

}
