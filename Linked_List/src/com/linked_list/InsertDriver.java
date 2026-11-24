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

public class InsertDriver {
	public Node insertAtNode(Node head, int newData) {
		Node newNode = new Node(newData, head);
		return newNode;
	}
	public void printNode(Node head) {
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

}
