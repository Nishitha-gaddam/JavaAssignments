public class ChristmasLightingDecoration implements LightGrid {
    private LightGrid lightGrid;

    public ChristmasLightingDecoration(LightGrid lightGrid) {
        this.lightGrid = lightGrid;
    }

    @Override
    public void turnOn(int x1, int y1, int x2, int y2) {
        lightGrid.turnOn(x1, y1, x2, y2);
    }

    @Override
    public void turnOff(int x1, int y1, int x2, int y2) {
        lightGrid.turnOff(x1, y1, x2, y2);
    }

    @Override
    public void toggle(int x1, int y1, int x2, int y2) {
        lightGrid.toggle(x1, y1, x2, y2);
    }

    @Override
    public boolean isLit(int x, int y) {
        return lightGrid.isLit(x, y);
    }

}
