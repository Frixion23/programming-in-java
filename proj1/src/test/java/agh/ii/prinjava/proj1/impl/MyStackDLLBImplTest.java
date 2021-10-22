package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStackDLLBImplTest {
    MyStack<Integer> stackOfInts = MyStack.create();

    /**
     * First, we set up the list by pushing some elements to it.
     * {@link MyStack#push(Object)}
     * */

    @BeforeEach
    void setUp() {
        stackOfInts.push(15);
        stackOfInts.push(30);
        stackOfInts.push(130);
    }

    @AfterEach
    void tearDown() {
    }

    /**
     * Then, we test the pop function which deletes the last element of the list.
     * {@link MyStack#pop()}
     * */

    @Test
    void pop() {
        assertEquals(130,stackOfInts.pop());
        assertEquals(30,stackOfInts.pop());
    }

    /**
     * Now, let's check quickly if the number of elements in the list is good.
     * {@link MyStack#numOfElems()}
     * */


    @Test
    void numOfElems(){
        assertEquals(3,stackOfInts.numOfElems());
    }

    /**
     * Finally, we can check if the peek function works.
     * {@link MyStack#push(Object)}
     * */

    @Test
    void peek(){
        assertEquals(130,stackOfInts.peek());
    }
}