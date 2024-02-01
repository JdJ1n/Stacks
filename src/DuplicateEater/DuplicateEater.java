//IFT2015_TP1
//Jiadong Jin 20150692
package DuplicateEater;

import java.util.ArrayDeque;
import java.util.Deque;

public class DuplicateEater {

    public static int pairDestroyer(String[] words) {
        Deque<String> stack = new ArrayDeque<>();
        for (String word : words) {
            if (!stack.isEmpty() && stack.peek().equals(word)) {
                stack.pop();
            } else {
                stack.push(word);
            }
        }
        return stack.size();
    }

    public static void main(String[] args) {
        String[] words1 = {"pile", "liste", "liste", "file", "arbre"};
        System.out.println(pairDestroyer(words1)); // Affiche 3

        String[] words2 = {"arbre", "pile", "pile", "arbre"};
        System.out.println(pairDestroyer(words2)); // Affiche 0
    }
}

