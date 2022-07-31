package com.javashowcase;

public class MyNodeTest {

	public static void main(String[] args) {
    	MyNode<Integer> myFirstNode = new MyNode<>(56);
    	MyNode<Integer> mySecondNode = new MyNode<>(30);
    	MyNode<Integer> myThirdNode = new MyNode<>(70);
    	myFirstNode.setNext(mySecondNode);
    	mySecondNode.setNext(myThirdNode);
    	
    	LinkList<Integer> list = new LinkList<>();
    	list.add(myFirstNode);
    	list.add(mySecondNode);
    	list.add(myThirdNode);
    	
    	LinkListIterator<Integer> it = new LinkListIterator<>();
        it.iterator(list);
    	
	}

}
