package JavaAssignment7.part4;

public class Bicycle implements Cycle {
    public Bicycle() {
        System.out.println("is inside bicycle class");
    }

    @Override
    public void noOfWheels() {
        System.out.println("has 2 wheels");

    }

    @Override
    public void colourOfCycle(String colour) {
        System.out.println("the colour of bicycle is "+colour);

    }
}
