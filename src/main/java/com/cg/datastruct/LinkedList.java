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
    Node head = null;
    Node tail = null;

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
