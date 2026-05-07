package com.meow.linkedlist;

//Singly LL
public class LL {
	private Node head;
	
	//insert at beginning
	public void insertAtbegin(int data) {
		Node newNode = new Node(data);
		newNode.next = head;					//this is to not lose the rest of ll.
		head = newNode;
	}
	
	//insert at end
	public void insertAtend(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		
		Node dummy = head;						//this is a pointer for iteration, beginning from head.
		while(dummy.next != null) {				//until end of LL
			dummy = dummy.next;			
		}
		dummy.next = newNode;					//assign next ptr to newNode.
	}
	
	//insert at any position
	public void insertAtany(int data, int pos) {
		Node newNode = new Node(data);
		Node dummy = head;
		if(head != null) {
			System.out.println("List is empty");
		}
		if(pos == 1) {
			newNode.next = head.next;
			head = newNode;
			return;
		}
		if(pos < 1) {
			System.out.println("Pos must be greater than one");
		}
		for(int i = 1; i < pos - 1 && dummy != null; i++) {
			dummy = dummy.next;
		}
		if(dummy == null) {
			System.out.println("Out of range");
		}
		newNode.next = dummy.next;
		dummy.next = newNode;
	}
	
	public void delAnyPos(int pos) {
		if(head == null) {
			System.out.println("List is empty");
		}
		if(pos == 1) {
			head = head.next;
			return;
		}
		
		Node dummy = head;
		if(dummy == null) {
			System.out.println("Out of range");
			return;
		}
		
		for(int i = 1; i < pos - 1 && dummy!=null; i++) {
			dummy = dummy.next;
			
		}
		
		dummy.next = dummy.next.next;
		
	}
	
	public void delByVal(int data) {
		Node dummy = head;
		Node prev = head;
		while(dummy != null) {
			if(dummy.val == data) {
				System.out.println("Data deleted");
				prev.next = dummy.next.next;
				return;
			}
			else {
				prev = dummy;
				dummy = dummy.next;
			}
		}
		System.out.println("Not found");
		return;
	}
	
	public void dispList() {
		if (head == null) {
			System.out.println("ll is empty");
		}
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.val + " -> ");
	        temp = temp.next; // Move to the next node
	    
		}
		System.out.println("null");
	}
	
	public boolean search(int data) {
		if(head == null) {
			System.out.println("LL is empty");
		}
		Node temp = head;
		while(temp != null) {
			if(temp.val == data) {
				System.out.println("Exists");
				return true;
			}
			temp = temp.next;
		}
		return false;
	}
}
