//IFT2015_TP1
//Jiadong Jin 20150692
package SpecialStack;

public class SpecialArrayStack implements SpecialStack<Integer> {
    private Integer[] elements;
    private int top; // L'indice du sommet de la pile
    private Integer max; // L'élément maximum dans la pile
    private static final int maxSize = 100;

    // Le constructeur de la pile
    public SpecialArrayStack() {
        elements = new Integer[maxSize];
        top = -1;
    }

    // La méthode pour ajouter un élément à la pile
    @Override
    public void push(Integer element) {
        if (isFull()) {
            throw new IllegalStateException("La pile est pleine.");  // Si la pile est pleine, une exception est levée.
        }
        // Si la pile est vide, ajoute l'élément au sommet de la pile et met à jour le maximum
        if (isEmpty()) {
            elements[++top] = element;
            max = element;
        } else {
            // Si l'élément est plus grand que le maximum actuel, stocke une valeur spéciale et met à jour le maximum
            if (max < element) {
                elements[++top] = 2 * element - max;
                max = element;
            } else {
                // Sinon, ajoute simplement l'élément au sommet de la pile
                elements[++top] = element;
            }
        }
    }

    // La méthode pour retirer un élément de la pile
    @Override
    public Integer pop() {
        if (isEmpty()) {
            throw new IllegalStateException("La pile est vide.");  // Si la pile est vide, une exception est levée.
        }
        // Récupère l'élément au sommet de la pile
        Integer result = elements[top--];
        elements[top + 1] = null; // Supprime l'élément
        // Si l'élément est une valeur spéciale, récupère la valeur réelle et met à jour le maximum
        if (result > max) {
            Integer realTop = max;
            max = 2 * max - result;
            return realTop;
        } else {
            // Sinon, retourne simplement l'élément
            return result;
        }
    }

    // La méthode pour obtenir l'élément au sommet de la pile sans le retirer
    @Override
    public Integer top() {
        if (isEmpty()) {
            throw new IllegalStateException("La pile est vide.");  // Si la pile est vide, une exception est levée.
        }
        // Si l'élément au sommet est une valeur spéciale, retourne la valeur réelle, sinon retourne l'élément
        return (elements[top] > max) ? max : elements[top];
    }

    // La méthode pour obtenir la taille de la pile
    @Override
    public int size() {
        return top + 1;
    }

    // La méthode pour vérifier si la pile est pleine
    @Override
    public boolean isFull() {
        return top + 1 == maxSize;
    }

    // La méthode pour vérifier si la pile est vide
    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    // La méthode pour convertir la pile en une chaîne de caractères
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Integer currentMax = max; // Le maximum actuel pour la conversion des valeurs spéciales
        for (int i = top; i >= 0; i--) {
            Integer rawElement = elements[i]; // L'élément brut dans le tableau
            Integer element; // L'élément à ajouter à la chaîne de caractères
            // Si l'élément brut est une valeur spéciale, convertit en valeur réelle et met à jour le maximum actuel
            if (rawElement > currentMax) {
                element = currentMax;
                currentMax = 2 * currentMax - rawElement;
            } else {
                // Sinon, utilise simplement l'élément brut
                element = rawElement;
            }
            sb.append(element);
            if (i > 0) {
                sb.append(", ");
            }
        }
        return "[" + sb + "]"; //
    }

    // La méthode pour obtenir l'élément maximum de la pile
    public Integer getMax() {
        if (isEmpty()) {
            throw new IllegalStateException("La pile est vide."); // Si la pile est vide, une exception est levée.
        }
        return max;
    }
}



