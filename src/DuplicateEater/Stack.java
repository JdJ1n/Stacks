//IFT2015_TP1
//Jiadong Jin 20150692
package DuplicateEater;

public interface Stack<E> {
    void push(E element);

    E pop();

    E top();

    int size();

    boolean isEmpty();

    boolean isFull();

    String toString();
}
