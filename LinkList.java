package com.javashowcase;

import java.util.Scanner;

public class LinkList<T> {
	
	
	Scanner sc = new Scanner(System.in);
	MyNode head = null;
	private MyNode tail = null;
	private MyNode temp = null;
	private MyNode pointer = null;
	
	public void append(MyNode<T> newnode) {
		if(head == null && tail == null) {
			head = newnode;
			tail = newnode;
			temp = newnode;
		}else {
			temp.setNext(newnode);
			tail = newnode;
			tail.setNext(null);
			temp = newnode;
		}
	}
	
	public void add(MyNode<T> newnode) {
		if(head == null && tail == null) {
			head = newnode;
			tail = newnode;
			temp = newnode;
		}else {
			temp = newnode;
			temp.setNext(head);
			head = newnode;
		}
	}
	
	public void insert(MyNode<T> newnode ,MyNode<T>  oldnode) {
		pointer = head;
		int flag = 0;
		while(pointer != null) {
			if(pointer.getKey() == oldnode.getKey()) {
				newnode.setNext(pointer.getNext());
				pointer.setNext(newnode);
				flag++;
			}
			pointer = pointer.getNext();
			//return head;
		}
		if(flag == 0) {
			System.out.println("Node does not exist");
		}
	}
	

}
