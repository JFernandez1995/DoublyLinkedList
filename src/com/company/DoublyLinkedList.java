package com.company;

public class DoublyLinkedList {


    //initialize header and trailer nodes
    private Node header;
    private Node trailer;
    private int size = 0;

    public DoublyLinkedList(){

        header = new Node(-1,null,null); //we just set -1 for value of the header
        trailer = new Node(-1, header,null); //we just set -1 for value of the trailer and set the prev pointer to header
        header.setNext( trailer ); // we set the next node to be the trailer node
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        if (size == 0){return true;}
        else return false;
    }

    public int getFirst(){
        if(isEmpty()){return 0;}

        else{
            return header.getNext().getElement(); //get next element of the next node
        }
    }

    public int getLast(){
        if(isEmpty()){return 0;}

        else{
            return trailer.getPrev().getElement(); //get previous element of the next node
        }
    }
    /*What we want to do is make helper functions to help add first and add last*/


    /*What we want to do is make helper functions to help add first and add last*/


    public void addFirst(int val){

        addBetween( val,header,header.getNext()); //insert value, add node between header and the next node after the header

    }

    public void addLast(int val){

        addBetween( val,trailer.getPrev(),trailer); //insert between previous node of the trailer and trailer

    }

     public void removeFirst() {


        remove( header.getNext() );
    }

    public void removeLast() {


        remove( trailer.getPrev() );
    }

    public void printHead(){

        System.out.println( header.getNext().getElement() );
    }

    public void printTail(){

        System.out.println( trailer.getPrev().getElement() );
    }


    private void addBetween(int val, Node predecessor, Node successor){ //this private method is a helper function to add between successor and predecessor

        Node newest = new Node(val,successor,predecessor ); // this will create a new node with pointers to the successor and header
        predecessor.setNext( newest );
        successor.setPrev( newest );
        size++;

    }

    private void remove(Node nodeRem){

        Node predecessor = nodeRem.getPrev(); //we can delcare the predecessor node as the previous node
        Node successor = nodeRem.getNext();    //we can declare the successor node as the node next to the node being deleted

        predecessor.setNext( successor );
        successor.setPrev(predecessor);

        size--;

    }


}
