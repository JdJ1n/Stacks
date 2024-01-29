package Stack;

public interface Stack<E> {
    E push(E item);
    E pop();
    E peek();
    boolean empty();
    int search(Object o);
}
