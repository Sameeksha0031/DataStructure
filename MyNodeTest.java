package com.javashowcase;

public class MyNodeTest {

	public static void main(String[] args) {
		System.out.println("hello");
    	MyNode<Integer> myFirstNode = new MyNode<>(56);
    	MyNode<Integer> mySecondNode = new MyNode<>(70);
    	MyNode<Integer> myThirdNode = new MyNode<>(30);
    	myFirstNode.setNext(mySecondNode);
    	mySecondNode.setNext(myThirdNode);
    	/*boolean result = myFirstNode.getNext().equals(mySecondNode) &&
    			         mySecondNode.getNext().equals(myThirdNode);
    	assert(result);*/
    	
	}

}
