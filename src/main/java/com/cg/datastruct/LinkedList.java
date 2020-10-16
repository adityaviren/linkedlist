package com.cg.datastruct;

class Node<T> {
    private T data;
    private Node next;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node(T data) {
        this.data=data;
        this.next=null;
    }
}
public class LinkedList<T> {
    private Node head = null;
    private Node tail = null;

    public void add(T d) {
        Node node = new Node(d);
        if (tail == null) {
            tail = node;
        }
        if (head == null) {
                head = node;
        } else {
                node.setNext(head);
                head = node;
        }
    }
    public void append(T d) {
        Node last = new Node(d);

        Node node = head;
        tail = last;
        if (head == null) {
            head = last;
        } else {
            while (node.getNext() != null) {
                node = node.getNext();
            }
            node.setNext(last);
        }
    }
    public void insert(T data,T beforeData) {
        Node node = new Node(data);
        Node tempNode = head;
        while (tempNode != null){
            if(tempNode.getData() == beforeData ){
                node.setNext(tempNode.getNext());
                tempNode.setNext(node);
            }
            tail=tempNode;
            tempNode=tempNode.getNext();
        }
    }

    public T peek(){
        return (T) head.getData();
    }

    public void pop(){
        head=head.getNext();
    }

    public void popLast(){
        Node temp= head;
        while(temp.getNext().getNext() != null){
            temp=temp.getNext();
        }
        temp.setNext(null);
        tail=temp;
    }

    public boolean keyPresent(T key){
        Node temp=head;
        while (temp !=null){
            if(temp.getData()==key){
                return true;
            }
            temp=temp.getNext();
        }
        return false;
    }
    public void delete(T data) {
        Node tempNode = head;
        while (tempNode != null){
            if(tempNode.getNext().getData() == data ){
                tempNode.setNext(tempNode.getNext().getNext());
            }
            tail=tempNode;
            tempNode=tempNode.getNext();
        }
    }

    public void printLinkedList(){
        Node node = head;
        while (node != null) {
            System.out.print(node.getData());
            if (node != tail) {
                System.out.print(" -> ");
            }
            node = node.getNext();
        }
    }
}
class Stack<T> extends LinkedList{
    Node top = null;

    @Override
    public void add(Object d) {
        super.add(d);
    }

    @Override
    public void printLinkedList() {
        super.printLinkedList();
    }

    @Override
    public void pop() {
        super.pop();
    }

    @Override
    public Object peek() {
        return super.peek();
    }

}
