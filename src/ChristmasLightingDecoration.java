package src;
public class ChristmasLightingDecoration extends LightGridImplementation {
    private LightGridImplementation lightGrid;

    public ChristmasLightingDecoration(int size) {
        super(size);
    }

    public void turnOnLights(int x1, int y1, int x2, int y2) {

        lightGrid.turnOn(x1, y1, x2, y2);
    }

    public void turnOffLights(int x1, int y1, int x2, int y2) {

        lightGrid.turnOff(x1, y1, x2, y2);
    }

    public void toggleLights(int x1, int y1, int x2, int y2) {

        lightGrid.toggle(x1, y1, x2, y2);
    }

    public boolean isLit(int x, int y) {

        return lightGrid.isLit(x, y);
    }

}
