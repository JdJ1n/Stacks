//IFT2015_TP1
//Jiadong Jin 20150692
package DoubleStack;

public class ArrayDoubleStack<E> implements DoubleStack<E> {
    private E[] elements;
    private int top1;
    private int top2;
    private static final int maxSize = 100;

    @SuppressWarnings(value = "unchecked")
    // Constructeur par défaut
    public ArrayDoubleStack() {
        elements = (E[]) new Object[maxSize];
        top1 = -1;
        top2 = maxSize;
    }

    // Méthode pour ajouter un élément à la pile. Lance une exception si la pile est pleine.
    @Override
    public boolean push(boolean one, E element) {
        if (isFull()) {
            System.out.println("La pile est pleine.");
            return false;
        }
        try {
            if (one) {
                elements[++top1] = element;
            } else {
                elements[--top2] = element;
            }
            return true;
        } catch (Exception e) {
            System.out.println("Ce n'est pas possible car " + e);
            return false;
        }

    }

    // Méthode pour retirer un élément de la pile. Lance une exception si la pile est vide.
    @Override
    public E pop(boolean one) {
        if (isEmpty(one)) {
            throw new IllegalStateException("La pile " + (one ? "1" : "2") + " est vide.");
        }
        E result = one ? elements[top1--] : elements[top2++];
        if (one) {
            elements[top1 + 1] = null;
        } else {
            elements[top2 - 1] = null;
        }
        return result;
    }

    // Méthode pour obtenir l'élément au sommet de la pile. Lance une exception si la pile est vide.
    @Override
    public E top(boolean one) {
        if (isEmpty(one)) {
            throw new IllegalStateException("La pile " + (one ? "1" : "2") + " est vide.");
        }
        return one ? elements[top1] : elements[top2];
    }

    // Méthode pour obtenir la taille actuelle de la pile.
    @Override
    public int size(boolean one) {
        return one ? top1 + 1 : maxSize - top2;
    }

    // Méthode pour vérifier si la pile est pleine.
    @Override
    public boolean isFull() {
        return top1 + 1 == top2;
    }

    // Méthode pour vérifier si la pile est vide.
    public boolean isEmpty(boolean one) {
        return one && top1 == -1 || !one && top2 == maxSize;
    }

    // Méthode pour imprimer le contenu des deux piles.
    @Override
    public void print() {
        StringBuilder sb = new StringBuilder();
        sb.append("Contenu de la pile 1 :\n[");
        for (int i = top1; i >= 0; i--) {
            sb.append(elements[i]);
            if (i > 0) {
                sb.append(", ");
            }
        }
        sb.append("]\nContenu de la pile 2 :\n[");
        for (int i = top2; i < maxSize; i++) {
            sb.append(elements[i]);
            if (i < maxSize - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        System.out.println(sb);
    }

}


