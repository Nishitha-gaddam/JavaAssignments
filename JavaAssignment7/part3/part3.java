package JavaAssignment7.part3;

  interface IOne {
    public void method1();
    public void method2();
}
interface ITwo {
    public void method3();
    public void method4();
}
interface IThree {
    public void method5();
    public void method6();
}
interface IFour extends IOne, ITwo, IThree {
      public void method7();
}
class BaseClass {
    public void baseClassMethod() {
        System.out.println("inside the  baseClass method");
    }
}
 class Derived extends BaseClass implements IFour {

    @Override
    public void method1() {
        System.out.println("This is method 1");
    }

    @Override
    public void method2() {
        System.out.println("This is method 2");
    }

    @Override
    public void method3() {
        System.out.println("This is method 3");
    }

    @Override
    public void method4() {
        System.out.println("This is method 4");
    }

    @Override
    public void method5() {
        System.out.println("This is method 5");
    }

    @Override
    public void method6() {
        System.out.println("This is method 6");
    }

    @Override
    public void method7() {
        System.out.println("This is method 7");
    }


}

public class part3 {
    public static void main(String[] args) {
        Derived derived = new Derived();
        derived.baseClassMethod();

    }
}
