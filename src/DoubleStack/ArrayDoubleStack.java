package DoubleStack;

public class ArrayDoubleStack<E> implements DoubleStack<E> {
    private E[] elements;
    private int top1;
    private int top2;
    private static final int MAX_SIZE = 100;

    public ArrayDoubleStack() {
        elements = (E[]) new Object[MAX_SIZE];
        top1 = -1;
        top2 = MAX_SIZE;
    }

    public E push(E item, boolean one) {
        if (isFull()) {
            throw new IllegalStateException("Cannot add to full stack");
        }
        if (one) {
            elements[++top1] = item;
        } else {
            elements[--top2] = item;
        }
        return item;
    }

    public E pop(boolean one) {
        if (one && top1 == -1) {
            throw new IllegalStateException("Cannot pop from empty stack");
        }
        if (!one && top2 == MAX_SIZE) {
            throw new IllegalStateException("Cannot pop from empty stack");
        }
        return one ? elements[top1--] : elements[top2++];
    }

    public E top(boolean one) {
        if (one && top1 == -1) {
            throw new IllegalStateException("Cannot peek into empty stack");
        }
        if (!one && top2 == MAX_SIZE) {
            throw new IllegalStateException("Cannot peek into empty stack");
        }
        return one ? elements[top1] : elements[top2];
    }

    public int size(boolean one) {
        return one ? top1 + 1 : MAX_SIZE - top2;
    }

    public boolean isFull() {
        return top1 + 1 == top2;
    }

    public void print() {
        System.out.println("Stack 1:");
        for (int i = top1; i >= 0; i--) {
            System.out.println(elements[i]);
        }
        System.out.println("Stack 2:");
        for (int i = top2; i < MAX_SIZE; i++) {
            System.out.println(elements[i]);
        }
    }
}
