public class LightsController {
    public static void main(String[] args) {
        LightGrid lightGrid = new LightGridImplementation(1000);
        LightCountImplementation lightCounter = new LightCountImplementation();

        lightGrid.turnOn(887, 9, 959, 629);
        lightGrid.turnOn(454, 398, 844, 448);
        lightGrid.turnOff(539, 243, 559, 965);
        lightGrid.turnOff(370, 819, 676, 868);
        lightGrid.turnOff(145, 40, 370, 997);
        lightGrid.turnOff(301, 3, 808, 453);
        lightGrid.turnOn(351, 678, 951, 908);
        lightGrid.toggle(720, 196, 897, 994);
        lightGrid.toggle(831, 394, 904, 860);

        boolean[][] grid = ((LightGridImplementation) lightGrid).getGrid();
        int litLights = lightCounter.countLitLights(grid);
        System.out.println("Number of lit lights: " + litLights);
    }
}