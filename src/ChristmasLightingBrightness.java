package src;
public class ChristmasLightingBrightness extends LightBrightnessImplementation {
    private LightBrightnessImplementation BrightnessGrid;

    public ChristmasLightingBrightness(int size) {
        super(size);
    }

    public void increaseLightsBrightness(int x1, int y1, int x2, int y2) {
        BrightnessGrid.increaseBrightness(x1, y1, x2, y2);
    }

    public void decreaseLightsBrightness(int x1, int y1, int x2, int y2) {
        BrightnessGrid.decreaseBrightness(x1, y1, x2, y2);
    }

}
