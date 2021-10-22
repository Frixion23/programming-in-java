package agh.ii.prinjava.proj1.impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DLinkListTest {
    DLinkList<Integer> dLinkList = new DLinkList<>();
    
    /**
     * First, we use the addFirst function to add elements into the DLL.
     * {@link DLinkList#addFirst(Object)}
     * */
    
    @BeforeEach
    void setUp() {
        dLinkList.addFirst(5);
        dLinkList.addFirst(4);
    }

    @AfterEach
    void tearDown() {
    }
    
    /**
     * Here we can check if the removeFirst function works.
     * {@link DLinkList#removeFirst()} ()}
     * */
    
    @Test
    void addFirst(){
        Assertions.assertEquals(4,dLinkList.removeFirst());
        Assertions.assertEquals(5, dLinkList.removeFirst());
    }

    /**
     * Finally, here we can check if the addLast and removeLast functions work.
     * {@link DLinkList#removeLast()}
     * {@link DLinkList#addLast(Object)}
     * */

    @Test
    void addLast(){
        Assertions.assertEquals(5,dLinkList.removeLast());
        dLinkList.addLast(18);
        Assertions.assertEquals(18, dLinkList.removeLast());
        Assertions.assertEquals(4, dLinkList.removeLast());
    }
}