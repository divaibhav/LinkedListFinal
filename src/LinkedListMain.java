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


}
public class LinkedListMain {
}
