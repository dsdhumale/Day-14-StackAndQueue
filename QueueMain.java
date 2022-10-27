package com.Bridgelabz.StackandQueue;

import java.util.Scanner;

public class QueueMain {
	static Scanner input = new Scanner(System.in);

	public static int userMenu() {
		System.out.println("Press 1 to insert in queue \nPress 2 to delete from queue \nPress 3 to  display queue");
		int choice = input.nextInt();
		return choice;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Stack And Queue List  Program");
		QueueImplementation queue = new QueueImplementation();
		boolean flag = true;
		while (flag) {
			int choice = userMenu();
			switch (choice) {
			case 1:
				System.out.println("Enter element to insert");
				int element = input.nextInt();
				queue.enqueue(element);
				flag = true;
				break;
			case 2:
				queue.dequeue();
				flag = true;
				break;
			case 3:
				queue.display();
				flag = true;
				break;
			default:
				flag = false;
				break;

			}

		}

	}
}
