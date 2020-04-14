package JavaAssignment7.part4;

public class main {
    public static void main(String[] args) {
        UnicycleFactory uniFactory = new UnicycleFactory();
        BicycleFactory biFactory = new BicycleFactory();
        TricycleFactory triFactory = new TricycleFactory();
        uniFactory.buildUnicycle();
        biFactory.buildBicycle();
        triFactory.buildTricycle();
    }
}
