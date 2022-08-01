package com.javashowcase;

import java.util.Scanner;

public class MyNodeTest {
 
   static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {  	
    	LinkList<Integer> list = new LinkList<>();
        while(true) {
        	System.out.println();
        	System.out.println("Enter 0. To add\nEnter 1. To Display\nEnter 2. To Insert\nEnter 3. To Remove First Element\nEnter 4. To Remove Last Element "
        			+ "\nEnter 5. To Search\nEnter 6.To Exist");
        	System.out.println("Enter your choice");
            int choice = sc.nextInt();
        switch(choice) {
        
            case 0 :System.out.println("Enter the value you want to add");
                    Integer number = sc.nextInt();
                    MyNode<Integer> newnode = new MyNode<>(number);
                    list.append(newnode);
                    break;
                    
            case 1 :LinkListIterator<Integer> ti = new LinkListIterator<>();
                    ti.iterator(list);
                    break;
                     
            case 2 :System.out.println();
                    System.out.println("Enter the value you want to add");
                    Integer addnumber = sc.nextInt();
                    MyNode<Integer> node = new MyNode<>(addnumber);
                    System.out.println("Enter the number after which new number to be inserted");
                    Integer previousnumber = sc.nextInt();
                    MyNode<Integer> oldnode = new MyNode<>(previousnumber);
                    list.insert(node , oldnode);
                    break;
                    
            case 3 :list.removeFirstelement();
                    break;
                    
            case 4 :list.removeLastelement(); 
                    break;
                    
            case 5 :System.out.println("Enter the node to search");
                    Integer searchnumber = sc.nextInt();
                    MyNode<Integer> searchnode = new MyNode<>(searchnumber);
            	    list.search(searchnode);
            
        
        }
         if(choice == 6) {break;}
        }
        
	}

 }

