package com.javashowcase;

public class LinkListIterator<T> {

	public void iterator(LinkList<T> linklist) {
		MyNode<T> node = linklist.head;
		MyNode<T> temp = node;
		
		while(temp != null) {
			if(temp.getNext() != null) {
				System.out.print(temp.getKey() + "-->");
			}else {
				System.out.print(temp.getKey());
			}
			temp = temp.getNext();
			}
	 }
}
