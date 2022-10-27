package com.Bridgelabz.StackandQueue;

import java.util.Scanner;

public class StackMain {
	static Scanner input = new Scanner(System.in);

	public static int userMenu() {
		System.out.println(
				"Press 1 to push in stack \nPress 2 to delete from stack \nPress 3 to  display stack \nPress 4 to  display peek element of stack ");
		int choice = input.nextInt();
		return choice;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Stack And Queue List  Program");
		StackImplementation stack = new StackImplementation();
		boolean flag = true;
		while (flag) {
			int choice = userMenu();
			switch (choice) {
			case 1:
				System.out.println("Enter element to insert");
				int element = input.nextInt();
				stack.push(element);
				flag = true;
				break;
			case 2:
				stack.pop();
				flag = true;
				break;
			case 3:
				stack.display();
				flag = true;
				break;
			case 4:
				stack.peek();
				flag = true;
				break;
			default:
				flag = false;
				break;

			}

		}

	}

}
