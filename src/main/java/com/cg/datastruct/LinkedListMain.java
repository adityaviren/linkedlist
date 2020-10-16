package com.cg.datastruct;

public class LinkedListMain {
        public static void main(String[] args){
                createLinkedList();
                LinkedList ll = new LinkedList();
                ll.append(70);
                ll.append(30);
                ll.add(99);
                ll.append(56);
                ll.insert(15,56);
                ll.pop();
                ll.popLast();
                ll.printLinkedList();
        }

        public static void createLinkedList(){
                Node node1=new Node(56);
                Node node2=new Node(30);
                Node node3=new Node(70);
                node1.setNext(node2);
                node2.setNext(node3);
        }
}
