package com.javashowcase;

public class LinkList<T> {
	
	MyNode head = null;
	private MyNode tail = null;
	private MyNode temp = null;
	
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
	

}
