//IFT2015_TP1
//Jiadong Jin 20150692
package DuplicateEater;

public class DuplicateEater {

    // La méthode pairDestroyer prend un tableau de chaînes de caractères en entrée
    public static int pairDestroyer(String[] words) {
        // Création d'une pile pour enregistrer les mots
        Stack<String> record = new ArrayStack<String>();
        // Parcourir tous les mots dans le tableau
        for (String word : words) {
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
        // Appeler la méthode pairDestroyer et imprimer le nombre de mots restants
        System.out.println(pairDestroyer(words1)); // 3
        String[] words2 = {"arbre", "pile", "pile", "arbre"};
        System.out.println(pairDestroyer(words2)); // 0
    }
}



