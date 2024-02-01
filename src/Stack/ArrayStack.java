//IFT2015_TP1
//Jiadong Jin 20150692
package Stack;

public class ArrayStack<E> implements Stack<E> {
    private E[] elements;
    private int size;
    private static final int maxSize = 100;

    // Constructeur par défaut
    @SuppressWarnings(value = "unchecked")
    public ArrayStack() {
        elements = (E[]) new Object[maxSize];
        this.size = 0;
    }

    // Méthode pour ajouter un élément à la pile. Lance une exception si la pile est pleine.
    // Vérifie également si l'élément entrant est null et lance une exception si c'est le cas.
    public void push(E element) {
        if (element == null) {
            throw new IllegalArgumentException("L'élément ne peut pas être null.");
        }
        if (size == elements.length) {
            throw new IllegalStateException("La pile est pleine.");
        }
        elements[size++] = element;
    }

    // Méthode pour retirer un élément de la pile. Lance une exception si la pile est vide.
    public E pop() {
        if (isEmpty()) {
            throw new IllegalStateException("La pile est vide.");
        }
        E result = elements[--size];
        elements[size] = null;
        return result;
    }

    // Méthode pour obtenir l'élément au sommet de la pile. Lance une exception si la pile est vide.
    public E top() {
        if (isEmpty()) {
            throw new IllegalStateException("La pile est vide.");
        }
        return elements[size - 1];
    }

    // Méthode pour vérifier si la pile est vide.
    public boolean isEmpty() {
        return size == 0;
    }

    // Méthode pour obtenir la taille actuelle de la pile.
    public int size() {
        return size;
    }

    // Méthode pour obtenir une représentation en chaîne de la pile avec des éléments de haut en bas.
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = size - 1; i >= 0; i--) {
            sb.append(elements[i].toString());
            if (i > 0) {
                sb.append(", ");
            }
        }
        return "[" + sb + "]";
    }
}


