package com.Bridgelabz.StackandQueue;

public class StackImplementation {
	private Node top;

	public StackImplementation() {
		this.top = top;
	}

//Method for pushing element in stack
	public void push(int element) {

		Node node = new Node();
		node.data = element;
		if (node == null) {
			node.next = null;
		} else {
			node.next = top;
			top = node;
		}

	}

	// Method for displaying elements of stack
	public void display() {
		if (top == null)
			System.out.println("Stack is empty");
		else {
			Node temp = top;
			while (temp.next != null) {
				System.out.print(temp.data + " -> ");
				temp = temp.next;
			}
			System.out.println(temp.data);

		}
	}

	// Method for displaying top element of stack
	public void peek() {
		System.out.println(" Top element of stack is = " + top.data);

	}

	// Method for delete element of stack
	public void pop() {
		if (top == null)
			System.out.println("stack is empty");
		else {
			Node temp = top;
			System.out.println("deleted element is:" + temp.data);

			top = temp.next;
		}
	}
}
