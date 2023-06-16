package src;
public class LightsController {
    public static void main(String[] args) {
        ChristmasLightingDecoration lightGrid = new ChristmasLightingDecoration(1000);
        LightCountImplementation lightCounter = new LightCountImplementation();
        ChristmasLightingBrightness brightness = new ChristmasLightingBrightness(1000);
        LightBrightnessCounterImplementation brightnessCounter = new LightBrightnessCounterImplementation();


        lightGrid.turnOnLights(887, 9, 959, 629);
        lightGrid.turnOnLights(454, 398, 844, 448);
        lightGrid.turnOffLights(539, 243, 559, 965);
        lightGrid.turnOffLights(370, 819, 676, 868);
        lightGrid.turnOffLights(145, 40, 370, 997);
        lightGrid.turnOffLights(301, 3, 808, 453);
        lightGrid.turnOnLights(351, 678, 951, 908);
        lightGrid.toggleLights(720, 196, 897, 994);
        lightGrid.toggleLights(831, 394, 904, 860);

        brightness.increaseLightsBrightness(887, 9, 959, 629);
        brightness.decreaseBrightness(454, 398, 844, 448);

        boolean[][] grid = ((ChristmasLightingDecoration) lightGrid).getGrid();
        int litLights = lightCounter.countLitLights(grid);
        int totalBrightness = brightnessCounter.calculateTotalBrightness(grid);

        System.out.println("Number of lit lights: " + litLights);
        System.out.println("Total brightness of all lights combined: " + totalBrightness);
    }
}