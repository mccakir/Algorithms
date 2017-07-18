package com.murat.datastructures;

public class StackWithLinkedlist {

	Node head;
	private class Node{
		int value;
		Node next;
	}
	
	public StackWithLinkedlist(){
		head=null;
	}
	
	public int pop(){
		if(head == null){
			System.out.println("Stack is empty!");
			return -1;
		}
		else{
			int value = head.value;
			head=head.next;
			System.out.println("Popped element:"+ value);
			return value;
		}
	}
	
	public void push(int value){
		Node oldHead = head;
		head = new Node();
		head.value = value;
		head.next=oldHead;
		System.out.println("Pushed Element:"+ value);
	}
	
	public static void main(String[] args) {
		StackWithLinkedlist stack = new StackWithLinkedlist();
		stack.pop();
		stack.push(1);
		stack.push(3);
		stack.push(18);
		stack.push(7);
		stack.pop();
		stack.pop();
	}
	
	

}
