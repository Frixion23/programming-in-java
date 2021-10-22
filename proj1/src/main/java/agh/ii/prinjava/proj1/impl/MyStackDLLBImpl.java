package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;

public class MyStackDLLBImpl<E> implements MyStack<E> {
    private DLinkList<E> elems;

    public MyStackDLLBImpl() {
        this.elems = new DLinkList<>();
    }

    /**
     * The pop function removes the last item of the list.
     * {@link DLinkList#removeLast()}
     * @return the list without the last element.
     * */

    @Override
    public E pop() {
        return elems.removeLast();
    }

    /**
     * The push function adds an item at the end of a list.
     * {@link DLinkList#addLast(Object)}
     * */

    @Override
    public void push(E x) {
        elems.addLast(x);
    }

    /**
     * The numOfElems function returns the size of the list.
     * {@link DLinkList#size()}
     * @return the size of the list.
     * */

    @Override
    public int numOfElems() {
        return elems.size();
    }

    /**
     * The peek shows the last item of the list.
     * {@link DLinkList#get(int)}
     * @see MyStackDLLBImpl#numOfElems()
     * @return the last element of the list.
     * */

    @Override
    public E peek() {
        return elems.get(numOfElems()-1);
    }
}
