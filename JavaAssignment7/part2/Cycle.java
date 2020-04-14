package JavaAssignment7.part2;

public class Cycle {
    public Cycle(){
        System.out.println("Cycle class");
    }


}
class UniCycle extends Cycle{
    public UniCycle(){
        System.out.println("UniCycle class");
    }
    public void balance() {
        System.out.println("Balancing the UniCycle");
    }

}
class Bicycle extends Cycle{
    public Bicycle(){
        System.out.println("bicycle class");
    }
    public void balance() {
        System.out.println("Balancing the Bicycle");
    }


}
class TriCycle extends Cycle{
    public TriCycle(){
        System.out.println("TriCycle class");
    }

}

