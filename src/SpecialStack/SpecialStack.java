//IFT2015_TP1
//Jiadong Jin 20150692
package SpecialStack;

public interface SpecialStack<Integer> {
    void push(Integer element);

    Integer pop();

    Integer top();

    int size();

    boolean isEmpty();

    String toString();

    Integer getMax();
}

