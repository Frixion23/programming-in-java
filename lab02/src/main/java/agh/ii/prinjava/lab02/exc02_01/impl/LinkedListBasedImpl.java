package agh.ii.prinjava.lab02.exc02_01.impl;

import agh.ii.prinjava.lab02.exc02_01.StackOfInts;

public class LinkedListBasedImpl implements StackOfInts {

    private Node head;

    @Override
    public int pop() {

        if (head != null) {
            Node last = head;
            Node previous = head;

            while (last.next != null) {
                previous = last;
                last = last.next;
            }

            previous.next = null;

            return last.elem;
        }

        throw new IllegalStateException("There is no head in the list");
    }

    @Override
    public void push(int x) {
        if (head == null) {
            head = new Node(x);
        }

        else {
            Node last = head;

            while (last.next != null) {
                last = last.next;
            }

            last.next = new Node(x);
        }
    }

    @Override
    public int numOfElems() {

        if (head == null) return 0;

        numOfElems = 0;

        for (Node n = head; n != null; n = n.next) numOfElems++;

        return numOfElems + 1;
    }

    @Override
    public int peek() {

        if (head != null) {
            Node temp = head;
            head = head.next;

            return temp.elem;
        }

        throw new IllegalStateException("There is no head in the list");
    }

    private static class Node {
        int elem;
        Node next;

        public Node(int elem) {
            this.elem = elem;
        }
    }

    private int numOfElems = 0;
}