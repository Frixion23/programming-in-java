package agh.ii.prinjava.proj1;

import agh.ii.prinjava.proj1.impl.MyStackDLLBImpl;

/**
 * It is a classic stack with the "first in / first out" principle.
 * @param <E>
 */

public interface MyStack<E> {
    /**
     * The pop function removes the last element of a list.
     * {@link MyStackDLLBImpl#pop()}
     */
    E pop();
    /**
     * The push function adds an elements at the end of a list.
     * {@link MyStackDLLBImpl#push(Object)}
     */
    void push(E x);

    default boolean isEmpty() {
        return numOfElems() == 0;
    }
    /**
     * numOfElems returns the size of the list.
     * {@link MyStackDLLBImpl#numOfElems()}
     */
    int numOfElems();
    /**
     * The peek function shows us the last element of the list.
     * {@link MyStackDLLBImpl#peek()}
     */
    E peek();

    static <T> MyStack<T> create() {
        return new MyStackDLLBImpl<>();
    }
}
