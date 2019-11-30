package com.company;

public class Node{

    //what are the node's components?

    public int data;    //data of the node
    public Node prev;   //Node of element type pointer to previous node
    public Node next;   //Node of element type pointer to next node

    //^these are the node's components

    public Node(int d, Node p, Node n){
        this.data = d;
        this.prev = p;
        this.next = n;
    }   //default constructor that initializes the data, prev pointer node and next pointer node



    public int getElement(){
        return this.data;
    }

    public Node getPrev() {return this.prev; }
    public Node getNext() { return this.next; }
    public void setPrev(Node p) { this.prev = p; }
    public void setNext(Node n) { this.next = n; }
}