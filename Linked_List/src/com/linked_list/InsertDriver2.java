package com.linked_list;

class Node{
	int data;
	Node next;
	
	public Node(int data1, Node next1) {
		data = data1;
		next = next1;
	}
	public Node(int data2) {
		data = data2;
		next = null;
	}
}

public class InsertDriver2 {
	public Node insertAtHead(Node Head, int newData) {
		 // Creates a new node whose next points to current head
		Node newNode = new Node(newData, Head) ;
		// return the newnode as a head;
			return newNode;
		
	}
	public void printTheLinkedList(Node Head) {
		Node temp = Head;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		System.out.println();
	}

}
