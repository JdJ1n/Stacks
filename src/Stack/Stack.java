package Stack;

public interface Stack<E> {
    void push(E e);
    E pop();
    E peek();
    boolean empty();
    int search(Object o);
}
