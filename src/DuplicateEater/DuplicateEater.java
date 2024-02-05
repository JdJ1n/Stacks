//IFT2015_TP1
//Jiadong Jin 20150692
package DuplicateEater;

public class DuplicateEater<E> {
    // La méthode pairDestroyer prend un tableau générique en entrée
    public int pairDestroyer(E[] input) {
        // Création d'une pile pour enregistrer les mots
        Stack<E> record = new ArrayStack<E>();
        // Parcourir tous les mots dans le tableau
        for (E word : input) {
            // Si la pile n'est pas vide et que le mot en haut de la pile est le même que le mot actuel
            if (!record.isEmpty() && record.top().equals(word)) {
                // Supprimer le mot en haut de la pile
                record.pop();
            } else {
                // Sinon, ajouter le mot actuel à la pile
                record.push(word);
            }
        }
        // Retourner le nombre de mots restants dans la pile
        return record.size();
    }

    public static void main(String[] args) {
        // Création de deux tableaux de mots
        String[] words1 = {"pile", "liste", "liste", "file", "arbre"};
        String[] words2 = {"arbre", "pile", "pile", "arbre"};
        // Création d'un objet de la classe DuplicateEater
        DuplicateEater<String> duplicateEater = new DuplicateEater<String>();
        // Appeler la méthode pairDestroyer et imprimer le nombre de mots restants
        System.out.println(duplicateEater.pairDestroyer(words1)); // 3
        System.out.println(duplicateEater.pairDestroyer(words2)); // 0
        System.out.println(duplicateEater.pairDestroyer(args));
    }

}




