package com.cg.datastruct;

public class LinkedListMain {
        public static void main(String[] args){
                createLinkedList();
        }

        public static void createLinkedList(){
                Node node1=new Node(56);
                Node node2=new Node(30);
                Node node3=new Node(70);
                node1.setNext(node2);
                node2.setNext(node3);
        }
}