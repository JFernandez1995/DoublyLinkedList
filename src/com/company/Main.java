package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        DoublyLinkedList DLL = new DoublyLinkedList();


        DLL.addFirst( 5 );
        DLL.addFirst( 2);
        DLL.addFirst( 1 );
        DLL.addLast(6);
        DLL.addLast(7);
        DLL.addLast(8);



        System.out.println(DLL.size());
        System.out.println(DLL.getFirst());
        System.out.println(DLL.getLast());


    }
}
