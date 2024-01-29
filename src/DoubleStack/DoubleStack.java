package DoubleStack;

public interface DoubleStack<E> {
    E push(E item, boolean one);
    E pop(boolean one);
    E top(boolean one);
    int size(boolean one);
    boolean isFull();
    void print();
}
