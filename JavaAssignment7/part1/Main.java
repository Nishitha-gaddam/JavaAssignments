package JavaAssignment7.part1;

import JavaAssignment7.part1.Hamster;
import JavaAssignment7.part1.Mouse;
import JavaAssignment7.part1.Rodent;

public class Main {
    public static void main(String args) {
        // array of Rodent, filled  with different specific types of Rodent
        Rodent[] rodents = new Rodent[3];
        rodents[0] = new Mouse();
        rodents[1] = new Hamster();
        //prints the characteristics of the different types of rodents
        for (Rodent r : rodents) {
            r.foodConsumed();
            r.apperance();
        }

    }
}
