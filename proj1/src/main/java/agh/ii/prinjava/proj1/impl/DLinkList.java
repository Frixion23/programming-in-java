package agh.ii.prinjava.proj1.impl;


public class DLinkList<E> {

    /**
     * First, we define the Node class which is a DLL (Double Linked List).
     *
     * */

    private static class Node<T> {
        T elem;
        Node<T> next;
        Node<T> prev;

        public Node(T elem,Node<T> next,Node<T> prev){
            this.elem = elem;
            this.next = next;
            this.prev = prev;
        }
    }

    private Node<E> head;
    private Node<E> tail;
    /**
     * A simple function that returns the size of the list.
     * I did this function to simplify next functions.
     * @see MyQueueDLLBImpl#numOfElems()
     * @see MyStackDLLBImpl#numOfElems()
     * @return the size of the list.
     * */
    public int size() {
        if (head == null || tail == null) {
            return 0;
        }

        Node<E> n = head;
        int size = 0;

        while(n != null) {
            n = n.next;
            size++;
        }

        return size;
    }

    /**
     * Same as size(), get() was done to simplify next functions.
     * @see MyQueueDLLBImpl#peek()
     * @see MyStackDLLBImpl#peek()
     * @throws IllegalStateException if the user wants to get an element that is not in the list.
     * @return the chosen element
     * */

    public E get(int i) {

        if (i > size()) {
            throw new IllegalStateException("The size entered is not in the list");
        }

        Node<E> n = head;
        int limit = 0;

        while(n != null && limit < i) {
            n = n.next;
            limit++;
        }

        return n.elem;
    }

    /**
     * The addFirst() function adds an element at the beginning of the DLL.
     * The function checks if the list is empty or not to make sure every possibility is taken into account.
     * @param x a generic element.
     * */

    public void addFirst(E x){
        if (head == null || tail == null){
            head = new Node<>(x, null, null);
            tail = head;
        }
        else {
            Node<E> node = head;
            head = new Node<>(x,node.next, null);
            node.prev = head;
            head.next = node;
        }
    }

    /**
     * The addLast() function adds an element at the end of the DLL.
     * The function checks if the list is empty or not to make sure every possibility is taken into account.
     * @param x a generic element.
     * */

    public void addLast(E x){
        if (head == null || tail == null){

            head = new Node<>(x, null, null);

            head.next = null;
            head.prev = null;

            tail = head;
        }
        else {
            Node<E> node = new Node<>(x, null, tail);
            tail.next = node;
            tail = node;
        }

    }

    /**
     * The removeFirst() function removes the first element of a DLL.
     * The function checks if the list is empty or not to make sure every possibility is taken into account.
     * @throws IllegalStateException if the list is empty.
     * @return the new first element.
     * */

    public E removeFirst(){
        Node<E> node;
        node = head;

        if (head == null || tail == null){
            throw new IllegalStateException("The list is empty");
        }

        if (head == tail){
            head = null;
            tail = null;
        }

        else {
            head = head.next;

            if (head == null) {
                tail = null;
            } else
                head.prev = null;
        }
        return node.elem;
    }

    /**
     * The removeLast() function removes the last element of a DLL.
     * The function checks if the list is empty or not to make sure every possibility is taken into account.
     * @throws IllegalStateException if the list is empty.
     * @return the new last element.
     * */

    public E removeLast(){
        Node<E> node;
        node = tail;

        if (head == null){
            throw new IllegalStateException("The list is empty");
        }

        if (head == tail){
            head = null;
            tail = null;
        }

        else{
            tail = tail.prev;
            tail.next = null;
        }
        return node.elem;
    }

    /**
     * The toString() is used to show the list, so we can visualize it more.
     * The function checks if the list is empty or not to make sure every possibility is taken into account.
     * @throws IllegalStateException if the list is empty.
     * @return the new first element.
     * */

    @Override
    public String toString(){
        StringBuilder list = new StringBuilder();
        Node<E> node = head;

        while (node.next != null){
            list.append(node.elem.toString()).append("<--");
        }
        return list.toString();
    }


}
