package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyQueueDLLBImplTest {
    MyQueue<Integer> queueOfInts = MyQueue.create();

    /**
     * First, we check if enqueue works by adding elements to the list.
     * {@link MyQueueDLLBImpl#enqueue(Object)}
     * */

    @BeforeEach
    void setUp() {
        queueOfInts.enqueue(120);
        queueOfInts.enqueue(12);
    }

    @AfterEach
    void tearDown() {
    }

    /**
     * Here we can check if the dequeue function and if the error works.
     * {@link MyQueue#dequeue()}
     * */

    @Test
    void dequeue() {
        assertEquals(120, queueOfInts.dequeue());
        assertEquals(12, queueOfInts.dequeue());
        assertThrows(IllegalStateException.class, queueOfInts::dequeue);
    }
    /**
     * Now, let's check quickly if the number of elements in the list is good.
     * {@link MyQueue#numOfElems()}
     * */


    @Test
    void numOfElems(){
        assertEquals(2,queueOfInts.numOfElems());
    }

    /**
     * Finally, we can test our peek function.
     * {@link MyQueue#peek()}
     * */

    @Test
    void peek(){
        assertEquals(120,queueOfInts.peek());
    }
}