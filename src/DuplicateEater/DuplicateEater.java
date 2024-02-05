//IFT2015_TP1
//Jiadong Jin 20150692
package DuplicateEater;

public class DuplicateEater {

    public static int pairDestroyer(String[] words) {
        Stack<String> record = new ArrayStack<String>();
        for (String word : words) {
            if (!record.isEmpty() && record.top().equals(word)) {
                record.pop();
            } else {
                record.push(word);
            }
        }
        return record.size();
    }

    public static void main(String[] args) {
        String[] words1 = {"pile", "liste", "liste", "file", "arbre"};
        System.out.println(pairDestroyer(words1)); // 3

        String[] words2 = {"arbre", "pile", "pile", "arbre"};
        System.out.println(pairDestroyer(words2)); // 0
    }
}


