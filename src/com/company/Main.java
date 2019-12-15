package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        DoublyLinkedList DLL = new DoublyLinkedList();


        DLL.addFirst( 5 );
        DLL.addFirst( 2);
        DLL.addFirst( 1 );
        DLL.addFirst(5);
        DLL.addLast(6);
        DLL.addLast(7);
        DLL.addLast(8);
        DLL.addLast(9);



        System.out.println(DLL.size()); //get size
        System.out.println(DLL.getFirst()); //get first element
        System.out.println(DLL.getLast());  //get last element
        DLL.printHead();    //should print out 5
        DLL.printTail();    //should print out 9

        DoublyLinkedList DLL_compare1 =new DoublyLinkedList();
        DoublyLinkedList DLL_compare2 =new DoublyLinkedList();

        DLL_compare1.addFirst( 1 );
        DLL_compare1.addFirst( 2 );
        DLL_compare1.addFirst( 3 );
        DLL_compare1.addLast( 8 );


        DLL_compare2.addFirst( 1 );
        DLL_compare2.addFirst( 2 );
        DLL_compare2.addFirst( 3 );
        DLL_compare2.addLast( 8);
       // DLL_compare2.addLast( 0);     //uncomment for false output


        System.out.println( DLL_compare1.equals( DLL_compare2 ) );





    }
}
