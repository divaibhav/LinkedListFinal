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


}
public class LinkedListMain {
}
