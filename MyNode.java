package com.javashowcase;

public class MyNode<T> {

	private T key; 
	private MyNode<T> next ;
	
	public MyNode(T key) {
		this.key = key;
		this.next  = next;
	}
		
	public T getKey() {
		return key;
	}
	public void setKey(T key) {
		this.key = key;
	}
	public MyNode<T> getNext() {
		return next;
	}
	public void setNext(MyNode<T> next) {
		this.next = (MyNode<T>)next;
	}
		
}
