package com.murat.datastructures;

public class SinglyLinkedList {

	public class Node {
		int data;
		Node next;
		
		public void printData(){
			System.out.println(data);
		}
	}
	
	static Node head;
	
	//Check isEmpty
	public boolean isEmpty(){
		return (head == null);
	}
	
	//Insert new node to head
	public void insertToHead(int data){
		Node n = new Node();
		n.data = data;
		n.next = head;
		head = n;
	}
	
	//Insert new node to last
	public void insertToLast(int data){
		//Add as head node
		if(isEmpty()){
			Node headNode = new Node();
			headNode.data = data;
			head = headNode;
		}
		//Add to last
		else{
			Node currentNode = head;
			while(currentNode.next!=null){
				currentNode=currentNode.next;
			}
			Node n = new Node();
			n.data = data;
			currentNode.next = n;
		}
	}
	
	//Delete a node
	public void deleteNode(Node n){
		Node currentNode = head;
		while(currentNode.next != null){
			if(n == currentNode){
				currentNode=currentNode.next;
				break;
			}
		}
	}
	
	//Print linked list head to last
	public static void printLinkedList(){
		Node currentNode = head;
		while(currentNode.next != null){
			currentNode.printData();
			currentNode=currentNode.next;
		}
		currentNode.printData();
	}
	
	public static void main(String [] args){
		SinglyLinkedList sll=new SinglyLinkedList();
//		sll.insertToHead(15);
//		sll.insertToHead(20);
//		sll.insertToHead(42);
//		sll.insertToHead(12);
//		sll.insertToHead(99);
		
		sll.insertToLast(15);
		sll.insertToLast(20);
		sll.insertToLast(42);
		sll.insertToLast(12);
		sll.insertToLast(99);
		System.out.println("started");
		sll.printLinkedList();
		
	}
	
	
	

}