//IFT2015_TP1
//Jiadong Jin 20150692
package SpecialStack;

public interface SpecialStack<E extends Comparable<E>> {
    void push(E element);

    E pop();

    E top();

    int size();

    boolean isEmpty();

    String toString();

    E getMax();
}

