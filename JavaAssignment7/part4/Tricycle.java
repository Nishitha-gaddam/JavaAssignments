package JavaAssignment7.part4;

public class Tricycle implements Cycle {
    public Tricycle() {
        System.out.println("is inside tricycle class");
    }

    @Override
    public void noOfWheels() {
        System.out.println("has 3 wheels");

    }

    @Override
    public void colourOfCycle(String colour) {
        System.out.println("the colour of tricycle is "+colour);

    }
}
