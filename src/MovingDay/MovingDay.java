//IFT2015_TP1
//Jiadong Jin 20150692
package MovingDay;

import java.util.Stack;

public class MovingDay {
    Stack<String> nam = new Stack<>();
    Stack<String> pam = new Stack<>();
    Stack<String> sam = new Stack<>();

    public MovingDay() {
        // Initialiser la ville de Nam
        nam.push("N 5: Le Roi");
        nam.push("N 4: Gouvernement");
        nam.push("N 3: Académie");
        nam.push("N 2: Manufacture");
        nam.push("N 1: Agriculture");
    }

    public void move() {
        int day = 0;
        while (!nam.isEmpty()) {
            pam.push(nam.pop());
            day++;
            print(day);
        }
        while (!pam.isEmpty()) {
            sam.push(pam.pop());
            day++;
            print(day);
        }
        System.out.println("Il est " + (day <= 10 ? "POSSIBLE" : "NON POSSIBLE") + " de déplacer la ville dans les 10 jours, car " + day + " jours sont nécessaires.");
    }

    public void print(int day) {
        System.out.println("Jour " + day + " : Nam " + nam + ", Pam " + pam + ", Sam " + sam);
    }
}
