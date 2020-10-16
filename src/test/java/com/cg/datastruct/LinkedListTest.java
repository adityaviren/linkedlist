package com.cg.datastruct;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {

    @Test
    public void given(){
        Node node1=new Node(56);
        Node node2=new Node(30);
        Node node3=new Node(70);
        node1.setNext(node2);
        node2.setNext(node3);
        boolean result = node1.getNext().equals(node2) && node2.getNext().equals(node3);
        Assert.assertTrue(result);
    }
    @Test
    public void givenKey_shouldReturnPresence(){
        LinkedList ll = new LinkedList();
        ll.append(70);
        ll.append(30);
        ll.add(99);
        ll.append(56);
        ll.insert(15,56);
        boolean presentAfterInserting = ll.keyPresent(56);
        Assert.assertTrue(presentAfterInserting);
        ll.pop();
        ll.popLast();
        boolean result = ll.keyPresent(30);
        Assert.assertTrue(result);
    }
}
