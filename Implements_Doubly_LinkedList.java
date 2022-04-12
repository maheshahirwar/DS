import java.util.*;
public class Implements_Doubly_LinkedList
{
	public static void main(String[] args) {
	DoublyLinkedList dll=new DoublyLinkedList();
	dll.addFirst(5);
	dll.addFirst(3);
	dll.addFirst(4);
	dll.addLast(56);
	dll.addLast(78);
	dll.addFirst(6);
	dll.addFirst(88);
	dll.addLast(66);
	dll.addLast(34);
	dll.removeLast();
	dll.removeFirst();
	dll.removeNode(dll.head.next.next);
	dll.printList();
	dll.removeAtPos(4);
	System.out.println();
	dll.printList();
}
}
class DoublyLinkedList{
    Node head;
    class Node{
        int data;
        Node prev;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
public void printList(){
    Node temp=head;
    while(temp!=null){
	    System.out.print(temp.data+" ");
	    temp=temp.next;
	}
}
public void removeAtPos(int pos){
    if(head==null)return;
    Node temp=head;
    while(pos-->0){
        temp=temp.next;
    }
    temp.prev.next=temp.next;
    temp.next.prev=temp.prev;
}
public void addFirst(int x){
     Node newNode=new Node(x);
     if(head==null){
       newNode.prev=null;
       newNode.next=null;
       head=newNode;
       return;
      }
     newNode.prev=null;
     newNode.next=head;
     head.prev=newNode;
     head=newNode;
 }

public void addLast(int x){
    Node newNode=new Node(x);
    Node temp=head;
    if(head==null){
        newNode.next=null;
        newNode.prev=null;
        head=newNode;
        return;
    }
    while(temp.next!=null){
        temp=temp.next;
    }
    Node nextNode=temp;
    nextNode.next=newNode;
    newNode.prev=nextNode;
    newNode.next=null;
    return;
}

public void removeFirst(){
    if(head==null)return;
    if(head.next==null){
        head=null;
        return;
    }
    Node nextNode=head.next;
    nextNode.prev=null;
    head=nextNode;
}
public void removeLast(){
    if(head==null)return;
    if(head.next==null){
        head=null;
        return;
    }
    Node temp=head;
    while(temp.next!=null){
        temp=temp.next;
    }
    Node preNode=temp.prev;
    preNode.next=null;
    
}
 public void removeNode(Node del){
   if(head==null||del==null)return;
   if(head==del){
       head=del.next;
       return;
   }
   if(del.prev!=null){
       del.prev.next=del.next;
   }
   if(del.next!=null){
       del.next.prev=del.prev;
   }
 }
 
}
