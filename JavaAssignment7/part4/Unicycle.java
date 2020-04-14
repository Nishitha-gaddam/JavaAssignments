package JavaAssignment7.part4;

public class Unicycle implements Cycle {
    public Unicycle() {
        System.out.println("is inside unicycle class");
    }

    @Override
    public void noOfWheels() {
        System.out.println("has 1 wheel");

    }

    @Override
    public void colourOfCycle(String colour) {
        System.out.println("the colour of unicycle is "+colour);

    }
}
