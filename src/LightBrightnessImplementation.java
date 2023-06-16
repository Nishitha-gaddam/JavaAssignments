package src;

public class LightBrightnessImplementation implements LightBrightness{

    private int[][] brightness;

    public LightBrightnessImplementation(int size) {
        brightness = new int[size][size];
    }
    @Override
    public void increaseBrightness(int x1, int y1, int x2, int y2) {
        for (int x = x1; x <= x2; x++) {
            for (int y = y1; y <= y2; y++) {
                brightness[x][y]++;
            }
        }
    }

    @Override
    public void decreaseBrightness(int x1, int y1, int x2, int y2) {
        for (int x = x1; x <= x2; x++) {
            for (int y = y1; y <= y2; y++) {
                brightness[x][y] = Math.max(brightness[x][y] - 1, 0);
            }
        }
    }
}
