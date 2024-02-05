//IFT2015_TP1
//Jiadong Jin 20150692
package MovingDay;

public class MovingDay {
    // Création de trois piles pour représenter les villes de Nam, Pam et Sam
    Stack<String> pam = new ArrayStack<String>();
    Stack<String> sam = new ArrayStack<String>();
    Stack<String> nam = new ArrayStack<String>();

    public MovingDay() {
        // Initialisation de la ville de Nam avec les différentes sections
        nam.push("N5: Le Roi");
        nam.push("N4: Gouvernement");
        nam.push("N3: Académie");
        nam.push("N2: Manufacture");
        nam.push("N1: Agriculture");
    }

    public void move() {
        int day = 0; // Compteur de jours
        // Tant que la ville de Nam n'est pas vide, on déplace une section par jour vers Pam
        while (!nam.isEmpty()) {
            pam.push(nam.pop());
            day++;
            print(day); // Affichage de l'état actuel
        }
        // Ensuite, tant que la ville de Pam n'est pas vide, on déplace une section par jour vers Sam
        while (!pam.isEmpty()) {
            sam.push(pam.pop());
            day++;
            print(day); // Affichage de l'état actuel
        }
        // À la fin, on affiche si le déplacement est possible en 10 jours et combien de jours sont nécessaires
        System.out.println("Il est " + (day <= 10 ? "POSSIBLE" : "NON POSSIBLE")
                + " de déplacer la ville dans les 10 jours, car on utilise " + day + " jours.");
    }

    public void print(int day) {
        // Cette méthode affiche l'état actuel des trois villes pour un jour donné
        System.out.println("Jour " + day + " : Nam " + nam + ", Pam " + pam + ", Sam " + sam);
    }
}

