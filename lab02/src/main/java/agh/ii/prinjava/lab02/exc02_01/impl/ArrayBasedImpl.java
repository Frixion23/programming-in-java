package agh.ii.prinjava.lab02.exc02_01.impl;

import agh.ii.prinjava.lab02.exc02_01.StackOfInts;

public class ArrayBasedImpl implements StackOfInts {

    private int[] array;

    public ArrayBasedImpl() {
        this.array = new int[]{};
    }

    @Override
    public int pop() {
        if (array.length > 0) {
            int[] copy = new int[array.length - 1];

            for (int i = 0; i < array.length - 1; i++) {
                copy[i] = array[i];
            }

            int value = array[array.length-1];
            array = copy;

            return value;
        }
        throw new IllegalStateException("No elements in the array");
    }

    @Override
    public void push(int x) {

        if (array.length == 0) {
            this.array = new int[1];
            this.array[0] = x;
        }

        else {
            int[] copy = new int[array.length + 1];

            for (int i = 0; i < array.length; i++) {
                copy[i] = array[i];
            }

            copy[array.length] = x;
            array = copy;
        }
    }

    @Override
    public int numOfElems() {
        return array.length;
    }

    @Override
    public int peek() {
        if (array.length > 0) {
            int[] copy = new int[array.length - 1];

            for (int i = 1; i < array.length; i++) {
                copy[i-1] = array[i];
            }

            int value = array[0];
            array = copy;

            return value;
        }
        throw new IllegalStateException("No elements in array");
    }

    private int numOfElems = 0;
}