package JavaAssignment7.part5;

public class SecondClass {
    public SecondClass() {
        System.out.println("Second Outer Class");
    }
    public class SecondInnerClass extends FirstClass.FirstInnerClass {
        public SecondInnerClass() {
            new FirstClass().super("First Inner Class");
            System.out.println("Second Inner Class");
        }

    }
}
