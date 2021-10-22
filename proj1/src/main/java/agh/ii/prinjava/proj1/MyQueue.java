package agh.ii.prinjava.proj1;

import agh.ii.prinjava.proj1.impl.MyQueueDLLBImpl;

/**
 * It is a classic queue with the "first in / last out" principle.
 * @param <E>
 */

public interface MyQueue<E> {
    /**
     * The enqueue function adds an element at the end of a list.
     * {@link MyQueueDLLBImpl#enqueue(Object)}
     */
    void enqueue(E x);
    /**
     * The dequeue function removes the first element of a list.
     * {@link MyQueueDLLBImpl#dequeue()}
     */
    E dequeue();

    default boolean isEmpty() {
        return numOfElems() == 0;
    }
    /**
     * numOfElems returns the size of the list.
     * {@link MyQueueDLLBImpl#numOfElems()}
     */
    int numOfElems();
    /**
     * The peek function allows us to see the first element of a list.
     * {@link MyQueueDLLBImpl#peek()}
     */
    E peek();

    static <T> MyQueue<T> create() {
        return new MyQueueDLLBImpl<>();
    }
}
