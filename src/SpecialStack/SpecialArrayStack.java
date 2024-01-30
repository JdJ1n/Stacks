//IFT2015_TP1
//Jiadong Jin 20150692
package SpecialStack;

public class SpecialArrayStack<E extends Comparable<E>> implements SpecialStack<E> {
    private E[] elements;
    private int top;
    private int max;  // Ceci est un pointeur vers le point de convexité.
    private static final int maxSize = 100;

    public SpecialArrayStack() {
        elements = (E[]) new Comparable[maxSize];
        top = -1;
        max = maxSize;
    }

    // Ceci est la méthode isLatestMaximaTheLargest qui vérifie
    // si le dernier point de convexité est le plus grand parmi tous les points de convexité enregistrés.
    public boolean isLatestMaximaTheLargest() {
        return (top > 1 && elements[top].compareTo(elements[top - 1]) < 0 && elements[max].compareTo(elements[top - 1]) < 0);
    }

    // Ceci est la méthode push qui ajoute un élément à la pile.
    public void push(E element) {
        if (isFull()) {
            throw new IllegalStateException("La pile est pleine.");  // Si la pile est pleine, une exception est levée.
        }
        if (isEmpty()) {
            elements[++top] = element;
            elements[--max] = element;
        } else {
            //Si l’élément précédent est un maximum local et qu’il est plus grand que tous les maximums enregistrés
            // alors il est également stocké dans la pile max.
            if (isLatestMaximaTheLargest()) {
                elements[--max] = elements[top - 1];
            }
            elements[++top] = element;
        }
    }

    // Ceci est la méthode pop qui retire un élément de la pile.
    public E pop() {
        if (isEmpty()) {
            throw new IllegalStateException("La pile est vide.");  // Si la pile est vide, une exception est levée.
        }
        E result = elements[top--];
        //Si l’élément qui va être désempilé est l’élément suivant du maximum enregistré
        //alors un élément est également désempilé de la pile max, car après cette opération de désempilage
        //le maximum deviendra l’élément au sommet de la pile
        //il n’est donc pas nécessaire de continuer à le stocker dans la pile max.
        if (isLatestMaximaTheLargest()) {
            elements[++max] = null;
        }
        elements[top + 1] = null;
        return result;
    }

    public E top() {
        if (isEmpty()) {
            throw new IllegalStateException("La pile est vide.");  // Si la pile est vide, une exception est levée.
        }
        return elements[top];
    }

    public int size() {
        return top + 1;
    }

    public boolean isFull() {
        return top + 1 == max;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = top; i >= 0; i--) {
            sb.append(elements[i].toString());
            if (i > 0) {
                sb.append(", ");
            }
        }
        sb.append("\nEspace pour le stockage des valeurs maximales:" + String.valueOf(maxSize - max));
        return sb.toString();
    }

    // Ceci est la méthode getMax qui renvoie l'élément maximum de la pile.
    public E getMax() {
        if (isEmpty()) {
            throw new IllegalStateException("La pile est vide.");
        }
        return elements[top].compareTo(elements[max]) < 0 ? elements[max] : elements[top];
    }
}


