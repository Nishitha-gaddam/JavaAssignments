package JavaAssignment7.part5;

import static java.awt.SystemColor.info;

public class FirstClass {
    public FirstClass() {
        System.out.println("First Outer Class");
    }
    public class FirstInnerClass {
        public FirstInnerClass(String input) {
            System.out.println(input);
        }
    }
}