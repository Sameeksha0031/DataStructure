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
	
	public void search(MyNode<T> searchnode) {
		pointer = head;
		int flag = 0;
		while(pointer != null) {
			if(pointer.getKey() == searchnode.getKey()) {
				  System.out.println(searchnode.toString() +" is find at "+flag+ " position");
				}
			  flag++;
			  pointer = pointer.getNext();
			}
		if(flag == 0) {
			System.out.println("Node does not exist");
		}
	}
	
	public void removeFirstelement() {
		pointer = head;
		//System.out.println(pointer + "is deleted");
		//pointer.setNext(head);
		head = pointer.getNext(); 
	}
	
	public void removeLastelement() {
		pointer = head;
		while(pointer.getNext() != tail) {
		  //System.out.println(pointer + "is deleted");
		  pointer = pointer.getNext();
		}
		pointer.setNext(null);
	    pointer = tail;
	 }
	
	public void removeTheGivenElement(MyNode<T> givenElement) {
		pointer = head;
		int flag = 0;
		while(pointer != null) {
			temp = pointer;
			pointer = pointer.getNext();
			if(pointer.getKey() == givenElement.getKey()) {
				 temp.setNext(pointer.getNext());
	    		}
			flag++;
		 }
		if(flag == 0) {
			System.out.println("Node does not exist");
		}
	}

}
