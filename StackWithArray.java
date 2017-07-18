package com.murat.datastructures;

public class StackWithArray {
	int size;
	int arr[];
	int top;
	
	public StackWithArray(int size){
		this.size = size;
		this.arr = new int [size];
		this.top = -1;
	}
	
	public void push(int pushedElement) {
		if (!isFull()) {
			top++;
			arr[top] = pushedElement;
			System.out.println("Pushed element:" + pushedElement);
		}
		else{
			System.out.println("Stack is full!");
		}
	}
	
	public int pop(){
		if(!isEmpty()) {
			int returnedTop = top;
			top--;
			System.out.println("Popped element:"+ arr[returnedTop]);
			return arr[returnedTop];
		}
		else{
			System.out.println("Stack is empty!");
			return -1;
		}
	}
	
	public int peek(){
		return arr[top];
	}
	
	public boolean isFull(){
		return (size-1 == top);
	}
	
	public boolean isEmpty(){
		return (top==-1);
	}
	
	public static void main (String [] args){
		StackWithArray stack=new StackWithArray(5);
		stack.pop();
		stack.push(5);
		stack.push(10);
		stack.push(8);
		stack.push(22);
		stack.pop();
		stack.pop();

	}
}
