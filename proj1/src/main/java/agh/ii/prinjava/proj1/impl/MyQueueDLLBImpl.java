package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;

public class MyQueueDLLBImpl<E> implements MyQueue<E> {

    private DLinkList<E> elems;

    public MyQueueDLLBImpl() {
        this.elems = new DLinkList<>();
    }

    /**
     * The enqueue function adds an element at the end of the list.
     * {@link DLinkList#addLast(Object)}
     * @param x a generic element
     * */

    @Override
    public void enqueue(E x) {
        this.elems.addLast(x);
    }

    /**
     * The dequeue function removes the first element of the list.
     * {@link DLinkList#removeFirst()}
     * */

    @Override
    public E dequeue() {
        return this.elems.removeFirst();
    }

    /**
     * The numOfElems function returns the size of the list.
     * {@link DLinkList#size()}
     * @return the size of the list.
     * */

    @Override
    public int numOfElems() {
        return this.elems.size();
    }

    /**
     * The peek function shows the first element of the list.
     * {@link DLinkList#get(int)}
     * @return the first element of the list.
     * */

    @Override
    public E peek() {
        return this.elems.get(0);
    }
}
