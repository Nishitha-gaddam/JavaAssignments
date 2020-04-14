package JavaAssignment7.part2;

import JavaAssignment7.part2.Bicycle;
import JavaAssignment7.part2.Cycle;
import JavaAssignment7.part2.TriCycle;
import JavaAssignment7.part2.UniCycle;

public class CycleMain {
    public static void main(String[] args) {
        UniCycle unicycle = new UniCycle();
        Bicycle bicycle = new Bicycle();
        TriCycle tricycle = new TriCycle();

        Cycle[] cycle = new Cycle[3];
        //Upcasting
        cycle[0] = (Cycle) unicycle;
        cycle[1] = (Cycle) bicycle;
        cycle[2] = (Cycle) tricycle;

        for (Cycle c : cycle) {

//            cycle.balance();
//            This method will result in error because the Cycle class does not have balance() method
        }

        Cycle c1 = new UniCycle();
        Cycle c2 = new Bicycle();
        Cycle c3 = new TriCycle();
        //Downcasting
        UniCycle u = (UniCycle) c1;
        Bicycle b = (Bicycle) c2;
        TriCycle t = (TriCycle) c3;

        u.balance();
        b.balance();
//        t.balance();
        //The above method call gives a compile time error as Tricycle does not have a balance() method.

    }
}
