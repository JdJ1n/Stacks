//IFT2015_TP1
//Jiadong Jin 20150692
package DoubleStack;

public class ArrayDoubleStack<E> implements DoubleStack<E> {
    private E[] elements;
    private int top1;
    private int top2;
    private static final int maxSize = 100;

    // Constructeur par défaut
    public ArrayDoubleStack() {
        elements = (E[]) new Object[maxSize];
        top1 = -1;
        top2 = maxSize;
    }

    // Méthode pour ajouter un élément à la pile. Lance une exception si la pile est pleine.
    public boolean push(boolean one, E element) {
        if (isFull()) {
            throw new IllegalStateException("La pile est pleine.");
        }
        if (one) {
            elements[++top1] = element;
        } else {
            elements[--top2] = element;
        }
        return true;
    }

    // Méthode pour retirer un élément de la pile. Lance une exception si la pile est vide.
    public E pop(boolean one) {
        if (isEmpty(one)) {
            throw new IllegalStateException("La pile " + (one ? "1" : "2") + " est vide.");
        }
        E result = one ? (E) elements[top1--] : (E) elements[top2++];
        if (one) {
            elements[top1 + 1] = null;
        } else {
            elements[top2 - 1] = null;
        }
        return result;
    }

    // Méthode pour obtenir l'élément au sommet de la pile. Lance une exception si la pile est vide.
    public E top(boolean one) {
        if (isEmpty(one)) {
            throw new IllegalStateException("La pile " + (one ? "1" : "2") + " est vide.");
        }
        return one ? (E) elements[top1] : (E) elements[top2];
    }

    // Méthode pour obtenir la taille actuelle de la pile.
    public int size(boolean one) {
        return one ? top1 + 1 : maxSize - top2;
    }

    // Méthode pour vérifier si la pile est pleine.
    public boolean isFull() {
        return top1 + 1 == top2;
    }

    // Méthode pour vérifier si la pile est vide.
    public boolean isEmpty(boolean one) {
        return one && top1 == -1 || !one && top2 == maxSize;
    }

    // Méthode pour imprimer le contenu des deux piles.
    public void print() {
        System.out.println("Contenu de la pile 1 :");
        for (int i = top1; i >= 0; i--) {
            System.out.println(elements[i]);
        }
        System.out.println("Contenu de la pile 2 :");
        for (int i = top2; i < maxSize; i++) {
            System.out.println(elements[i]);
        }
    }
}


