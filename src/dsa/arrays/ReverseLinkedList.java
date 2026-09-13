package dsa.arrays;
import java.util.LinkedList;
public class ReverseLinkedList {

	Node head;
	
	static class Node{
	int data;
	Node next;

	Node(int data){
		this.data =data;
		this.next=null;
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    Node head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);
    head.next.next.next = new Node(4);

    System.out.println("Original List:");
    printList(head);

    head = reverseNode(head);

    System.out.println("Reversed List:");
    printList(head);
}

private static void printList(Node head) {
    Node current = head;
    while (current != null) {
        System.out.print(current.data + " -> ");
        current = current.next;
    }
    System.out.println("null");
}
private static Node reverseNode(Node head) {
    Node prevNode = null;
    Node currentNode = head;
    while (currentNode != null) {
        Node nextNode = currentNode.next;
        currentNode.next = prevNode;
        prevNode = currentNode;
        currentNode = nextNode;
    }
    return prevNode;
}
}

