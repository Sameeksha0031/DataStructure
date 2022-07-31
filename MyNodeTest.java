package com.javashowcase;

public class MyNodeTest {

	public static void main(String[] args) {
    	MyNode<Integer> myFirstNode = new MyNode<>(56);
    	MyNode<Integer> mySecondNode = new MyNode<>(30);
    	MyNode<Integer> myThirdNode = new MyNode<>(70);
    	
    	LinkList<Integer> list = new LinkList<>();
    	/*list.add(myFirstNode);
    	list.add(mySecondNode);
    	list.add(myThirdNode);
    	
    	LinkListIterator<Integer> it = new LinkListIterator<>();
        it.iterator(list);*/
    	
        list.append(myFirstNode);
        list.append(mySecondNode);
        list.append(myThirdNode);
        
        LinkListIterator<Integer> ti = new LinkListIterator<>();
        ti.iterator(list);
	}

}
