package src;

public class LightBrightnessCounterImplementation implements LightBrightnessCounter {
    @Override
    public int calculateTotalBrightness(boolean[][] grid) {
        int totalBrightness = 0;
        for (boolean[] row : grid) {
            for (boolean light : row) {
                if (light) {
                    totalBrightness++;
                }
            }
        }
        return totalBrightness;
    }
}