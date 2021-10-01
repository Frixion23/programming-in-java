package agh.ii.prinjava.lab02.exc02_01.impl;

import agh.ii.prinjava.lab02.exc02_01.StackOfInts;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListBasedImplTest {

    // Create an empty stack
    private final StackOfInts stackOfInts = StackOfIntsFtry.create(StackOfIntsFtry.Impln.ARRAY_B);

    @BeforeEach
    void setUp() {
        stackOfInts.push(1);
        stackOfInts.push(2);
        stackOfInts.push(3);
        stackOfInts.push(4);
    }

    @AfterEach
    void tearDown() {

    }

    @Test
    void newStackIsEmpty() {

    }

    @Test
    void pop() {
        assertEquals(4, stackOfInts.pop());
        assertEquals(3, stackOfInts.pop());
        assertNotEquals(124, stackOfInts.pop());
        assertEquals(1, stackOfInts.pop());

        assertThrows(IllegalStateException.class, stackOfInts::pop);
    }

    @Test
    void peek() {
        assertEquals(1, stackOfInts.peek());
        assertEquals(2, stackOfInts.peek());
        assertNotEquals(124, stackOfInts.peek());
        assertEquals(4, stackOfInts.peek());

        assertThrows(IllegalStateException.class, stackOfInts::peek);
    }
}