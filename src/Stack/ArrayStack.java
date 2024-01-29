package Stack;

public class ArrayStack<E> implements Stack<E> {
    private E[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 100;

    public ArrayStack() {
        elements = (E[]) new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public E push(E item) {
        if (size == elements.length) {
            throw new IllegalStateException("Cannot add to full stack");
        }
        elements[size++] = item;
        return item;
    }

    public E pop() {
        if (size == 0) {
            throw new IllegalStateException("Cannot pop from empty stack");
        }
        E result = elements[--size];
        elements[size] = null;
        return result;
    }

    public E peek() {
        if (size == 0) {
            throw new IllegalStateException("Cannot peek into empty stack");
        }
        return elements[size - 1];
    }

    public boolean empty() {
        return size == 0;
    }

    public int search(Object o) {
        for (int i = size - 1; i >= 0; i--) {
            if (o.equals(elements[i])) {
                return size - i;
            }
        }
        return -1;
    }
}

